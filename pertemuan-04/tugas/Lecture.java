/* 
 * File      : Lecture.java    28/02/24
 * Penulis   : Arifin Nurmuhammad Haris
 * Deskripsi : File Kelas Lecture
 */

import java.util.List;
import java.util.ArrayList;

public class Lecture extends Person {
    private int employeeID;
    private List<Course> coursesTaught;
    static List<Lecture> lecturers = new ArrayList<>();

    public Lecture(String name, int age, String address, int employeeID) {
        super(name, age, address);
        this.employeeID = employeeID;
        this.coursesTaught = new ArrayList<>();
        lecturers.add(this);
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Employee ID\t: " + employeeID);
    }

    public void teachCourse(Course course) {
        if (!coursesTaught.contains(course)) {
            coursesTaught.add(course);
            course.addLecture(this);
        }
    }

    public void viewTaughtCourses() {
        System.out.println("Courses taught by " + getName() + ":");
        for (int i = 0; i < coursesTaught.size(); i++) {
            System.out.println((i + 1) + ".");
            coursesTaught.get(i).getDetails();
        }
    }
}