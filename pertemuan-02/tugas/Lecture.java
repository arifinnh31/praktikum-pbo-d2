/* 
 * File      : Lecture.java 28/02/24
 * Penulis   : Arifin Nurmuhammad Haris
 * Deskripsi : File Kelas Lecture
 */

import java.util.List;
import java.util.ArrayList;

public class Lecture {
    private String name;
    private int age;
    private String address;
    private int employeeID;
    private List<Course> coursesTaught;
    static List<Lecture> lecturers = new ArrayList<>();

    public Lecture(String name, int age, String address, int employeeID) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.employeeID = employeeID;
        this.coursesTaught = new ArrayList<>();
        lecturers.add(this);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void getDetails() {
        System.out.println("Lecturer Name\t: " + getName());
        System.out.println("Lecturer Age\t: " + getAge());
        System.out.println("Lecturer Address: " + getAddress());
        System.out.println("Lecturer ID\t: " + getEmployeeID());
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