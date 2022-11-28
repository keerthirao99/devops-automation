package com.spring.Jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerImageBuilderApplication {

	@GetMapping("/greet")
	public String greetings() {
		return "Hi User";
		 
	}
	public static void main(String[] args) {
		SpringApplication.run(DockerImageBuilderApplication.class, args);
	}

}
