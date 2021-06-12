package com.example.demo.repo;

import com.example.demo.model.Question;
import org.springframework.data.repository.CrudRepository;

public interface question_repo extends CrudRepository<Question,Integer> {
}
