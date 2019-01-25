package com.example.docker.fabricate.zfabricate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ZfabricateApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZfabricateApplication.class, args);
	}

}

@RestController
class Fabrication
{
	
	@GetMapping(value = "/")
	public String run()
	{
		return "hello";
		
	}
	
}
