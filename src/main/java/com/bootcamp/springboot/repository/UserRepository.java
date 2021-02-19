package com.bootcamp.springboot.repository;

import com.bootcamp.springboot.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {

    public UserModel findByUsername(String username);

}
