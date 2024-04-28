package de.dhbw.itsecurity.authentification.controller;

import javax.annotation.security.RolesAllowed;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;

@RestController
public class ExampleController {

	
	@RolesAllowed("Benutzer")
	@GetMapping("/example")
	public String exampleResource(Authentication auth) {
		return auth.getName();
	}
	
	@RolesAllowed("Admin")
	@GetMapping("/keineBerechtigung")
	public String exampleResource2(Authentication auth) {
		return auth.getName();
	}
}
