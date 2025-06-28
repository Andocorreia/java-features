package br.com.releases.java11;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

// Explicação
// A HTTP Client API moderna foi introduzida no Java 9 como um módulo incubador
// e estabilizada no Java 11 no pacote java.net.http. Ela substitui a antiga
// HttpURLConnection e oferece suporte completo ao HTTP/2, além de ser mais fluente,
// moderna e fácil de usar

// Vantagens do novo HTTP Client
// Suporte nativo ao HTTP/2 (com multiplexação de conexões).
// Requisições síncronas e assíncronas com CompletableFuture.
// Imutabilidade e segurança para múltiplas threads.
// Suporte a WebSockets e redirecionamentos automáticos.
// Compressão de cabeçalhos com HPACK (HTTP/2).

public class Http_2ClientAPI {
    private String url = "https://www.casadocodigo.com.br/";
    public Integer getHttp2ClientAPI() {
        HttpClient client = HttpClient.newHttpClient();
        try {
            HttpRequest request = HttpRequest.newBuilder(new URI(this.url)).GET().build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("Response code: " + response.statusCode());
            System.out.println("Response Body:" + response.body());
            System.out.println("Response Version:" + response.version());

            return response.statusCode();
        }catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }
}
