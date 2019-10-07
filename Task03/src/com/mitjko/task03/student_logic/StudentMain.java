package com.mitjko.task03.student_logic;

import com.mitjko.task03.student.Student;
import com.mitjko.task03.student_logic.StudentLogic;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args){
        Student[] students;
        StudentLogic studentLogic;
        Scanner scan = new Scanner(System.in);
        studentLogic = new StudentLogic();
        students= new Student[2];
        for(int i = 0; i < 2; i++){
            students[i] = new Student();
            System.out.println("Enter the name");
            students[i].setName(scan.nextLine());
            System.out.println("Enter the forename");
            students[i].setForename(scan.nextLine());
            System.out.println("Enter the patronymic");
            students[i].setPatronymic(scan.nextLine());
            System.out.println("Enter the group number");
            students[i].setGroupNumber(scan.nextInt());
            System.out.println("Enter the noten");
            int array[];
            array = new int[5];
            for(int j = 0; j < 5; j++){
                array[j] = scan.nextInt();
            }
            students[i].setProgress(array);
        }
        for(int i = 0; i < 2; i++){
            if(studentLogic.find(students[i])){
                System.out.println(students[i].getName() + " " + students[i].getForename() +
                        " " + students[i].getGroupNumber());
            }
        }
    }
}
