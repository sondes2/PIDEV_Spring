package org.pi.service;


import java.util.List;

import org.pi.entities.role;
import org.pi.entities.User;
import org.pi.repos.UserRepository;
public interface IUserService {
	public Long ajouterUser(User user);
	//public int countUser();
	//public String getUserPrenomById(int userId);
	public void deleteUserById(int userId);
	public User DeleteUser(User u);
	public List<String> userNames();
	//public void setUserRepository(UserRepository UserRepository);
	//public List<User> getAllUsersByRole(role role);
	public List<User> retrieveAllUsers();
	public User addUser(User u);
	public User updateUser(User user);
	//public User retrieveUser(String userId);
}
