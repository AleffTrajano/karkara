package com.desafio.gama.resources;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path ="/usuarios")
public class UsuarioResouce {
	
	@RequestMapping(method=RequestMethod.GET)
	public String listar() {
		return "rest testado";
	}

}