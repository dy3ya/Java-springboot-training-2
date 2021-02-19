package com.bootcamp.springboot.repository;

import com.bootcamp.springboot.model.todoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<todoModel, Long> {

}
