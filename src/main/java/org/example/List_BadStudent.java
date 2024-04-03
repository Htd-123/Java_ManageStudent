package org.example;

import java.util.ArrayList;
import java.util.List;

public class List_BadStudent implements Class_BadStudent {
    private int grade;
    private String name;
    List<List_BadStudent> listBadStudents = new ArrayList<>();
    public List_BadStudent() {

    }
    public List_BadStudent(int grade, String name) {
        this.grade = grade;
        this.name = name;
    }
    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void showlist_BadStudent() {
        listBadStudents.add(new List_BadStudent(10, "Ly Gia Dao"));
        listBadStudents.add(new List_BadStudent(11,"Mai Van Duong"));
        System.out.println("**********");
        for (List_BadStudent listBadStudent: listBadStudents) {
            System.out.println("Ho ten hoc sinh: " + listBadStudent.getGrade());
            System.out.println("Dia chi: " + listBadStudent.getName());
            System.out.println("**********");
        }
    }
}
