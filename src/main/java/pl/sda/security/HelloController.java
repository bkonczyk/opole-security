package pl.sda.security;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping
    public String emptyPage() {
        return "emptyPage";
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "hello";
    }
}
