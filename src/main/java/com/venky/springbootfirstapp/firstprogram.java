package com.venky.springbootfirstapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class firstprogram {
    @GetMapping("/{fname}/{lname}")
    public static String code(@PathVariable("fname")String lname,@PathVariable("lname")String fname ){
return "name:" +fname +lname ;
    }
}
