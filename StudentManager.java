public class StudentManager {



    public void addStudent(Student student) {
        System.out.println(student.name + " is added to the list");

    }

    public void addStudentMultiple(Student[] students) {
        for (Student student : students) {
            addStudent(student);
        }
    }

    public void addCourseToStudent(Student student, String courseName) {
        student.courses.add(courseName);
        System.out.println(courseName + " added to " + student.name);
    }


}
