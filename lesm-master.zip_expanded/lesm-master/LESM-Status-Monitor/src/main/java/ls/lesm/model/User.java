package  ls.lesm.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Users_Auth")
//@JsonPropertyOrder({"id","username","firstName","lastName","email","phoneNo","DOB","password","gender","status"})
public class User {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "auth_user_gen",strategy = GenerationType.AUTO)
	private Integer userId;

	@Column(name="first_name")
	private String firstName;

	@Column(name="last_name")
	private String lastName;
	
	private String username;
	
	private String password;

	private String email;

	private String phoneNo;

	private Boolean status=true;
	
	private String roleName;


	//user can have many 
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER,mappedBy="user")
	@JsonIgnore
	private Set<UserRole> userRole=new HashSet<>();
//	
//
//	
//	@Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//
//		Set<Authority> set = new HashSet<>();
//		this.userRole.forEach(userRole -> {
//			set.add(new Authority(userRole.getRole().getRoleName()));
//		});
//		return set;
//	}
//
//	@Override
//	public boolean isAccountNonExpired() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//
//
//	@Override
//	public boolean isAccountNonLocked() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//
//
//	@Override
//	public boolean isCredentialsNonExpired() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//
//
//	@Override
//	public boolean isEnabled() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//
//	@Override
//	public String getPassword() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public String getUsername() {
//		// TODO Auto-generated method stub
//		 return null;
//	}

}
