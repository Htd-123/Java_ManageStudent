package org.example;

public class Class_Student {
    private String mssv;
    private String name;
    private String lop;
    private int tuoi;


    public Class_Student() {

    }

    public Class_Student(String mssv, String name, String lop, int tuoi) {
      this.mssv = mssv;
      this.name = name;
      this.lop = lop;
      this.tuoi = tuoi;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

}
