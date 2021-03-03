package org.pi.service;

	import java.util.ArrayList;
	import java.util.List;

import org.pi.entities.role;
import org.pi.entities.User;
import org.pi.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
	public class UserServiceImpl implements IUserService {
		
	@Autowired
	UserRepository userRep ;
		
		
		public Long ajouterUser(User user) {
			userRep.save(user);
			return user.getIduser();
		}

		

		

		public void deleteUserById(int userId) {
			User userManagedEntity=userRep.findById((long) userId).get();
			userRep.delete(userManagedEntity);	
	
		}
		public User DeleteUser(User u) {
			userRep.delete(u);
			return u;
		}
		
		 public void setUserRepository(UserRepository UserRepository) {
		        this.userRep = UserRepository;
		    }

		public List<User> retrieveAllUsers() {
			return (List<User>) userRep.findAll();
			
		}

		

		public User updateUser(User user) {
			return userRep.save(user);
			
			
		}


		@Override
		public List<String> userNames() {
			// TODO Auto-generated method stub
			return null;
		}





		@Override
		public User addUser(User u) {
			// TODO Auto-generated method stub
			return null;
		}


		
	}
	
		
