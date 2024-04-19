package de.dhbw.itsecurity.authentification.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;

@RestController
@SecurityRequirement(name = "bearerAuth")
public class ExampleController {

	
	
	@GetMapping("/example")
	public String exampleResource(Authentication auth) {
		return auth.getName();
	}
}
