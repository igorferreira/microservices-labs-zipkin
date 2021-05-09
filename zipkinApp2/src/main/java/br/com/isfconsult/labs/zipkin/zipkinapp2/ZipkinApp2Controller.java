package br.com.isfconsult.labs.zipkin.zipkinapp2;

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
class ZipkinApp2Controller{

    RestTemplate restTemplate;

    @GetMapping(value="/zipkin2")
    public String zipkinService2()
    {
        log.info("Inside zipkinService 2.. call zipkinService 3");

        String response = (String) restTemplate.exchange("http://localhost:8083/zipkin3", HttpMethod.GET, null,
                new ParameterizedTypeReference<String>() {
                }).getBody();
        return " zipkinService2 --> " + response;
    }

}
