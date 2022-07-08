package ls.lesm.model;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class UserDeatilsImpl implements UserDetails{

	private User user;
    
    public UserDeatilsImpl(User user) {
        this.user = user;
    }
	
	//user can have many 
		@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER,mappedBy="user")
		@JsonIgnore
		private Set<UserRole> userRole=new HashSet<>();
		

		
		@Override
		public Collection<? extends GrantedAuthority> getAuthorities() {

			Set<Authority> set = new HashSet<>();
			this.userRole.forEach(userRole -> {
				set.add(new Authority(userRole.getRole().getRoleName()));
			});
			return set;
		}

		@Override
		public boolean isAccountNonExpired() {
			// TODO Auto-generated method stub
			return true;
		}


		@Override
		public boolean isAccountNonLocked() {
			// TODO Auto-generated method stub
			return true;
		}


		@Override
		public boolean isCredentialsNonExpired() {
			// TODO Auto-generated method stub
			return true;
		}


		@Override
		public boolean isEnabled() {
			// TODO Auto-generated method stub
			return true;
		}

		@Override
		public String getPassword() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getUsername() {
			// TODO Auto-generated method stub
			 return null;
		}

}
