package com.company.FunctionalProgramming;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample2 {
    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();
        //
        Consumer<Instructor> c1 = (s1)-> System.out.println(s1);
        instructors.forEach(c1);

        // getting only names
        Consumer<Instructor> c2 = (s1) -> System.out.println(s1.getName());
        instructors.forEach(c2);

        //name and courses
        Consumer<Instructor> c3 = (s1)-> System.out.println(s1.getCourses());
        instructors.forEach(c2.andThen(c3));

        //with exp more than 5
        instructors.forEach(s1->{
            if(s1.yearOfExperience>5){
                c1.accept(s1);
            }
        });

        //exp more than 5 and online teach
        instructors.forEach(s1->{
            if(s1.yearOfExperience>5 && !s1.isOnlineCourse())
                c1.andThen(c2).accept(s1);
        });


    }
}
