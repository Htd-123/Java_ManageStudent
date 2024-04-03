package org.example;

import java.util.ArrayList;
import java.util.List;

public class List_GoodStudent extends Class_GoodStudent {
    List<List_GoodStudent> listGoodStudents = new ArrayList<>();

    public List_GoodStudent() {

    }

    public List_GoodStudent(int grade, String name) {
        super(grade, name);
    }

    @Override
    public void showlist_GoodStudent() {
        listGoodStudents.add(new List_GoodStudent(10, "Phan Nhut Hao"));
        listGoodStudents.add(new List_GoodStudent(11,"Ly Gia Dao"));
        listGoodStudents.add(new List_GoodStudent(12, "Nguyen Van Dung"));
        System.out.println("**********");
        for (List_GoodStudent listGoodStudent: listGoodStudents) {
            System.out.println("Khoi: " + listGoodStudent.getGrade());
            System.out.println("Ho ten hoc sinh: " + listGoodStudent.getName());
            System.out.println("**********");
        }
    }
}
