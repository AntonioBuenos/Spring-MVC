package by.smirnov.springtest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/ozzy-says-hello")
    public String sayHello() {
        return "hello_world";
    }
}
