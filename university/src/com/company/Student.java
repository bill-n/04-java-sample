package com.company;

public class Student {

    private String name;
    private int stdID;
    private Level levelStd;

    public Student(String name, int stdID, Level levelStd) {
        this.name = name;
        this.stdID = stdID;
        this.levelStd = levelStd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStdID() {
        return stdID;
    }

    public void setStdID(int stdID) {
        this.stdID = stdID;
    }

    public Level getLevelStd() {
        return levelStd;
    }

    public void setLevelStd(Level levelStd) {
        this.levelStd = levelStd;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", stdID=" + stdID +
                ", levelStd=" + levelStd +
                '}';
    }
}
