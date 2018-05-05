package contract;

import java.util.List;

import contract.domain.User;




public interface UserManager {
	List<User> findAll();

	User findbyUserName(String username);
}
