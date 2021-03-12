package com.mytest.service;

import com.mytest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface UserRepository extends JpaRepository<User, Long> {

    User findUserByEmail (String email);

}
