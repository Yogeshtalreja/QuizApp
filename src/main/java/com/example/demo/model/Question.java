package com.example.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
public class Question {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int id;
        @Column(columnDefinition="TEXT")
        private String text;
        private int points;
        private String type;

        @OneToMany(cascade = {CascadeType.ALL})
        private Set<Choice> choiceList;

        public Question(int id, String text, int points, String type) {
                this.id = id;
                this.text = text;
                this.points = points;
                this.type = type;
        }

        public int getId() {
                return id;
        }

        public String getText() {
                return text;
        }

        public int getPoints() {
                return points;
        }

        public String getType() {
                return type;
        }

        public void setId(int id) {
                this.id = id;
        }

        public void setText(String text) {
                this.text = text;
        }

        public void setPoints(int points) {
                this.points = points;
        }

        public void setType(String type) {
                this.type = type;
        }
}
