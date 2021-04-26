package com.rogerioreis.handlerExceptionExemplo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping ("people")
public class PeopleController {
	
	@GetMapping
	public ResponseEntity getPeople() {
		log.info("Chamando endpoint de pessoas");
		throw new IndexOutOfBoundsException();
	}

}
