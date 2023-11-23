package com.example.hw3_java_spring;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class Hw3JavaSpringApplication {
	@GetMapping("/")
	public String hello() {
		return "<html><body><h1>Hello DevSecOps</body></h1></html>";
	}
	public static void main(String[] args) {
		SpringApplication.run(Hw3JavaSpringApplication.class, args);
	}
}
