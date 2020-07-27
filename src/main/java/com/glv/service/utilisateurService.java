package com.glv.service;

import org.springframework.stereotype.Component;

import com.glv.entities.Utilisateur;

@Component
public interface utilisateurService {

	public Utilisateur addUtilisateur(Utilisateur utilisateur);

}
