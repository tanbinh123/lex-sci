package com.lexsci.questions.services;

import com.lexsci.questions.domain.Answer;
import com.lexsci.questions.domain.Question;
import com.lexsci.questions.repo.AnswerRepository;
import com.lexsci.questions.repo.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class AnswerService {
    private AnswerRepository answerRepository;
    private QuestionRepository questionRepository;

    @Autowired
    public AnswerService(AnswerRepository answerRepository, QuestionRepository questionRepository) {
        this.answerRepository = answerRepository;
        this.questionRepository = questionRepository;
    }
    public Answer createAnswer(String answer, String answeredBy, String questionContent){
        Question question = questionRepository.findByQuestionContent(questionContent);
        if(question == null){
            throw new RuntimeException("Question does not exist: " + question.getQuestionContent());
        }
        return answerRepository.save(new Answer(answer, answeredBy, LocalDate.now(),question));
    }
    public Iterable<Answer> lookup(){
        return answerRepository.findAll();
    }
    public long total(){
        return answerRepository.count();
    }
}
