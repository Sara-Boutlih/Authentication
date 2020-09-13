package com.glv.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.glv.entities.Role;
import com.glv.repository.RoleRepository;
import com.glv.service.roleService;
@Service("roleServiceImpl")
public class roleServiceImp implements roleService{
	
	@Autowired
	private RoleRepository roleService;

	@Override
	public Role addRole(Role role) {
		// TODO Auto-generated method stub
		return roleService.save(role);
	}

}
