package org.example.service.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@org.springframework.web.bind.annotation.RestController
public class RestController {

    private final Logger log = LoggerFactory.getLogger(RestController.class);

    @Value("${custom.response}")
    private Integer custom_response;

    @GetMapping(value = "/hello")
    public String hello() throws InterruptedException {
        log.info(" *** REST *** GET received, begin wait for:" + custom_response.toString() + " ms" );
        Thread.sleep(custom_response);
        log.info(" *** REST *** GET answer, return answer");
        return "SUCCESS!";
    }
}
