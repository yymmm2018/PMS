package edu.zut.cs.javaee.dream.admin.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.zut.cs.javaee.dream.admin.dao.impl.UserDaoImpl;
import edu.zut.cs.javaee.dream.admin.domain.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AdminDaoConfig.class)
class UserDaoTest {

	UserDao userDao = new UserDaoImpl();

	@Test
	void test() {
		String username = "world";
		User user = this.userDao.getByUsername(username);

		User expectedUser = new User();
		expectedUser.setUsername(username);
//		assertEquals(user, expectedUser);
		assertEquals(user.getUsername(), expectedUser.getUsername());
	}

}
