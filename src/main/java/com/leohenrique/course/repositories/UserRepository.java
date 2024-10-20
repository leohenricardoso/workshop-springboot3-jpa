package com.leohenrique.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leohenrique.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
