package lesson6;

public class Exam {
    private Course course;
    private Student student;
    private Teacher teacher;
    private int examduration;
    private String date;

    Exam(Course course, Student student, Teacher teacher, int examduration, String date){
        this.setCourse(course);
        this.setDate(date);
        this.setExamduration(examduration);
        this.setStudent(student);
        this.setTeacher(teacher);
    }
    public Course getCourse() {
        return course;
    }
    public int getExamduration() {
        return examduration;
    }
    public String getDate() {
        return date;
    }
    public Student getStudent() {
        return student;
    }
    public Teacher getTeacher() {
        return teacher;
    }
    public void setCourse(Course course) {
        this.course = course;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public void setExamduration(int examduration) {
        this.examduration = examduration;
    }
    public void setStudent(Student student) {
        this.student = student;
    }
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "course=" + course +
                ", student=" + student +
                ", teacher=" + teacher +
                ", examduration=" + examduration +
                ", date='" + date + '\'' +
                '}';
    }
}
