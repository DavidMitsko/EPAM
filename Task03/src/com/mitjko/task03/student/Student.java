package com.mitjko.task03.student;

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
}
