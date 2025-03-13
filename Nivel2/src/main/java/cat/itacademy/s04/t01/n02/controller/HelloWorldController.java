package cat.itacademy.s04.t01.n02.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String saluda(@RequestParam(defaultValue = "Unknown") String name){
        return "Hello " +name+ ". You are running a Gradle project.";
    }

    @GetMapping(value = {"/HelloWorld2", "/HelloWorld2/{name}"})
    public String saluda2(@PathVariable(required = false)String name){
        if(name == null){
            name = "Unknown";
        }
        return "Hello " +name+ ". You are running a Gradle project.";
    }
}
