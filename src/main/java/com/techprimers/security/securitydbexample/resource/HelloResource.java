package com.techprimers.security.securitydbexample.resource;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@CrossOrigin(value = "http://localhost:4200", maxAge = 3600)
@RestController
public class HelloResource {

    @GetMapping("/user")
    @ResponseBody
    public Principal user(Principal user) {
        return user;
    }

    @GetMapping("/all")
    public String hello() {
        return "Hello Youtube";
    }

    @PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping("/secured/all")
    public String securedHello() {
        return "Secured Hello";
    }

    @GetMapping("/secured/alternate")
    public String alternate() {
        return "alternate";
    }
}
