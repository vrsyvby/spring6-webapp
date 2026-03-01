
package guru.springframework.spring6webapp.controller;

@RestController("/hello")
public class HelloWorldController {

    @GetMapping("/world")
    public String helloWorld() {
        System.out.println("Hello World");
        return "Hello, World!";
    }
}