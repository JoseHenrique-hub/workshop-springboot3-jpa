package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entiies.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
