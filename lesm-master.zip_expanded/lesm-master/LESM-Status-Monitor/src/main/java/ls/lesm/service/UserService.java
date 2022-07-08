package ls.lesm.service;

import java.util.Set;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import ls.lesm.model.User;
import ls.lesm.model.UserRole;
@Service
public interface UserService {
	

	public User createUser(User user, Set<UserRole> userRole) throws Exception;
	
	
	

}
