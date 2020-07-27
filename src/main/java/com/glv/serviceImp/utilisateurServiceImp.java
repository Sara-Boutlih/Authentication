package com.glv.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.glv.entities.Utilisateur;
import com.glv.repository.utilisateurRepository;
import com.glv.service.utilisateurService;
@Service("utilisateurServiceImpl")
public class utilisateurServiceImp implements utilisateurService {
	
	@Autowired
	private utilisateurRepository utilisateurRepository;

	@Override
	public Utilisateur addUtilisateur(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		return utilisateurRepository.save(utilisateur);
	}

}
