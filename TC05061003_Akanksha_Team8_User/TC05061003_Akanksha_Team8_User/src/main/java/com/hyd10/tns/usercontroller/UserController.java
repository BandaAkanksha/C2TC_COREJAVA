package com.hyd10.tns.usercontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.hyd10.tns.userentity.UserEntity;
import com.hyd10.tns.userservice.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class UserController {
	@Autowired
	UserService userService;
	
	@PostMapping("/user")
	public UserEntity saveuserEntity(@RequestBody UserEntity user) {
		
		return userService.saveUserEntity(user);
	}
	
	@GetMapping("/user")
	public List<UserEntity> fetchUserList() {
		
		return userService.fetchUserList();
	}
	
	@GetMapping("/user/{id}")
	public UserEntity fectUserById(@PathVariable("id") Long userId)
	{
		return userService.fetchUserById(userId);
	}
	
	@DeleteMapping("/user/{id}")
	public  String deleteUserById(@PathVariable("id") Long userId) {
			userService.deleteUserById(userId);
			return "User deleted Successfully!!";
	}
	
	@PutMapping("/user/{id}")
	public UserEntity updateUser(@PathVariable("id") Long userId,@RequestBody UserEntity user) {
		return userService.updateuserEntity(userId, user);
	}
	
	
	
	
}

