package org.example;

import java.util.ArrayList;
import java.util.List;

public class GoodScore extends Scores_Student{
    private int good_Score;
    List<GoodScore> goodScores = new ArrayList<>();

    public GoodScore() {

    }
    public GoodScore (String name, int scores, int good_Score) {
        super(name, scores);
        this.good_Score = good_Score;
    }

    public int getGood_Score() {
        return good_Score;
    }

    public void setGood_Score(int good_Score) {
        this.good_Score = good_Score;
    }
    @Override
    public void list_scores() {
        goodScores.add(new GoodScore("Phan Nhut Hao", 8, 9));
        System.out.println("**********");
        for (GoodScore goodScore: goodScores) {
            System.out.println("Ho va ten: " + goodScore.getName());
            System.out.println("Diem: " + goodScore.getGood_Score());
            System.out.println("**********");
        }
    }
}
