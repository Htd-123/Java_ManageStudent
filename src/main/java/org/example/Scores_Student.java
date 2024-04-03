package org.example;

import java.util.ArrayList;
import java.util.List;

public class Scores_Student {
    private String name;
    private int scores;
    List<Scores_Student> listStudent_scores = new ArrayList<>();

    public Scores_Student() {

    }

    public Scores_Student(String name, int scores) {
        this.name = name;
        this.scores = scores;
    }

    public String getName() {
        return name;
    }

    public void setScores(int scores) {
        this.scores = scores;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScores() {
        return scores;
    }
    public void list_scores() {
        listStudent_scores.add(new Scores_Student("Phan Nhut Hao", 7));
        listStudent_scores.add(new Scores_Student("Ly Gia Dao", 8));

        System.out.println("**********");
        for (Scores_Student listStudent_scores: listStudent_scores) {
            System.out.println("Ho va ten: " + listStudent_scores.getName());
            System.out.println("Diem: " + listStudent_scores.getScores());
            System.out.println("**********");
        }
    }
}
