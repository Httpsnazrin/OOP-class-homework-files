package lesson6;

public class Student extends Human {
    private String gender;
    private Course course;
    private Course course1;
    private int age;
    private int student_id;
    private int grade;
    Student(String name,int student_id, int grade, int age, String gender, Course course, Course course1){
        super(name);
        this.setGrade(grade);
        this.setStudent_id(student_id);
        this.setGender(gender);
        this.setAge(age);
        this.setCourse(course);
        this.setCourse1(course1);
    }
    void setStudent_id(int student_id){
        this.student_id = student_id;
    }
    void setAge(int age){
        this.age = age;
    }
    void setGender(String gender){
        this.gender = gender;
    }

    public void setCourse1(Course course1) {
        this.course1 = course1;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    void setGrade(int grade){
        this.grade = grade;
    }
    public int getAge(){
        return this.age;
    }

    public Course getCourse() {
        return course;
    }

    public Course getCourse1() {
        return course1;
    }

    public String getGender(){
        return this.gender;
    }
    public int getStudent_id(){
        return this.student_id;
    }
    public int getGrade(){
        return this.grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "gender='" + gender + '\'' +
                ", course=" + course +
                ", age=" + age +
                ", student_id=" + student_id +
                ", grade=" + grade +
                '}';
    }
}
