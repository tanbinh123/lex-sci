package com.lexsci.questions.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Answer implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(length = 2000)
    private String answerContent;

    @Column
    private String answeredBy;

    @Column
    private LocalDate answeredTime;

    @ManyToOne
    private Question question;

    protected Answer(){

    }

    public Answer(String answerContent, String answeredBy, LocalDate answeredTime, Question question) {
        //this.id = id;
        this.answerContent = answerContent;
        this.answeredBy = answeredBy;
        this.answeredTime = answeredTime;
        this.question = question;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAnswerContent() {
        return answerContent;
    }

    public void setAnswerContent(String answerContent) {
        this.answerContent = answerContent;
    }

    public String getAnsweredBy() {
        return answeredBy;
    }

    public void setAnsweredBy(String answeredBy) {
        this.answeredBy = answeredBy;
    }

    public LocalDate getAnsweredTime() {
        return answeredTime;
    }

    public void setAnsweredTime(LocalDate answeredTime) {
        this.answeredTime = answeredTime;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "id=" + id +
                ", answerContent='" + answerContent + '\'' +
                ", answeredBy='" + answeredBy + '\'' +
                ", answeredTime=" + answeredTime +
                ", question=" + question +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Answer)) return false;
        Answer answer1 = (Answer) o;
        return Objects.equals(getId(), answer1.getId()) &&
                Objects.equals(getAnswerContent(), answer1.getAnswerContent()) &&
                Objects.equals(getAnsweredBy(), answer1.getAnsweredBy()) &&
                Objects.equals(getAnsweredTime(), answer1.getAnsweredTime()) &&
                Objects.equals(getQuestion(), answer1.getQuestion());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getId(), getAnswerContent(), getAnsweredBy(), getAnsweredTime(), getQuestion());
    }
}
