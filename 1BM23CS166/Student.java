import java.util.Scanner;

class Subject {
    int subjectMarks;
    int credits;
    int grade;

    void calGrade() {
        grade = subjectMarks / 10 + 1;
        if (grade == 11) {
            grade = 10;
        } else if (grade < 4) {
            grade = 0;
        }
    }
}

class Student1 {
    String name;
    String usn;
    double SGPA;
    double temp = 0.0;
    int totalCredits = 0;
    Subject[] subject;
    Scanner s;

    Student1() {
        subject = new Subject[8];
        for (int i = 0; i < 8; i++) {
            subject[i] = new Subject();
        }
        s = new Scanner(System.in);
    }

    void getStudentDetails() {
        System.out.println("Enter student name and USN:");
        name = s.next();
        usn = s.next();
    }

    void getMarks() {
        System.out.println("Enter marks and credits for 8 subjects:");
        for (int i = 0; i < 8; i++) {
            System.out.println("Enter marks and credits of subject " + (i + 1) + ":");
            subject[i].subjectMarks = s.nextInt();
            subject[i].credits = s.nextInt();
            subject[i].calGrade();
        }
    }

    void calSgpa() {
        for (int i = 0; i < 8; i++) {
            totalCredits += subject[i].credits;
        }
        for (int i = 0; i < 8; i++) {
            temp += subject[i].grade * subject[i].credits;
        }
        SGPA = temp / totalCredits;
        System.out.println("SGPA of " + name + " is " + SGPA);
    }
}

public class student {
    public static void main(String[] args) {
        Student1 stud = new Student1();
        stud.getStudentDetails();
        stud.getMarks();
        stud.calSgpa();
        System.out.println("Lakshya Khandelwal");
        System.out.println("USN = 1BM23CS166");
    }
}
