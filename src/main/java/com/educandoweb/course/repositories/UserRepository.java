package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entiies.User;

public interface UserRepository extends JpaRepository<User, Long> {
	

}
