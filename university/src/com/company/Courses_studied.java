package com.company;

import java.util.List;

public class Courses_studied {
    private final List<Student> student;

    private Lecturer Lecturer;
    private List<Student> students;
    private Level levelOfStudy;

    public Courses_studied(Lecturer lecturer, List<Student> students) {
        Lecturer = lecturer;
        this.student = students;
    }

    public Lecturer getLecturer() {
        return Lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        Lecturer = lecturer;
    }

    public void setStudent(Student student) {
        this.students = students;
    }

    public Level getLevelOfStudy() {
        return levelOfStudy;
    }

    public void setLevelOfStudy(Level levelOfStudy) {
        this.levelOfStudy = levelOfStudy;
    }

    @Override
    public String toString() {
        return "Courses_studied{" +
                "student=" + student +
                ", Lecturer=" + Lecturer +
                ", students=" + students +
                ", levelOfStudy=" + levelOfStudy +
                '}';
    }
}
