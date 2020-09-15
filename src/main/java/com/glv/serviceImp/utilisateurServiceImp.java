package com.glv.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.glv.entities.Utilisateur;
import com.glv.repository.UtilisateurRepository;
import com.glv.service.utilisateurService;
@Service
public class utilisateurServiceImp implements utilisateurService {

	@Autowired
	private UtilisateurRepository userRepository;
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	@Override
	public Utilisateur addUtilisateur(Utilisateur utilisateur) {
		String hashPW=bCryptPasswordEncoder.encode(utilisateur.getPassword());
		utilisateur.setPassword(hashPW);
		return userRepository.save(utilisateur);
	}

	@Override
	public void DeleteUser(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Utilisateur> allUtilisateur() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utilisateur GetUtilisateurByid(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Utilisateur findUserByUsername(String username) {	
			return userRepository.findByUsername(username);
	}
	}







