
package ls.lesm.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import ls.lesm.exception.UserAlreadinExistException;
import ls.lesm.model.User;
import ls.lesm.model.UserDeatilsImpl;
import ls.lesm.model.UserRole;
import ls.lesm.repository.RoleRepository;
import ls.lesm.repository.UserRepository;
@Service
public class UserServiceImpl implements UserDetailsService {
	
	
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public User createUser(User user, Set<UserRole> userRole) throws Exception {
		User local=this.userRepository.findByUsername(user.getUsername());
		if(local!=null) {
			System.out.println("User already exist with this username!!");
			throw new UserAlreadinExistException("user already present with this username","present");
			//create user
		}
		else {

			for(UserRole ur: userRole) {
				roleRepository.save(ur.getRole());//role save
			}

			user.getUserRole().addAll(userRole);//associating roles to user
			local=this.userRepository.save(user);
		}
		return local;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	
		 User s=  userRepository.findByUsername(username);
		 
		 if(s!=null)
		 {
			 throw new UserAlreadinExistException("user already present with this username","present");
		 }
		 else
			 
		
		return new UserDeatilsImpl(s);
	}

}
