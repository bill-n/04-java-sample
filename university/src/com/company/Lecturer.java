package com.company;

public class Lecturer {

    private String name;
    private Course CourseOfLec;

    @Override
    public String toString() {
        return "Lecturer{" +
                "name='" + name + '\'' +
                ", CourseOfLec=" + CourseOfLec +
                '}';
    }

    public Lecturer(String name, Course courseOfLec) {
        this.name = name;
        CourseOfLec = courseOfLec;
    }
}
