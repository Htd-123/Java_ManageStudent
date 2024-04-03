package org.example;


public class Main {
    public static void main(String[] args) {
        List_Menu listMenu = new List_Menu();
        List_Student listStudent = new List_Student();
        Add_Student addStudent = new Add_Student(listStudent.studentss);
        Class_InfoStudent classInfoStudent = new Class_InfoStudent();
        Scores_Student scoresStudent = new Scores_Student();
        BadScore badScore = new BadScore();
        GoodScore goodScore = new GoodScore();

        listMenu.show_menu();
        int choice = Utils.scanner.nextInt();
        if (choice == 1) {
            listStudent.show_Student();
        } else if (choice == 2) {
            addStudent.add_student();
        } else if (choice == 3) {
            classInfoStudent.show_infostudent();
        } else if (choice == 4) {
            scoresStudent.list_scores();
        } else if (choice == 5) {
            badScore.list_scores();
        } else if (choice == 6) {
            goodScore.list_scores();
        }
    }
}
