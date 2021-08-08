package ethan.restservicecors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestServiceCorsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestServiceCorsApplication.class, args);
	}

	/*
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/greeting-javaconfig").allowedOrigins("http://localhost:8080");
			}
		};
	}
	*/

}
