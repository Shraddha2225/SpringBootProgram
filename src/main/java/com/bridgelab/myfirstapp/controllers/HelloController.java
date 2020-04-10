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
   @PostMapping("getparam/name")
    public String postBodyHello(@RequestBody User user){
        return user.getFirstName() + " " +user.getLastName();
   }
   @PutMapping("put/hello")
   public String putBodyHello(@RequestBody User user){
        User newUser = new User();
        newUser.setFirstName("Shraddha");
       newUser.setLastName("Meshram");

       newUser.setFirstName(user.getFirstName());
       newUser.setLastName(user.getLastName());

       return user.getFirstName() + " " +user.getLastName();
   }

}
