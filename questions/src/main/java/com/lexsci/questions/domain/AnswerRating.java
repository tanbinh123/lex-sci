package com.lexsci.questions.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
public class AnswerRating implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false)
    private Integer score;

    @Column(length = 200)
    private String comment;

    @Column
    private String ratedBy;

    @Column
    private LocalDate ratedTime;

    @ManyToOne
    private Answer answer;

    protected AnswerRating(){
    }

    public AnswerRating(Integer score, String comment, String ratedBy, LocalDate ratedTime, Answer answer) {
        this.score = score;
        this.comment = comment;
        this.ratedBy = ratedBy;
        this.ratedTime = ratedTime;
        this.answer = answer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getRatedBy() {
        return ratedBy;
    }

    public void setRatedBy(String ratedBy) {
        this.ratedBy = ratedBy;
    }

    public LocalDate getRatedTime() {
        return ratedTime;
    }

    public void setRatedTime(LocalDate ratedTime) {
        this.ratedTime = ratedTime;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof AnswerRating)) return false;
        if (!super.equals(object)) return false;

        AnswerRating that = (AnswerRating) object;

        if (!getId().equals(that.getId())) return false;
        if (!getScore().equals(that.getScore())) return false;
        if (!getComment().equals(that.getComment())) return false;
        if (!getRatedBy().equals(that.getRatedBy())) return false;
        if (!getRatedTime().equals(that.getRatedTime())) return false;
        if (!getAnswer().equals(that.getAnswer())) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getId().hashCode();
        result = 31 * result + getScore().hashCode();
        result = 31 * result + getComment().hashCode();
        result = 31 * result + getRatedBy().hashCode();
        result = 31 * result + getRatedTime().hashCode();
        result = 31 * result + getAnswer().hashCode();
        return result;
    }

    public java.lang.String toString() {
        return "AnswerRating{" +
                "id=" + id +
                ", score=" + score +
                ", comment='" + comment + '\'' +
                ", ratedBy='" + ratedBy + '\'' +
                ", ratedTime=" + ratedTime +
                ", answer=" + answer +
                '}';
    }
}
