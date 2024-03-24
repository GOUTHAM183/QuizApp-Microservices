package com.goutham.QuizService.services;

import com.goutham.QuizService.entities.Quiz;
import org.springframework.stereotype.Service;

import java.util.List;


public interface QuizService {

    Quiz add(Quiz quiz);

    List<Quiz> get();

    Quiz get(long id);

}
