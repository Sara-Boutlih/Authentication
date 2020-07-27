package com.glv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.glv.entities.Role;
import com.glv.service.roleService;

@RestController
@CrossOrigin("*")
@RequestMapping(value="/roles")
public class roleController {
	@Autowired
	private roleService roleService;
	
	@PostMapping("/addRole")
	public Role addRole(@RequestBody Role role) {
		
		return roleService.addRole(role);
	}


}
