package br.com.releases.java11;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

//Explanation
//Java 11 introduced a new HTTP Client API in the java.net.http package,
//fully supporting HTTP/2. This API offers features like asynchronous handling
//of responses, reactive bodies, and automatic downgrading to HTTP/1.1
//if the server doesn't support HTTP/2.
//
//The HttpClient is the main class for sending requests. It can be created
//using a builder, allowing for configuration of various settings such as
//timeouts, proxies, and SSL context. By default, the client attempts to
//use HTTP/2, falling back to HTTP/1.1 if necessary.

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
