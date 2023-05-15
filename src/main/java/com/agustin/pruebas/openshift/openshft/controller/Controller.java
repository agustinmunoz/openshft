package com.agustin.pruebas.openshift.openshft.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
	
	
	
	
	
	  @GetMapping("/agustin-nexus")
	    public String getUsers() throws Exception {

	        return "hola Mundo";
	    }

}
