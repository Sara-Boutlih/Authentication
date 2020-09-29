package com.glv.service;


import com.glv.entities.Role;
import com.glv.entities.Utilisateur;

public interface AccountService {
	
	public void addRoleToUser(String username, String roleName);
	public Utilisateur saveUser(Utilisateur user);
	public Role saveRole(Role role);
	public Utilisateur findUserByUsername(String username);


}
