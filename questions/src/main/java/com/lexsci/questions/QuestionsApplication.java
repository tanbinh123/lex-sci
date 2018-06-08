package com.lexsci.questions;

import com.lexsci.questions.domain.*;
import com.lexsci.questions.services.AnswerRatingService;
import com.lexsci.questions.services.AnswerService;
import com.lexsci.questions.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class QuestionsApplication implements CommandLineRunner {
	@Autowired
	private QuestionService questionService;
	@Autowired
	private AnswerService answerService;
	@Autowired
	private AnswerRatingService answerRatingService;

	public static void main(String[] args) {
			SpringApplication.run(QuestionsApplication.class, args);

	}
	@Override
	public void run(String... strings) throws Exception {
		//Create the default tour packages
		System.out.println("******start############");
		try {
			questionService.createQuestion("What is Java?", "Ying Zhang", Subject.COMP, Difficulty.Easy);
			String answer1 = "Java is a programming language";
			String answer2 = "Java allows you to play online games, chat with people around the world, calculate your mortgage interest, and view images in 3D, just to name a few. " +
					"It's also integral to the intranet applications and other e-business solutions that are the foundation of corporate computing.";
			Answer answerObj1 = answerService.createAnswer(answer1,"Jane Robert","What is Java?");
			Answer answerObj2 = answerService.createAnswer(answer2,"Eric Xia","What is Java?");
			//AnswerRating ar = new AnswerRating(Integer.valueOf(5), "Great answer!", "Ying Zhang", LocalDate.now(), answerObj2);
			answerRatingService.createAnswerRating(Integer.valueOf(5), "Great answer!", "Ying Zhang", LocalDate.now(), answerObj2.getId());
			//questionService.createQuestion("What is Newton's Third Law?", "Edward", Subject.PHYS, Difficulty.Easy);
		}catch (Exception e){
			System.out.println("################" + e.getMessage());
		}
		Iterable<Question> questions = questionService.lookup();//.forEach(q-> System.out.println(q));
		System.out.println("******Question count: " +questionService.total());
		for (Question q:questions
			 ) {
			System.out.println(q);
			//Iterable<Answer> answers =
					answerService.lookup().forEach(answer -> {System.out.println("AAAAAAAAAAAAAAAA\n"+answer);});
			System.out.println("******Answer count: " +answerService.total());
		}
		//System.out.println("******Question count: " +questionService.total());

		System.out.println("******the end*****************");

	}
}
