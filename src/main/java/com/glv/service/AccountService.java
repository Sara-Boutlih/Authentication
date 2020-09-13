package com.glv.service;

import com.glv.entities.Role;
import com.glv.entities.Utilisateur;

public interface AccountService {
	public Utilisateur saveUser(Utilisateur user);
	public Role saveRole(Role role);
	public void addRoleToUser(String username, String roleName);
	public Utilisateur findUserByUsername(String username);

}
