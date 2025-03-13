package cat.itacademy.s04.t01.n01.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String saludo(@RequestParam(defaultValue = "Unknown") String name) {
        return "Hello " + name + ". You are running a Maven project";
    }

    @GetMapping(value = {"HelloWorld2", "/HelloWorld2/{name}"})
    public String saludo2(@PathVariable (required = false) String name){
        if(name == null){
            name = "Unknown";
        }
        return"Hello "+name+". You are running a Maven project";
    }
}
