package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Add_Student {
    Scanner scanner = new Scanner(System.in);
    List<Class_Student> students = new ArrayList<>();

    public Add_Student(List<Class_Student> students) {
       this.students = students;
    }

    public void add_student() {
        System.out.println("Nhap thong tin sinh vien");
        System.out.println("MSSV: ");
        String mssv = scanner.nextLine();
        System.out.println("Ho va ten: ");
        String hovaten = scanner.nextLine();
        System.out.println("Lop: ");
        String lop = scanner.nextLine();
        System.out.println("Tuoi: ");
        int tuoi = scanner.nextInt();

        Class_Student newstudent = new Class_Student(mssv, hovaten, lop, tuoi);
        students.add(newstudent);
        System.out.println("Danh sach sau khi them moi");
        for (Class_Student student: students) {
            System.out.println("MSSV: " + student.getMssv());
            System.out.println("Ho va ten: " + student.getName());
            System.out.println("Lop: " + student.getLop());
            System.out.println("Tuoi: " + student.getTuoi());
            System.out.println("**********");
        }
    }
}
