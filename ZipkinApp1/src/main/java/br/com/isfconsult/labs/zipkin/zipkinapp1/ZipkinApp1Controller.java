package br.com.isfconsult.labs.zipkin.zipkinapp1;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@AllArgsConstructor
class ZipkinApp1Controller{

    RestTemplate restTemplate;

    @GetMapping(value="/zipkin")
    public String zipkinService1()
    {
        log.info("Inside zipkinService 1.. call zipkinService 2");

        String response = (String) restTemplate.exchange("http://localhost:8082/zipkin2", HttpMethod.GET, null,
                new ParameterizedTypeReference<String>() {
                }).getBody();
        return "zipkinService 1 --> " + response;
    }
}
