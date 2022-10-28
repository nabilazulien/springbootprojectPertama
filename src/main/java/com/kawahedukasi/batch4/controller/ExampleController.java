package com.kawahedukasi.batch4.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ExampleController {
    @GetMapping(value = "/sample")
    public String get() {
        System.out.println("hgfjjhkjj");
        return "This is a sample GET endpoint";
    }

    @PostMapping("/sample")
    public String post() {
        return "This is a sample POST endpoint";
    }

    @PutMapping("/sample")
    public String put() {
        return "This is a sample PUT endpoint";
    }

    @DeleteMapping("/sample")
    public String delete() {
        return "This is a sample DELETE endpoint";
    }

    @GetMapping("/info")
    public String info() {
        return "Info : an abstract concept that refers to that which has the power to inform";
    }

    @GetMapping("/about")
    public String about() {
        return "About : used to indicate movement with in a particular area";
    }

    @GetMapping("/home")
    public String home() {
        return "Home : a space used as a permanent or semi permanent residence for one or many humans";
    }

    @GetMapping("/people/name")
    public String name() {
        return "Name : Nabila Basya Zulien";
    }
}
