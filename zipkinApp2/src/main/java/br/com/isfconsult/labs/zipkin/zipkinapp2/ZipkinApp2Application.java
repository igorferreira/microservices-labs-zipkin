package br.com.isfconsult.labs.zipkin.zipkinapp2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ZipkinApp2Application {

	@Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

	public static void main(String[] args) {
		SpringApplication.run(ZipkinApp2Application.class, args);
	}

}
