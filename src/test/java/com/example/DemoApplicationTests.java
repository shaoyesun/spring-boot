package com.example;

import com.example.entity.User;
import com.example.repository.UserResitory;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	UserResitory userResitory;

	@Test
	public void findByUsername() {
		User user =  userResitory.findByUsername("123");
		System.out.println(user.getId() + " | " + user.getUsername() + " | " + user.getPassword());
	}

}
