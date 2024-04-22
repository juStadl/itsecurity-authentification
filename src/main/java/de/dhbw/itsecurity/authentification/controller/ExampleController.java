package de.dhbw.itsecurity.authentification.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/client")
public class ExampleController {

	
	@Autowired
	WebClient webClient;

	@GetMapping("/http")
	public String getDataFromServerOnHttp() {
		WebClient webClient = WebClient.create("http://localhost:8082");
		return webClient.get().uri("/server").retrieve()
				.bodyToMono(String.class).block();
	}

	@GetMapping("/https")
	public String getDataFromServerOnHttps(){
		return webClient.get().uri("https://localhost:8082/server").retrieve()
				.bodyToMono(String.class).block();
	}
}
