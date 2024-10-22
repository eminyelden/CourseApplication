public class InstructorManager {

    public void addInstructor(Instructor instructor) {
        System.out.println(instructor.name + " is added to the list");

    }

    public void addInstructorMultiple(Instructor[] instructors) {
        for (Instructor instructor : instructors) {
            addInstructor(instructor);
        }
    }

    public void addCourseToInstructor(Instructor instructor, String courseName) {
        instructor.courses.add(courseName);
        System.out.println(instructor.name + " is going to teach  "+ courseName + " course.");


    }
}
