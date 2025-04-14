package lesson6;

public class Teacher extends Human implements Teachable {
    private Course coursename;
    private int teacher_id;
    private int age;
    private String gender;
    Teacher(String name, Course coursename, int teacher_id, int age, String gender){
        super(name);
        this.setCoursename(coursename);
        this.setGender(gender);
        this.setTeacher_id(teacher_id);
        this.setAge(age);


    }

    public void setTeacher_id(int teacher_id) {
        this.teacher_id = teacher_id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public int getTeacher_id() {
        return teacher_id;
    }

    public String getGender() {
        return gender;
    }

    void setCoursename(Course coursename){
        this.coursename = coursename;
    }
    public Course getCoursename(){
        return this.coursename;
    }


    @Override
    public void teaching() {
        System.out.println("Teacher is teaching the lesson");
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "coursename=" + coursename +
                ", teacher_id=" + teacher_id +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
