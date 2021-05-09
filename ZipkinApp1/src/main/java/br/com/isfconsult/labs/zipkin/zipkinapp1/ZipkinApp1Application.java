package br.com.isfconsult.labs.zipkin.zipkinapp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ZipkinApp1Application {

	@Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

	public static void main(String[] args) {
		SpringApplication.run(ZipkinApp1Application.class, args);
	}

}
