package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Role;
import com.example.demo.entity.User;
import com.example.demo.repository.RoleRepository;
import com.example.demo.util.RoleEnum;


@RestController
@RequestMapping("/crud_user")
public class CrudUserController extends CrudController<User, Long>{
	
	@Autowired
	private RoleRepository roleRepository;
	//redéfinition pour cette methode pour changer contenu
	public List<User> getAll(){
		List<User> users= super.getAll();
		users.forEach(user -> user.setPassword(null));//pour n'affiche pas le password au console
		return users;
	}
	 
	public void add(@RequestBody User user) {
		Role role=roleRepository.findByName(RoleEnum.ROLE_USER.getName()); //cree cette methode dans RoleRep
		user.setRoles(Arrays.asList(role));
		user.setEnable(true);
		super.add(user);
	}
}

