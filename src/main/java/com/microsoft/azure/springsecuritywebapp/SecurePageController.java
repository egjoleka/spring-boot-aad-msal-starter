// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.microsoft.azure.springsecuritywebapp;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;

@Controller
public class SecurePageController {

    @RequestMapping("/secure_page")
    public ModelAndView securePage(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        authentication.getPrincipal();
//        ((OAuth2Authentication) authentication).userAuthentication.getDetails()
        ModelAndView mav = new ModelAndView("secure_page");

        return mav;
    }

    @RequestMapping("/")
    public ModelAndView indexPage() {
        ModelAndView mav = new ModelAndView("index");

        return mav;
    }
}
