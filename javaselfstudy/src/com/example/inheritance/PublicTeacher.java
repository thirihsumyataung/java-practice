package com.example.inheritance;

public class PublicTeacher extends Teacher{

    public static void main(String[] args){
        String mainTeacher = "Java Instructor";
        String workPlace = "Udemy";
        PublicTeacher aTeacher = new PublicTeacher();
        System.out.println(aTeacher.getJobDescription());
        aTeacher.setJobDescription(mainTeacher);
        aTeacher.setWorkAt(workPlace);
        System.out.println(aTeacher.getWorkAt());
        aTeacher.display();
    }
}

/*

 */