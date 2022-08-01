package uz.nt.firstspring.controller;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping()

public class HelloController {
    @GetMapping(value = "/hello")
    public String hello(@RequestParam String name,@RequestParam int age){
        return "hello1 " + name +  " yoshi "+  age;
    }

    @PostMapping(value = "/hello")
    public String helloPost(){
        return "hello post1";
    }

    @PostMapping()
    public String helloPost2(){
        return "hello post2";

    }
}
