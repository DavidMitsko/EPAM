package com.mitjko.task03.student_logic;

import com.mitjko.task03.student.Student;

public class StudentLogic {
    public boolean find(Student student){
        for(int i = 0; i < 5; i++){
            if(student.getProgressI(i) < 9)
                return false;
        }
        return true;
    }
}
