package com.hcy308.httpbin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HttpbinApplication {

    public static void main(String[] args) {
        SpringApplication.run(HttpbinApplication.class, args);
    }


    @GetMapping("/")
    public String home() {
        return "Http bin sweet home ^_^~~";
    }


    @GetMapping("/ip")
    public String ip() {
        return "TODO: get ip from http://httpbin.org/ip";
    }

}

