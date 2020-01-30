package com.microsoft.azure.springsecuritywebapp;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;


@RestController
public class UserController {

    @RequestMapping("/user")
    public Principal user(Principal principal) {
        return principal;
    }
}
