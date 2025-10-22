package com.educandoweb.course.servicies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entiies.Order;
import com.educandoweb.course.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repositorys;
	
	public List<Order> findAll(){
		return repositorys.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repositorys.findById(id);
		return obj.get();
	}
}
