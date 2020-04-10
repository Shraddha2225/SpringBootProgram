package com.bridgelab.myfirstapp.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @GetMapping("/hello")
   public String hello(){
       return "Hello World";
   }
   @GetMapping("/param/hello")
    public String paramHello(@RequestParam("FirstName") String firstName,@RequestParam("LastName") String lastName){
        return "Hello " + firstName + lastName;
   }
   @PostMapping("/getparam/name")
    public String postBodyHello(@RequestBody User user){
        return user.getFirstName() + "" +user.getLastName();
   }

}
