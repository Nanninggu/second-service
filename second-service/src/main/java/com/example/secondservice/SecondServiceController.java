package com.example.secondservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/second-service")
@Slf4j
public class SecondServiceController {
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to the Second Service.";

    }

    @GetMapping("/message")
    //메세지라는 메소드가 실행됨에 있어서 "first-request" 헤더값을 받아오고, 그 값이 header안에 저장이 된다.
    public String message(@RequestHeader("Second-request") String header) {
        log.info(header);
        return "Hello World in Second Service.";
    }
    @GetMapping("/check")
    public String check() {
        return "Hi, there. This is a message from Second Service";
    }
}
