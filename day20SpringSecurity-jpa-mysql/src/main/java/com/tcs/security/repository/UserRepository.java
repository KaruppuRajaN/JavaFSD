package com.tcs.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.security.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	public Optional<User> findByUserName(String userName);
}
