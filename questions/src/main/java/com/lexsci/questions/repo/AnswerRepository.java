package com.lexsci.questions.repo;

import com.lexsci.questions.domain.Answer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface AnswerRepository extends CrudRepository<Answer, Integer> {

}
