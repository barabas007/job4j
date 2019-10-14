package pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName(" Igor Shilov");
        student.setGroup("Java");
        student.setEnrolled(new Date());
        System.out.println(student.getName() + "name" + student.getGroup() + "name group" + student.getEnrolled());
    }
}
