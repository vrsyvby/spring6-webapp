package guru.springframework.spring6webapp.controller;

@RestController("/hello")
public class HelloWorldController {

    @GetMapping("/world")
    public String helloWorld() {
        System.out.println("Hello World - Manoj-- again--not-again");
        return "Hello, World!";
    }
}
