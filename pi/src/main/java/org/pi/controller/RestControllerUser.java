package org.pi.controller;

import java.util.List;

import org.pi.entities.User;
import org.pi.service.IUserService;
import org.pi.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RestControllerUser {
	@Autowired
	UserServiceImpl userservice;
	// http://localhost:8081/pi/servlet/ajouterUser
		@PostMapping("/ajouterUser")
	@ResponseBody
	public Long ajouterUser(@RequestBody User user) {
			userservice.ajouterUser(user);
		return user.getIduser();
	 
	}
	
//http://localhost:8081/pi/servlet/retrieveAllUsers
@GetMapping("/retrieveAllUsers")
@ResponseBody
public List<User> getUsers() {
return (List<User>) userservice.retrieveAllUsers();

	
}
//http://localhost:8081/pi/servlet/suppuser
@GetMapping("/suppuser")
@ResponseBody
public User deleteUser(@RequestBody User u) {
	return userservice.DeleteUser(u);
 
}

@DeleteMapping("/remove-user/{user-id}")
 @ResponseBody
 public void removeUser(@PathVariable("user-id") int userId) {
	userservice.deleteUserById(userId);
 }

//http://localhost:8081/SpringMVC/servlet/modify-user
 @PutMapping("/modify-user")
 @ResponseBody
 public User updateUser(@RequestBody User user) {
 return userservice.updateUser(user);
 }

}
