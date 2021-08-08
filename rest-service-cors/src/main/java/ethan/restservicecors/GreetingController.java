package ethan.restservicecors;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";

    private final AtomicLong counter = new AtomicLong();

    // 1. You can also add the @CrossOrigin annotation at the controller class level as well,
    //    to enable CORS on all handler methods of this class.
    // 2. add CORS mapping in the application class.
    // 3. hybrid.
    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(required = false, defaultValue = "World") String name) {
        System.out.println("=== get greeting ===");
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}