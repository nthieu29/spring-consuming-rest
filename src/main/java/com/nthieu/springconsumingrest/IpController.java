package com.nthieu.springconsumingrest;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@RestController
@RequestMapping("ip")
@AllArgsConstructor
public class IpController {

    private final RestTemplate restTemplate;

    @GetMapping
    public String getIp() {
        return restTemplate.getForObject(URI.create("https://api.ipify.org"), String.class);
    }
}
