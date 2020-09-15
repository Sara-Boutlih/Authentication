package com.glv.service;

import java.util.List;

import com.glv.entities.Utilisateur;

public interface utilisateurService {

	public Utilisateur addUtilisateur(Utilisateur utilisateur);

	public void DeleteUser(Utilisateur utilisateur);

	public List<Utilisateur> allUtilisateur();

	public Utilisateur GetUtilisateurByid(long id);
	
	public Utilisateur findUserByUsername(String username);
}
