package Ejercicio3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        ManageCourses manageCourses = new ManageCourses(new ArrayList<>());

        manageCourses.addCourse(new Course("Java", "500"));
        manageCourses.addCourse(new Course("Desarrollo de aplicaciones con Flutter", "350"));
        manageCourses.addCourse(new Course("HTML Y CSS", "200"));
        manageCourses.addCourse(new Course("Full Stack Developer", "590"));

            try{
                manageCourses.getCourses(5);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
    }
}
