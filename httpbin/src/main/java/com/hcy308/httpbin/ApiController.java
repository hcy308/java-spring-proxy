package com.hcy308.httpbin;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URL;

@RestController
@RequestMapping("/rest/api/1/")
public class ApiController {

    private ObjectMapper mapper = new ObjectMapper();


    @GetMapping("/ip")
    public IpValue ip() throws Exception {
        return mapper.readValue(new URL("http://httpbin.org/ip"), IpValue.class);
    }


}
