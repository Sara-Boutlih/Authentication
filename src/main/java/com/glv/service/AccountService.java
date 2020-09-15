package com.glv.service;

import com.glv.entities.Role;
import com.glv.entities.Utilisateur;

public interface AccountService {
	public Role saveRole(Role role);
	public void addRoleToUser(String username, String roleName);
	

}
