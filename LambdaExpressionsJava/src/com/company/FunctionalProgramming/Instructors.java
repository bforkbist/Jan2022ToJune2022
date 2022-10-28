package com.company.FunctionalProgramming;

import java.util.Arrays;
import java.util.List;

public class Instructors {
    public static List<Instructor> getAll(){
        Instructor instructor = new Instructor("Aditya",10,"develpoer","m",true, Arrays.asList("c","d"));
        Instructor instructor1 = new Instructor("Aitya",1,"develpoer","f",false, Arrays.asList("c","d"));
        Instructor instructor2 = new Instructor("Adiya",30,"develpoer","m",true, Arrays.asList("c","d"));
        return Arrays.asList(instructor,instructor1,instructor2);
    }
}
