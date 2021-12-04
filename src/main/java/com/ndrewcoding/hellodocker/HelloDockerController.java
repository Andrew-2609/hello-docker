package com.ndrewcoding.hellodocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-docker")
public class HelloDockerController {

    @GetMapping
    public HelloDocker greeting() {
        String hostName = System.getenv("HOSTNAME");

        return new HelloDocker("Hello, Docker!", hostName);
    }

}
