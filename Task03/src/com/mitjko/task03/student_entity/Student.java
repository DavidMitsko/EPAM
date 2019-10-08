package com.mitjko.task03.student_entity;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private String name;
    private String forename;
    private String patronymic;
    private int groupNumber;
    private int[] progress;

    public Student(){
        name = new String();
        forename = new String();
        patronymic = new String();
        progress = new int[5];
    }

    public Student(String name, String forename, String patronymic, int groupNumber, int[] progress) {
        this.name = name;
        this.forename = forename;
        this.patronymic = patronymic;
        this.groupNumber = groupNumber;
        this.progress = progress;
    }

    public int getProgressI(int i){
        return progress[i];
    }

    public int[] getProgress() {
        return progress;
    }

    public void setProgress(int[] progress) {
        this.progress = progress;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forname) {
        this.forename = forname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String fatherName) {
        this.patronymic = fatherName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if(o == null){
            return false;
        }
        if(this.getClass() != o.getClass()){
            return false;
        }
        Student student = (Student) o;
        return groupNumber == student.groupNumber &&
                name.equals(student.name) &&
                forename.equals(student.forename) &&
                patronymic.equals(student.patronymic) &&
                Arrays.equals(progress, student.progress);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, forename, patronymic, groupNumber);
        result = 31 * result + Arrays.hashCode(progress);
        return result;
    }
}
