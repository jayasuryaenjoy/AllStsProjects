package spring_security_repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spring_security_entity.User;

public interface UserRepository  extends JpaRepository<User, Integer>{
	User findByUsername(String username);

}
