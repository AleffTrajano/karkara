package com.desafio.gama.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.gama.domain.Usuario;
import com.desafio.gama.service.UsuarioService;

@RestController
@RequestMapping(path ="/usuarios")
public class UsuarioController {
	
	@Autowired
	private UsuarioService service;
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?>find(@PathVariable Integer id) {
		
		Usuario obj = service.buscar(id);
		
		return ResponseEntity.ok().body(obj);
	}
	
	
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable Integer id) throws Exception {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	
	
	

}