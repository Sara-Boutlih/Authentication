package com.glv.service;

import org.springframework.stereotype.Component;

import com.glv.entities.Role;

@Component
public interface roleService {

	public Role addRole(Role role);

}
