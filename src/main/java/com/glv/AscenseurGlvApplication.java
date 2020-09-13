package com.glv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.glv.repository.DevisRepository;
import com.glv.service.AccountService;

@SpringBootApplication
public class AscenseurGlvApplication {
	@Autowired
	private DevisRepository devisRepository;
	@Autowired
	private AccountService accountService;

	public static void main(String[] args) {
		SpringApplication.run(AscenseurGlvApplication.class, args);
		System.out.println(" Ascenseur démaré");
	}
	
	@Bean
	public BCryptPasswordEncoder getBCPE(){
		return new BCryptPasswordEncoder();
	}
	
}
