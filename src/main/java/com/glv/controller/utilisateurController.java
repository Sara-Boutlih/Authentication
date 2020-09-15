package com.glv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.glv.entities.Utilisateur;
import com.glv.service.utilisateurService;

@RestController
@CrossOrigin("*")
@RequestMapping(value="/utilisateurs")
public class utilisateurController {
	@Autowired
	private utilisateurService utilisateurService;
	
	//API Ajouter utilisateur
	
	@PostMapping("/addUtilisateur")
	public Utilisateur addUtilisateur(@RequestBody Utilisateur utilisateur) {
		
		return utilisateurService.addUtilisateur(utilisateur);
	}
	//API Supprimer utilisateur
   
	@DeleteMapping("/DeleteUser")
	@ResponseBody
	public String DeleteUser(@RequestBody Utilisateur utilisateur) {
		utilisateurService.DeleteUser(utilisateur);
		return "Utilisateur Supprimé";
}
	//API pour retourner la liste des users
	@GetMapping("/allUtilisateurs")
	public List<Utilisateur> allUtilisateurs() {
		return utilisateurService.allUtilisateur();
}
	// API qui retourner les devis d'un utilisateur  (id_user)
/*	@GetMapping("/{id}")
	public Utilisateur GetUtilisateurByid(@PathVariable long id) {
		return utilisateurService.GetUtilisateurByid(id);
}*/
}
	
	
	
	

