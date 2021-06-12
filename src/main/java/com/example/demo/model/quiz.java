package com.example.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
public class quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String quiz_title;
    private int total_points;
    private int time_allowed;
    @Temporal(TemporalType.DATE)

    private Date deadline;

    @OneToMany(cascade = {CascadeType.ALL})
    private Set<Question> questionList;

    public quiz(int id, String quiz_title, int total_points, int time_allowed, Date deadline) {
        this.id = id;
        this.quiz_title = quiz_title;
        this.total_points = total_points;
        this.time_allowed = time_allowed;
        this.deadline = deadline;
    }

    public int getId() {
        return id;
    }

    public String getQuiz_title() {
        return quiz_title;
    }

    public int getTotal_points() {
        return total_points;
    }

    public int getTime_allowed() {
        return time_allowed;
    }

    public Date getDeadline() {
        return deadline;
    }



    public void setId(int id) {
        this.id = id;
    }

    public void setQuiz_title(String quiz_title) {
        this.quiz_title = quiz_title;
    }

    public void setTotal_points(int total_points) {
        this.total_points = total_points;
    }

    public void setTime_allowed(int time_allowed) {
        this.time_allowed = time_allowed;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }


}
