package br.com.treinamentos.diversos.releases.java11;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;

import static org.junit.jupiter.api.Assertions.*;

class Http_2ClientAPITest {

    @Test
    void getHttp2ClientAPI() {
        Http_2ClientAPI http2ClientAPI = new Http_2ClientAPI();

        assertEquals(HttpStatus.OK.value(), http2ClientAPI.getHttp2ClientAPI());
    }
}