package com.lexsci.questions.services;

import com.lexsci.questions.domain.Difficulty;
import com.lexsci.questions.domain.Question;
import com.lexsci.questions.domain.Subject;
import com.lexsci.questions.repo.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class QuestionService {
    //@Autowired
    private QuestionRepository questionRepository;
    @Autowired
    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }//Question createQuestion(String questionContent, String submittedBy, Subject subject, Difficulty difficulty);

    public Question createQuestion(String questionContent, String submittedBy, Subject subject, Difficulty difficulty){
        if(null != questionRepository.findByQuestionContent(questionContent)){
            throw new RuntimeException("Question exists already : " + questionContent);
        } else{
            return questionRepository.save(new Question(questionContent,submittedBy, LocalDate.now(),subject,difficulty));
        }

    }

    public Iterable<Question> lookup(){
        return questionRepository.findAll();
    }

    public long total(){
        return questionRepository.count();
    }

}
