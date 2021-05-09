package br.com.isfconsult.labs.zipkin.zipkinapp3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@AllArgsConstructor
class ZipkinApp3Controller {

    RestTemplate restTemplate;

    @GetMapping(value = "/zipkin3")
    public String zipkinService3() {
        log.info("Inside zipkinService 3.. finish");

        return "zipkinService3 --> finish";
    }
}
