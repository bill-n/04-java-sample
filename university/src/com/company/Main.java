package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        List<Student> allStudents = Arrays.asList(
                new Student("Bam Billy", 001, Level.First_Year),
                new Student("Sam Moorehouse", 001, Level.Third_Year),
                new Student("Mary Martha", 001, Level.Second_Year),
                new Student("Magnet Tower", 001, Level.Fourth_Year),
                new Student("Tally Shisha", 002, Level.First_Year),
                new Student("Sam Moorehouse", 002, Level.Third_Year),
                new Student("Bright Opong", 002, Level.Second_Year),
                new Student("Freda Ben", 002, Level.Fourth_Year),
                new Student("Trido Carley", 003, Level.First_Year),
                new Student("French Hawards", 003, Level.Third_Year),
                new Student("Frank Alo", 003, Level.Second_Year),
                new Student("Tracy Hills", 003, Level.Fourth_Year),
                new Student("Yolo Trolly Bowels", 004, Level.First_Year),
                new Student("Try Catch Davids", 004, Level.Third_Year),
                new Student("Catherine Agyekum", 004, Level.Second_Year),
                new Student("Manny Gardens", 004, Level.Fourth_Year)


        );


        List<Student> level1_std = new ArrayList<>();

        for (Student std : allStudents) {
            if (std.getLevelStd() == Level.First_Year) {
                level1_std.add(std);
            }

        }

        Lecturer k = new Lecturer("Mr. Bangladesh Ackon", Course.Programming);

        Courses_studied c = new Courses_studied(k, level1_std);

        System.out.println(c);


        List<Student> gardening_std = new ArrayList<>();

        for (Student std3 : allStudents) {
            if (std3.getLevelStd() == Level.Third_Year) {
                gardening_std.add(std3);
            }
        }

        for (Student std4 : allStudents) {
            if (std4.getLevelStd() == Level.Fourth_Year) {
                gardening_std.add(std4);
            }
        }

        // System.out.println(Collections.singletonList(gardening_std));

        List<Student> Physics_std = new ArrayList<>();

        List<Student> fourth_year_students = new ArrayList<>();
        for (Student std4 : allStudents) {
            if (std4.getLevelStd() == Level.Fourth_Year) {

                String s = std4.getName();


                if (    std4.getName().startsWith("A") ||
                        std4.getName().startsWith("F")
                ) {
                    fourth_year_students.add(std4);
                    System.out.println(std4);
                }
            }

        }
    }
}