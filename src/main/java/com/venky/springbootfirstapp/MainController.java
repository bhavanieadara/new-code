package com.venky.springbootfirstapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {

    @GetMapping("/{lname}/{mname}/{fname}")
    public static  String firstapp(@PathVariable("fname") String Lname,@PathVariable("mname")String Mname,@PathVariable("lname")String Fname){
        return "name:" +Fname + Mname +Lname ;
    }
}
