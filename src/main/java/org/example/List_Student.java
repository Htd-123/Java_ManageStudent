package org.example;

import java.util.ArrayList;
import java.util.List;

public class List_Student {
    List<Class_Student> studentss = new ArrayList<>();

    public List_Student() {
        studentss.add(new Class_Student("1","Phan Nhựt Hào", "10", 15));
        studentss.add(new Class_Student("2", "Ly Gia Dao", "10", 15));
    }

    //In danh sách sinh viên
    public void show_Student() {
        System.out.println("**********");
        for (Class_Student student: studentss) {
            System.out.println("MSSV: " + student.getMssv());
            System.out.println("Ho va ten: " + student.getName());
            System.out.println("Lop: " + student.getLop());
            System.out.println("Tuoi: " + student.getTuoi());
            System.out.println("**********");
        }
    }
}
