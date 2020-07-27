package com.glv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.glv.entities.Utilisateur;
import com.glv.service.utilisateurService;

@RestController
@CrossOrigin("*")
@RequestMapping(value="/utilisateurs")
public class utilisateurController {
	@Autowired
	private utilisateurService utilisateurService;
	
	@PostMapping("/addUtilisateur")
	public Utilisateur addUtilisateur(@RequestBody Utilisateur utilisateur) {
		
		return utilisateurService.addUtilisateur(utilisateur);
	}

	
}
