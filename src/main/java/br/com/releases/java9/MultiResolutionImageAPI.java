package br.com.releases.java9;

import java.awt.*;
import java.awt.image.*;
import java.io.IOException;
import java.util.List;
import javax.imageio.ImageIO;

//Explanation
// The Multi-Resolution Image API allows applications to handle images with multiple resolutions.
// This is particularly useful for applications that need to display images on devices with different screen resolutions.
// The API provides a way to create and manage multi-resolution images, allowing developers to
// specify different resolutions for the same image, which can improve performance and visual quality on high-resolution displays.
public class MultiResolutionImageAPI {
    public Image imagem(int destinationWidth, int destinationHeigh) throws IOException {
        // Carrega imagens em diferentes resoluções
        BufferedImage lowRes = ImageIO.read(getClass().getResourceAsStream("/images/low_res.png"));
        BufferedImage highRes = ImageIO.read(getClass().getResourceAsStream("/images/high_res.png"));

        // Cria uma imagem multi-resolução
        MultiResolutionImage multiResImage = new BaseMultiResolutionImage(lowRes, highRes);

        // Obtém todas as resoluções disponíveis
        List<Image> resolutionVariants = multiResImage.getResolutionVariants();
        System.out.println("Resoluções disponíveis:");

        resolutionVariants.stream().forEach(img -> System.out.println(" - " + img.getWidth(null) + "x" + img.getHeight(null)));

        // Obtém a imagem mais apropriada para uma determinada dimensão
        Image bestFit = multiResImage.getResolutionVariant(destinationWidth, destinationHeigh);
        System.out.println("Melhor imagem para " + destinationWidth + "x" + destinationHeigh + ": " + bestFit.getWidth(null)
                + "x" + bestFit.getHeight(null));

        return bestFit;
    }
}
