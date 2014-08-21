package com.company;
import com.company.Humans.Student;
import com.company.Common.Course;

//aaaa

public class Main {
    public static void main(String[] args) {
        Student studentNew= new Student();
        Course Wow= new Course();
        studentNew.name = "Vasia";
        studentNew.course.name ="Trud11";

        studentNew.sayHello();
        studentNew.course.aboutCourse();
        Student studentOld = new Student();
        studentOld.sayHello();
        System.out.println(Wow.name);

    }
}
