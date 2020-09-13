package com.glv.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.glv.entities.Role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.glv.entities.Utilisateur;
import com.glv.repository.RoleRepository;
import com.glv.repository.UtilisateurRepository;
import com.glv.service.AccountService;
@RestController
public class AccountRestController {
	@Autowired
	private AccountService accountService;
	
	@Autowired
	private UtilisateurRepository utilisateurRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	@PostMapping("/register")
	public Utilisateur register(@RequestBody RegisterForm userForm){
		if(!userForm.getPassword().equals(userForm.getRepassword())) throw new  RuntimeException("you must comfirm your PSW");
		Utilisateur user=accountService.findUserByUsername(userForm.getUsername());
		if(user!=null)
			throw new  RuntimeException("this user exist");
		Utilisateur appUser=new Utilisateur();
		appUser.setUsername(userForm.getUsername());
		appUser.setPassword(userForm.getPassword());
		accountService.saveUser(appUser);
		accountService.addRoleToUser(userForm.getUsername(), "USER");
		return appUser;
	}
	 
	@GetMapping("/displayUser")
	public List<Utilisateur> displayUser(){
		return utilisateurRepository.findAll();		
	}
	
	@PostMapping("/ajouterUtilisateur")
	public @ResponseBody Utilisateur ajouterUtilisateur(
			@RequestParam(name="nom" , defaultValue="") String nom,
			@RequestParam(name="password" , defaultValue="") String password,
			@RequestParam(name="email" , defaultValue="") String email,
			@RequestParam(name="idRole" , defaultValue="") Long idRole
			){
		
		Utilisateur user=new Utilisateur();
		Role role= roleRepository.getOne(idRole);	
		Set<Role> idR=new HashSet<>();

		idR.add(role);
		user.setUsername(nom);
		user.setPassword(password);
		user.setEmail(email);
		user.setRoles(idR);
		
		return utilisateurRepository.save(user);
		
		
		
	}


}
