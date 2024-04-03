package org.example;

import java.util.ArrayList;
import java.util.List;

public class Class_InfoStudent extends Class_Student{
    private String address;
    private String Hotencha;
    private String Hotenme;
    private String phonephuhuynh;
    List<Class_InfoStudent> classInfoStudents = new ArrayList<>();

    public Class_InfoStudent() {

    }
    public Class_InfoStudent(String mssv, String name, String address, String Hotencha, String Hotenme, String phonephuhuynh) {
        super(mssv, name, null, 0);
        this.address = address;
        this.Hotencha = Hotencha;
        this.Hotenme = Hotenme;
        this.phonephuhuynh = phonephuhuynh;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHotencha() {
        return Hotencha;
    }

    public void setHotencha(String hotencha) {
        Hotencha = hotencha;
    }

    public String getHotenme() {
        return Hotenme;
    }

    public void setHotenme(String hotenme) {
        Hotenme = hotenme;
    }

    public String getPhonephuhuynh() {
        return phonephuhuynh;
    }

    public void setPhonephuhuynh(String phonephuhuynh) {
        this.phonephuhuynh = phonephuhuynh;
    }

    public void show_infostudent() {
        classInfoStudents.add(new Class_InfoStudent("1", "Phan Nhut Hao", "Quan 11", "Nguyen Minh Loc", "Le Thi Be", "0987678734"));
        classInfoStudents.add(new Class_InfoStudent("2", "Ly Gia Dao", "Quan 10", "Nguyen Hai Trieu", "Tran Thi Quynh", "0978893478"));
        System.out.println("**********");
        for (Class_InfoStudent classInfoStudent: classInfoStudents) {
            System.out.println("MSSV: " + classInfoStudent.getMssv());
            System.out.println("Ho ten hoc sinh: " + classInfoStudent.getName());
            System.out.println("Dia chi: " + classInfoStudent.getAddress());
            System.out.println("Ho ten cha: " + classInfoStudent.getHotencha());
            System.out.println("Ho ten me: " + classInfoStudent.getHotenme());
            System.out.println("So dien thoai phu huynh: " + classInfoStudent.getPhonephuhuynh());
            System.out.println("**********");
        }
    }
}
