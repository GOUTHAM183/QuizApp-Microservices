package com.goutham.QuestionService.services;

import com.goutham.QuestionService.entities.Question;

import java.util.List;

public interface QuestionService {


    Question create(Question question);

    List<Question> get();

    Question getQuestion(Long id);

    List<Question> getQuestionsOfQuiz(Long quizId);

}
