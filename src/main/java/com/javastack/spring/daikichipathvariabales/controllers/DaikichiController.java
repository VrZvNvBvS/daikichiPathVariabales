package com.javastack.spring.daikichipathvariabales.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController   // import annotation FW
@RequestMapping("/daikichi") // ALL routes /daikichi place on top (avoid DRY code)
public class DaikichiController {

    @RequestMapping("")
    public String daikichi() {
        return "Welcome!";
    }
    @RequestMapping("/today")
    public String today() {
            return "Today you will find luck in all your endeavours";
    }
    @RequestMapping("/tomorrow")
    public String tomorrow() {
        return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
    }
}
