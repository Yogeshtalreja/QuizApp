package com.example.demo;

import com.example.demo.model.quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.repo.quiz_repo;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping(value = "/ghayour_quiz/")
public class control {

    @Autowired
    quiz_repo quizRepo;

    @GetMapping(value = "/findall")
    public List<quiz> full_data(){
        return (List<quiz>) quizRepo.findAll();
    }

    @CrossOrigin
    @PostMapping(value = "/save")
    public List<quiz> persist(@RequestBody quiz Quiz_data){
        quizRepo.save(Quiz_data);
        return (List<quiz>) quizRepo.findAll();
    }

}
