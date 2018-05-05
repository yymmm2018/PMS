package contract;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import contract.domain.User;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=AdminServiceConfig.class)
public class UserManagerTest {
	
	@Autowired
	UserManager userManager;
	
	@Test
	public void testFindAll() {
		List<User> all = this.userManager.findAll();
		assertEquals(all.size(), 100);
	}
	
	@Test
	public void testFindByUserName() {
		String username = "world";
		User expected_user = new User();
		// expected_user.setUsername(username);
		User user = this.userManager.findbyUserName(username);
		// assertEquals(user.getUsername(), expected_user.getUsername());
		assertEquals(user, expected_user);
	}

}
