package com.example.repository;

import com.example.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by root on 17-2-15.
 */
public interface UserResitory extends JpaRepository<User, Long>{

    User findByUsername(String username);

}
