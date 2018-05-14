package com.lexsci.questions.repo;

import com.lexsci.questions.domain.Difficulty;
import com.lexsci.questions.domain.Question;
import com.lexsci.questions.domain.Subject;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;

public interface QuestionRepository extends CrudRepository<Question, Integer> {
    /**
     * Lookup a question by the questionContent.
     *
     * @param questionContent questionContente of the question.
     * @return Question if found, null otherwise.
     */
    Question findByQuestionContent(@Param("questionContent") String questionContent);

    //void createQuestion(String questionContent, String submittedBy, Subject subject, Difficulty difficulty);

}
