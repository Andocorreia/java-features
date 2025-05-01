package br.com.treinamentos.diversos.java11;

import org.springframework.http.HttpStatus;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

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
