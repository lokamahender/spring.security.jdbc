package io.spring.security.jdbc.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {

    @GetMapping("/")
    public String home(){
        return "You are in Home Screen";
    }

    @GetMapping("/user")
    public String user(){
        return "You are in User Home Screen";
    }

    @GetMapping("/admin")
    public String admin(){
        return "You are in Admin Home Screen";
    }
}
