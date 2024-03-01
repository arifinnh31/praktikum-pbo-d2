/* 
 * File      : Student.java 28/02/24
 * Penulis   : Arifin Nurmuhammad Haris
 * Deskripsi : File Kelas Student
 */

import java.util.List;
import java.util.ArrayList;

public class Student {
    private String name;
    private int age;
    private String address;
    private int studentID;
    private List<Course> coursesEnrolled;
    static List<Student> students = new ArrayList<>();

    public Student(String name, int age, String address, int studentID) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.studentID = studentID;
        this.coursesEnrolled = new ArrayList<>();
        students.add(this);
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

    public int getStudentID() {
        return studentID;
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

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void getDetails() {
        System.out.println("Student Name\t: " + getName());
        System.out.println("Student Age\t: " + getAge());
        System.out.println("Student Address\t: " + getAddress());
        System.out.println("Student ID\t: " + getStudentID());
    }

    public void enrollInCourse(Course course) {
        if (!coursesEnrolled.contains(course)) {
            coursesEnrolled.add(course);
            course.addStudent(this);
        }
    }

    public void dropCourse(Course course) {
        if (coursesEnrolled.contains(course)) {
            coursesEnrolled.remove(course);
            course.removeStudent(this);
        }
    }

    public void viewEnrolledCourses() {
        System.out.println("Courses enrolled by " + getName() + ":");
        for (int i = 0; i < coursesEnrolled.size(); i++) {
            System.out.println((i + 1) + ".");
            coursesEnrolled.get(i).getDetails();
        }
    }
}