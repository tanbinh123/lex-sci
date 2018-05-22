package com.lexsci.questions.services;

import com.lexsci.questions.domain.Answer;
import com.lexsci.questions.domain.AnswerRating;
import com.lexsci.questions.repo.AnswerRatingRepository;
import com.lexsci.questions.repo.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class AnswerRatingService {
    private AnswerRepository answerRepository;
    private AnswerRatingRepository answerRatingRepository;

    @Autowired
    public AnswerRatingService(AnswerRatingRepository answerRatingRepository, AnswerRepository answerRepository) {
        this.answerRepository = answerRepository;
        this.answerRatingRepository = answerRatingRepository;
    }
    public AnswerRating createAnswerRating(Integer score, String comment, String ratedBy, LocalDate ratedTime, Integer answerId){
        Answer answer = answerRepository.findById(answerId).get();
        if(answer == null){
            throw new RuntimeException("Answer does not exist: " + answerId);
        }
        return answerRatingRepository.save(new AnswerRating(score, comment, ratedBy, ratedTime, answer));
    }
    public Iterable<AnswerRating> lookup(){
        return this.answerRatingRepository.findAll();//answerRatingRepository..findAll();
    }
    public long total(){
        return answerRatingRepository.count();
    }
}
