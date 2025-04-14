package lesson6;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        Course math = new Course("Math");
        Course english = new Course("English");
        Course chemistry = new Course("Chemistry");
        Student student = new Student("Cristin",1,70,19,"Male", math, english);
        Student student1 = new Student("Jane", 2, 85, 22, "Female", english, chemistry);
        Student student2 = new Student("Jessica", 3, 88, 21, "Female", chemistry, math);
        Student student3 = new Student("Elliot", 4, 76, 20, "Male", english, math);
        Student student4 = new Student("Walter Jr", 5, 73, 18, "Male", chemistry, english);
        Teacher teacher1 = new Teacher("Skyling", math, 101, 41, "Female");
        Teacher teacher2 = new Teacher("Samanta", chemistry, 100, 49, "Female");
        Teacher teacher3 = new Teacher("Henry", english, 102, 43, "Male");
        Exam exam1 = new Exam(math, student, teacher1, 90, "27 April");
        Exam exam2 = new Exam(english, student1, teacher3, 60, "31 March");
        Exam exam3 = new Exam(chemistry, student2, teacher2, 120, "13 September");
        ObjectMapper objectMapper = new ObjectMapper();
        try{
            objectMapper.writeValue(new File("student.json"), student);
            objectMapper.writeValue(new File("student1.json"), student1);
            objectMapper.writeValue(new File("student2.json"), student2);
            objectMapper.writeValue(new File("student3.json"), student3);
            objectMapper.writeValue(new File("student4.json"), student4);
            objectMapper.writeValue(new File("teacher1.json"), teacher1);
            objectMapper.writeValue(new File("teacher2.json"), teacher2);
            objectMapper.writeValue(new File("teacher3.json"), teacher3);
            objectMapper.writeValue(new File("course1.json"), math);
            objectMapper.writeValue(new File("course2.json"), english);
            objectMapper.writeValue(new File("course3.json"), chemistry);
            objectMapper.writeValue(new File("exam1.json"), exam1);
            objectMapper.writeValue(new File("exam2.json"), exam2);
            objectMapper.writeValue(new File("exam3.json"), exam3);
            System.out.println("Data has been written");
        } catch (IOException e){
            e.printStackTrace();

        }
    }

}
