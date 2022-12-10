package com.lucasbarrionuevo.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasbarrionuevo.app.entity.User;

public interface UserRepository extends JpaRepository <User,Long>{

}
