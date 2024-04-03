package org.example;

import java.util.ArrayList;
import java.util.List;

public class BadScore extends Scores_Student{
    private int bad_Scores;
    List<BadScore> badScores = new ArrayList<>();

    public BadScore() {

    }
    public BadScore(String name, int scores, int bad_Scores) {
        super(name, scores);
        this.bad_Scores = bad_Scores;
    }

    public int getBad_Scores() {
        return bad_Scores;
    }

    public void setBad_Scores(int bad_Scores) {
        this.bad_Scores = bad_Scores;
    }

    @Override
    public void list_scores() {
       badScores.add(new BadScore("Ly Gia Dao ", 7, 4));
       System.out.println("**********");
       for (BadScore badScore: badScores) {
           System.out.println("Ho va ten: " + badScore.getName());
           System.out.println("Diem: " + badScore.getBad_Scores());
           System.out.println("**********");
       }
    }
}
