package Ejercicio3;

public class Course {
    private String name;
    private String duration;

    public Course() {

    }

    public Course(String name, String duration) {
        this.name = name;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Curso='" + name + '\'' + ", Duración ='" + duration + '\'';
    }
}
