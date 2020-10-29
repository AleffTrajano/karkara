package com.desafio.gama;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.desafio.gama.domain.Usuario;
import com.desafio.gama.repository.UsuarioRepository;

@SpringBootApplication
public class KarkaraApplication  implements CommandLineRunner{

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(KarkaraApplication.class, args);
	}

	//criando instaciaçoes para teste
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Usuario user = new Usuario(null,"João");
		Usuario user1 = new Usuario(null,"maaria");
		Usuario user2 = new Usuario(null,"maiaa");
		Usuario user3 = new Usuario(null,"ticole");
		
		usuarioRepository.saveAll(Arrays.asList(user,user1,user2,user3));
	}
	
	}


