package ls.lesm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ls.lesm.model.Role;
@Service
public interface AdminService {
	public void deleteRoles(String roleName);
	
	public Role createNewRole(Role role);
	
	public List<Role> getAllRole();

}
