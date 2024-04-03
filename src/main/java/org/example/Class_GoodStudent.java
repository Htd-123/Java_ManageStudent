package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Class_GoodStudent {
    private int grade;
    private String name;
    List<Class_Student> classStudents = new ArrayList<>();
    public Class_GoodStudent() {

    }
    public Class_GoodStudent(int grade, String name) {
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
    public abstract void showlist_GoodStudent();
}
