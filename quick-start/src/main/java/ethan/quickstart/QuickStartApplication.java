package ethan.quickstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController  // tells Spring that this code describes an endpoint that should be made available over the web.
public class QuickStartApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuickStartApplication.class, args);
	}

	@GetMapping("/hello")  // answer requests that send to url/hello
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		// expect a name value in the request, but if it’s not there, it will use the word “World” by default.
		return String.format("Hello %s!", name);
	}
}
