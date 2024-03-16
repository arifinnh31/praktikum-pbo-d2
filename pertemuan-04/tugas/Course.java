/* 
 * File      : Course.java    28/02/24
 * Penulis   : Arifin Nurmuhammad Haris
 * Deskripsi : File Kelas Course
 */

import java.util.List;
import java.util.ArrayList;

public class Course {
    private String courseCode;
    private String courseName;
    private List<Lecture> lecturer;
    private List<Student> studentsEnrolled;
    static List<Course> courses = new ArrayList<>();

    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.lecturer = new ArrayList<>();
        this.studentsEnrolled = new ArrayList<>();
        courses.add(this);
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    
    public void addLecture(Lecture lecture) {
        if (!lecturer.contains(lecture)) {
            lecturer.add(lecture);
            lecture.teachCourse(this);
        }
    }

    public void addStudent(Student student) {
        if (!studentsEnrolled.contains(student)) {
            studentsEnrolled.add(student);
            student.enrollInCourse(this);
        }
    }

    public void removeStudent(Student student) {
        if (studentsEnrolled.contains(student)) {
            studentsEnrolled.remove(student);
            student.dropCourse(this);
        }
    }

    public void viewLecturers() {
        System.out.println("Lecturers teaching " + getCourseName() + ":");
        for (int i = 0; i < lecturer.size(); i++) {
            System.out.println((i + 1) + ".");
            lecturer.get(i).getDetails();
        }
    }

    public void viewEnrolledStudents() {
        System.out.println("Students enrolled in " + getCourseName() + ":");
        for (int i = 0; i < studentsEnrolled.size(); i++) {
            System.out.println((i + 1) + ".");
            studentsEnrolled.get(i).getDetails();
        }
    }

    public void getDetails() {
        System.out.println("Course Code\t: " + getCourseCode());
        System.out.println("Course Name\t: " + getCourseName());
        System.out.print("Lecturer\t: ");
        for (int i = 0; i < lecturer.size(); i++) {
            System.out.print(lecturer.get(i).getName());
            if (i < lecturer.size() - 1) System.out.print(", ");
        }
        System.out.println();
    }
}