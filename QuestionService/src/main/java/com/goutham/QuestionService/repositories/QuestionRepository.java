package com.goutham.QuestionService.repositories;

import com.goutham.QuestionService.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question,Long> {
    List<Question> findByQuizId(Long quizId);
}
