package com.glv.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.glv.entities.Utilisateur;
import com.glv.repository.utilisateurRepository;
import com.glv.service.utilisateurService;
@Service
public class utilisateurServiceImp implements utilisateurService {

	@Autowired
	private utilisateurRepository userRepository;
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
		
		userRepository.delete(utilisateur);
	}

	@Override
	public List<Utilisateur> allUtilisateur() {
		
		return userRepository.findAll();
	}

	@Override
	public Utilisateur GetUtilisateurByid(long id) {
		return userRepository.findById(id).get();
	}
	@Override
	public Utilisateur findUserByUsername(String username) {	
			return userRepository.findByUsername(username);
	}
	}







