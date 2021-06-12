package com.example.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
public class Choice {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String text;
    private Boolean correct_option;

    public Choice(int id, String text, Boolean correct_option) {
        this.id = id;
        this.text = text;
        this.correct_option = correct_option;
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public Boolean getCorrect_option() {
        return correct_option;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setCorrect_option(Boolean correct_option) {
        this.correct_option = correct_option;
    }
}
