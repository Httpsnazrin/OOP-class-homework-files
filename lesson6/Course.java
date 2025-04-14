package lesson6;

public class Course {
    private String course;
    Course(String course){
        this.setCourse(course);
    }
    void setCourse(String course){
        this.course = course;
    }
    public String getCourse(){
        return  this.course;
    }
    @Override
    public String toString() {
        return "Course{" +
                "course='" + course + '\'' +
                '}';
    }
}
