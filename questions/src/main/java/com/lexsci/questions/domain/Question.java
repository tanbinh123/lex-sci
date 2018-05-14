package com.lexsci.questions.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Question implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String questionContent;

    @Column
    private String submittedBy;

    @Column
    private LocalDate submittedTime;

    @Column
    private Subject subject;

    @Column
    private Difficulty difficulty;

    protected Question(){
    }

    public Question(String questionContent, String submittedBy, LocalDate submittedTime, Subject subject, Difficulty difficulty) {
        this.questionContent = questionContent;
        this.submittedBy = submittedBy;
        this.submittedTime = submittedTime;
        this.subject = subject;
        this.difficulty = difficulty;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }

    public String getSubmittedBy() {
        return submittedBy;
    }

    public void setSubmittedBy(String submittedBy) {
        this.submittedBy = submittedBy;
    }

    public LocalDate getSubmittedTime() {
        return submittedTime;
    }

    public void setSubmittedTime(LocalDate submittedTime) {
        this.submittedTime = submittedTime;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Question)) return false;
        Question question1 = (Question) o;
        return Objects.equals(getId(), question1.getId()) &&
                Objects.equals(getQuestionContent(), question1.getQuestionContent()) &&
                Objects.equals(getSubmittedBy(), question1.getSubmittedBy()) &&
                Objects.equals(getSubmittedTime(), question1.getSubmittedTime()) &&
                getSubject() == question1.getSubject() &&
                getDifficulty() == question1.getDifficulty();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getId(), getQuestionContent(), getSubmittedBy(), getSubmittedTime(), getSubject(), getDifficulty());
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", questionContent='" + questionContent + '\'' +
                ", submittedBy='" + submittedBy + '\'' +
                ", submittedTime=" + submittedTime +
                ", subject=" + subject +
                ", difficulty=" + difficulty +
                '}';
    }
}
