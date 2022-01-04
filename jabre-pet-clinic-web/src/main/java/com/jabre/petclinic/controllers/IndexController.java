package com.jabre.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author : Jabre
 * Created : 12/5/2021, Sunday
 **/
@Controller
public class IndexController {

    @RequestMapping({"", "/", "index", "index.html" })
    public String index() {
        return "index";
    }

    @RequestMapping("/oups")
    public String oupsHandler() {
        return "notimplemented";
    }
}
