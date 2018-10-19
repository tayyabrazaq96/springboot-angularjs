package com.sample.spring.angularjs.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ViewController {

    @GetMapping(value = {"/", "/{page}"})
    public String index(@PathVariable(required = false) String page) {
        return "index";
    }
}
