import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.name = "John Doe";

        student1.id= 11111;
        student1.studentID=1;
        student1.email="john@doe.com";
        student1.enrollmentDate= "22.10.2024";
        student1.courses= new ArrayList<>();

        StudentManager studentManager = new StudentManager();
        studentManager.addStudent(student1);
        studentManager.addCourseToStudent(student1,"Full Stack Java Springboot / React Course");


        Instructor instructor1 = new Instructor();
        instructor1.name = "Engin Demirog";
        instructor1.id= 22222;
        instructor1.age=30;
        instructor1.department="Software Engineering";

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.addInstructor(instructor1);
        instructorManager.addCourseToInstructor(instructor1, "Full Stack Java Springboot / React Course");

        UserManager userManager = new UserManager();
        userManager.assignToCourse(student1,instructor1);



    }
}