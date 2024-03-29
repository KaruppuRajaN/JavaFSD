package com.tcs.security.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.tcs.security.model.MyUserDetails;
import com.tcs.security.model.User;
import com.tcs.security.repository.UserRepository;

@Service
public class MyUserDetailsService  implements UserDetailsService{
	@Autowired
	UserRepository repo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> user = repo.findByUserName(username);
		user.orElseThrow(()->new UsernameNotFoundException("UserName not found"+username));
		return user.map(MyUserDetails::new).get();
	}
	

}
