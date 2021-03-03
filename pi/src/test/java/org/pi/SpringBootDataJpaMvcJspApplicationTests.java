package org.pi;

import org.pi.*;
import org.pi.entities.role;
import org.pi.entities.User;
import org.pi.service.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDataJpaMvcJspApplicationTests {
	@Autowired
	UserServiceImpl us;
	@Test
	
	public void contextLoads() throws ParseException {

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	Date d = dateFormat.parse("2017-03-23");
		
	///	User u4 =new  User("sondes", "maazoul","f","soo@esprit.tn","dddd", role.ADMINISTRATOR) ;
		
      /*  us.addUser(u1);
        us.addUser(u2);
        us.addUser(u3);*/
      //  us.ajouterUser(u4);
      //  us.DeleteUser(u3);
        // us.retrieveAllUsers();
	
	
	}
	
}
	
		