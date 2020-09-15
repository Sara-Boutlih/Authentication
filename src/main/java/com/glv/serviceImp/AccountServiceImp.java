package com.glv.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.glv.entities.Role;
import com.glv.entities.Utilisateur;
import com.glv.repository.RoleRepository;
import com.glv.repository.UtilisateurRepository;
import com.glv.service.AccountService;
@Service
@Transactional
public class AccountServiceImp implements AccountService{
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	@Autowired
	private UtilisateurRepository userRepository;
	@Autowired
	private RoleRepository roleRepository;
	
	@Override
	public Role saveRole(Role role) {
		return roleRepository.save(role);
	}

	@Override
	public void addRoleToUser(String username, String roleName) {
		Role role=roleRepository.findByRoleName(roleName);
		Utilisateur user=userRepository.findByUsername(username);
		user.getRoles().add(role);
	}
	
}



