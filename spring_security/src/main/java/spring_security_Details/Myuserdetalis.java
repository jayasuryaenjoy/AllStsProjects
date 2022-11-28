package spring_security_Details;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import spring_security.UserDetailsImpl;
import spring_security_entity.User;
import spring_security_repository.UserRepository;

@Service
public class Myuserdetalis implements UserDetailsService{
	
	@Autowired
	private UserRepository rop;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	
		User user=rop.findByUsername(username);
		if(user==null)
			throw new UsernameNotFoundException("user not found"); 
		
		
		return new UserDetailsImpl(user);
	}

}
