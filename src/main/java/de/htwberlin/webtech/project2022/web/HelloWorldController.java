package de.htwberlin.webtech.project2022.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

    @GetMapping(path = "/")
    public ModelAndView showHelloWorldPage() {
        return new ModelAndView("HelloWorld");
    }
}
