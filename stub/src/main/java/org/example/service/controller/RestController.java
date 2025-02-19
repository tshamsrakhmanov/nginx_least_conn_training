package org.example.service.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;


@org.springframework.web.bind.annotation.RestController
public class RestController {

    private final Logger log = LoggerFactory.getLogger(RestController.class);

    @Value("${custom.response}")
    Integer custom_response;

    @GetMapping(value = "/hello")
    public String hello() throws InterruptedException {
        log.info(" *** REST *** GET received, begin wait for:{} ms", custom_response.toString());
        Thread.sleep(custom_response);
        log.info(" *** REST *** GET answer, return answer");
        return "SUCCESS!";
    }
}
