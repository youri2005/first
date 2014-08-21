package com.company;
import com.company.Humans.Student;
import com.company.Common.Course;



public class Main {
    public static void main(String[] args) {
        Student studentNew= new Student();
        Course Wow= new Course();
        studentNew.name = "Vasirrrra";
        studentNew.course.name ="Trud";

        studentNew.sayHello();
        studentNew.course.aboutCourse();
        Student studentOld = new Student();
        studentOld.sayHello();
        System.out.println(Wow.name);

    }
}
//111111111