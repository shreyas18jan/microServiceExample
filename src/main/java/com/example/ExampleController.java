package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// RestController - Spring assumes this as REST Style Service.
// It is a convenience annotation which is annotated with @Controller and @ResponseBody
@RestController
public class ExampleController {

    // RequestMapping - Annotation for mapping web requests onto methods in request-handling classes with flexible method signatures
    @RequestMapping("/")
    String getExampleOne(){
        return "MicroService Example achieved";
    }

    // GetMapping - shortcut for @RequestMapping(method=RequestMethod.GET)
    @GetMapping("/another")
    String getExampleTwo(){
        return "Another MicroService Example achieved";
    }
}
