package org.example.service.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


@org.springframework.web.bind.annotation.RestController
public class RestController {

    private final Logger log = LoggerFactory.getLogger(RestController.class);

    @GetMapping(value = "/hello")
    public String hello() {

        log.info(" *** RESULT *** Hello");
        return "SUCCESS!";
    }
}
