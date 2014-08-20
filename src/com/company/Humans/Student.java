package com.company.Humans;
//import com.company.Humans.Student;
//import com.company.Buildings.Building;
import com.company.Common.Course;
public class Student {

    public String name= "N/A";
    public int age=15;
    public Course course = new Course();
    //metod deistvie
    public void sayHello() {
        System.out.println("Hello1111");
        System.out.println("My name is "+ name);
        System.out.println("My age is "+ age);
        course.aboutCourse();

    }

}
