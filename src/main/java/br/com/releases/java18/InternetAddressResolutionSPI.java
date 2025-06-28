package br.com.releases.java18;

// Explicação:
// A JEP 418 introduziu uma nova API chamada InetAddressResolverProvider para
// permitir a personalização da resolução de nomes de domínio (DNS) no Java.
// Isso é útil, por exemplo, para usar um resolvedor DNS alternativo, como DNS
// sobre HTTPS (DoH), ou para testes com DNS personalizados.

import java.net.UnknownHostException;
import java.net.InetAddress;

public class InternetAddressResolutionSPI {

    public InetAddress resolveAddress() {
        String host = "www.google.com";
        InetAddress endereco = null;
        try {
            endereco = InetAddress.getByName(host);
        } catch (UnknownHostException e) {
            System.out.println("Host não encontrado: " + e.getMessage());
        }

        System.out.println("Host: " + host);
        System.out.println("Endereço IP: " + endereco.getHostAddress());
        return endereco;
    }
}
