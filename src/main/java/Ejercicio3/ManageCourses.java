package Ejercicio3;

import java.util.ArrayList;

public class ManageCourses {

    ArrayList<Course> courses;

    public ManageCourses() {

    }

    public ManageCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public void addCourse(Course course) {

        if (course == null) {
            throw new IllegalArgumentException("El curso no puede ser nulo");
        }
        if (course.getName() == null || course.getName().trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del curso no puede ser nulo o vacío");
        }
        courses.add(course);
    }

    public boolean isIndex(int index) {
        if (index < 0 || index > courses.size() - 1) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " no existe o fuera de rango");
        }
        return true;
    }

    public void getCourses(int index) {
        if (index < 0 || index > courses.size() - 1) {
            throw new ArrayIndexOutOfBoundsException("Index" + index + "no existe o fuera de rango");
        } else {
            try {
                System.out.println(courses.get(index));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

}

