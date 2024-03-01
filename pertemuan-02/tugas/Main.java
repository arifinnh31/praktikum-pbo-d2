/* 
 * File      : Main.java    28/02/24
 * Penulis   : Arifin Nurmuhammad Haris
 * Deskripsi : File Main Program
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        loadData();

        while (true) {
            System.out.println("Main Menu:");
            System.out.println("1. View all students menu");
            System.out.println("2. View all lecturers menu");
            System.out.println("3. View all courses menu");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            Scanner scanner = new Scanner(System.in);
            char option = scanner.next().charAt(0);
            System.out.println();
            scanner.nextLine();
            
            switch (option) {
                case '1': studentMenu(scanner); break;
                case '2': lectureMenu(scanner); break;
                case '3': courseMenu(scanner); break;
                case '4': exit(scanner); break;
                default: System.out.println("Invalid option!"); break;
            }
            
            while (true) {
                System.out.print("\nDo you want to continue? (y/n): ");
                String answer = scanner.nextLine();
                System.out.println();
                if (answer.toLowerCase().equals("y")) break;
                if (answer.toLowerCase().equals("n")) exit(scanner);
            }
        }
    }

    static void loadData() {
        Course pbo = new Course("PAIK6401", "Pemrograman Berorientasi Objek");
        Course mbd = new Course("PAIK6403", "Manajemen Basis Data");
        Course asa = new Course("PAIK6601", "Analisis dan Strategi Algoritma");

        Lecture edySuharto = new Lecture("Edy Suharto, S.T., M.Kom", 43, "Semarang", 41002);
        Lecture betaNoranita = new Lecture("Beta Noranita, S.Si., M.Kom.", 50, "Semarang", 22001);
        Lecture adiWibowo = new Lecture("Dr.Eng. Adi Wibowo, S.Si., M.Kom.", 41, "Semarang", 41002);

        Student naufal = new Student("Naufal Rizki Saputra", 20, "Semarang", 20011);
        Student arifin = new Student("Arifin Nurmuhammad Haris", 20, "Tangerang", 30059);
        Student yudhis = new Student("Muhammad Ahsan Yudhistira", 19, "Magelang", 30083);

        edySuharto.teachCourse(pbo);
        edySuharto.teachCourse(mbd);
        betaNoranita.teachCourse(mbd);
        adiWibowo.teachCourse(asa);

        pbo.addStudent(naufal);
        pbo.addStudent(arifin);
        pbo.addStudent(yudhis);

        mbd.addStudent(naufal);
        mbd.addStudent(arifin);
        mbd.addStudent(yudhis);

        asa.addStudent(naufal);
        asa.addStudent(arifin);
        asa.addStudent(yudhis);
    }

    static void studentMenu(Scanner scanner) {
        System.out.println("Student Menu:");
        System.out.println("1. View all students");
        System.out.println("2. Add a student");
        System.out.println("3. Remove a student");
        System.out.println("4. Enroll a student in a course");
        System.out.println("5. Drop a student from a course");
        System.out.println("6. View enrolled courses of a student");
        System.out.print("Choose an option: ");
        char option = scanner.next().charAt(0);
        System.out.println();
        scanner.nextLine();

        switch (option) {
            case '1': 
                for (int i = 0; i < Student.students.size(); i++) {
                    System.out.println((i + 1) + ".");
                    Student.students.get(i).getDetails();
                }
                break;
            case '2': 
                System.out.print("Enter student name\t: "); String name = scanner.nextLine();
                System.out.print("Enter student age\t: "); int age = scanner.nextInt(); scanner.nextLine();
                System.out.print("Enter student address\t: "); String address = scanner.nextLine();
                System.out.print("Enter student ID\t: "); int studentID = scanner.nextInt(); scanner.nextLine();
                new Student(name, age, address, studentID);
                System.out.println("Student added successfully!");
                break;
            case '3': 
                for (int i = 0; i < Student.students.size(); i++) System.out.println((i + 1) + ". " + Student.students.get(i).getName());
                System.out.print("Enter the number of the student to remove: "); int index = scanner.nextInt() - 1; scanner.nextLine();
                Student.students.remove(index);
                System.out.println("Student removed successfully!");
                break;
            case '4': 
                for (int i = 0; i < Student.students.size(); i++) System.out.println((i + 1) + ". " + Student.students.get(i).getName());
                System.out.print("Enter the number of the student to enroll: "); int studentIndex = scanner.nextInt() - 1; scanner.nextLine();
                Student student = Student.students.get(studentIndex);
                for (int i = 0; i < Course.courses.size(); i++) System.out.println((i + 1) + ". " + Course.courses.get(i).getCourseName());
                System.out.print("Enter the number of the course to enroll the student in: "); int courseIndex = scanner.nextInt() - 1; scanner.nextLine();
                Course course = Course.courses.get(courseIndex);
                course.addStudent(student);
                System.out.println("Student enrolled successfully!");
                break;
            case '5': 
                for (int i = 0; i < Student.students.size(); i++) System.out.println((i + 1) + ". " + Student.students.get(i).getName());
                System.out.print("Enter the number of the student to drop: "); studentIndex = scanner.nextInt() - 1; scanner.nextLine();
                student = Student.students.get(studentIndex);
                for (int i = 0; i < Course.courses.size(); i++) System.out.println((i + 1) + ". " + Course.courses.get(i).getCourseName());
                System.out.print("Enter the number of the course to drop the student from: "); courseIndex = scanner.nextInt() - 1; scanner.nextLine();
                course = Course.courses.get(courseIndex);     
                course.removeStudent(student);
                System.out.println("Student dropped successfully!");
                break;
            case '6':
                for (int i = 0; i < Student.students.size(); i++) System.out.println((i + 1) + ". " + Student.students.get(i).getName());
                System.out.print("Enter the number of the student to view enrolled courses: "); studentIndex = scanner.nextInt() - 1; scanner.nextLine();
                student = Student.students.get(studentIndex);
                student.viewEnrolledCourses();
                break;
            default:
                System.out.println("Invalid option!");
                break;
        }
    }

    static void lectureMenu(Scanner scanner) {
        System.out.println("Lecture Menu:");
        System.out.println("1. View all lectures");
        System.out.println("2. Add a lecture");
        System.out.println("3. Make a lecture teach a course");
        System.out.println("4. View taught courses of a lecture");
        System.out.print("Choose an option: ");
        char option = scanner.next().charAt(0);
        System.out.println();
        scanner.nextLine();

        switch (option) {
            case '1': 
                for (int i = 0; i < Lecture.lecturers.size(); i++) {
                    System.out.println((i + 1) + ".");
                    Lecture.lecturers.get(i).getDetails();
                }
                break;
            case '2': 
                System.out.print("Enter lecture name\t: "); String name = scanner.nextLine();
                System.out.print("Enter lecture age\t: "); int age = scanner.nextInt(); scanner.nextLine();
                System.out.print("Enter lecture address\t: "); String address = scanner.nextLine();
                System.out.print("Enter lecture ID\t: "); int lectureID = scanner.nextInt(); scanner.nextLine();
                new Lecture(name, age, address, lectureID);
                System.out.println("Lecture added successfully!");
                break;
            case '3': 
                for (int i = 0; i < Lecture.lecturers.size(); i++) System.out.println((i + 1) + ". " + Lecture.lecturers.get(i).getName());
                System.out.print("Enter the number of the lecture to make teach a course: "); int lectureIndex = scanner.nextInt() - 1; scanner.nextLine();
                Lecture lecture = Lecture.lecturers.get(lectureIndex);        
                for (int i = 0; i < Course.courses.size(); i++) System.out.println((i + 1) + ". " + Course.courses.get(i).getCourseName());
                System.out.print("Enter the number of the course to make the lecture teach: "); int courseIndex = scanner.nextInt() - 1; scanner.nextLine();
                Course course = Course.courses.get(courseIndex);
                lecture.teachCourse(course);
                System.out.println("Lecture taught course successfully!");
                break;
            case '4':
                for (int i = 0; i < Lecture.lecturers.size(); i++) System.out.println((i + 1) + ". " + Lecture.lecturers.get(i).getName());
                System.out.print("Enter the number of the lecture to view taught courses: "); lectureIndex = scanner.nextInt() - 1; scanner.nextLine();
                lecture = Lecture.lecturers.get(lectureIndex);
                lecture.viewTaughtCourses();
                break;
            default: 
                System.out.println("Invalid option!");
                break;
        }
    }

    static void courseMenu(Scanner scanner) {
        System.out.println("Course Menu:");
        System.out.println("1. View all courses");
        System.out.println("2. Add a course");
        System.out.println("3. Remove a course");
        System.out.println("4. Add a lecture to a course");
        System.out.println("5. Add a student to a course");
        System.out.println("6. Remove a student from a course");
        System.out.println("7. View lecturers of a course");
        System.out.println("8. View enrolled students of a course");
        System.out.print("Choose an option: ");
        char option = scanner.next().charAt(0);
        scanner.nextLine();
        System.out.println();

        switch (option) {
            case '1': 
                for (int i = 0; i < Course.courses.size(); i++) {
                    System.out.println((i + 1) + ".");
                    Course.courses.get(i).getDetails();
                }
                break;
            case '2': 
                System.out.print("Enter course code\t: "); String code = scanner.nextLine();
                System.out.print("Enter course name\t: "); String name = scanner.nextLine();
                new Course(code, name);
                System.out.println("Course added successfully!");
                break;
            case '3':
                for (int i = 0; i < Course.courses.size(); i++) System.out.println((i + 1) + ". " + Course.courses.get(i).getCourseName());
                System.out.print("Enter the number of the course to remove: "); int index = scanner.nextInt() - 1; scanner.nextLine();
                Course.courses.remove(index);
                System.out.println("Course removed successfully!");
                break;
            case '4':
                for (int i = 0; i < Course.courses.size(); i++) System.out.println((i + 1) + ". " + Course.courses.get(i).getCourseName());
                System.out.print("Enter the number of the course to add a lecture to: "); int courseIndex = scanner.nextInt() - 1; scanner.nextLine();
                Course course = Course.courses.get(courseIndex);
                for (int i = 0; i < Lecture.lecturers.size(); i++) System.out.println((i + 1) + ". " + Lecture.lecturers.get(i).getName());
                System.out.print("Enter the number of the lecture to add to the course: "); int lectureIndex = scanner.nextInt() - 1; scanner.nextLine();
                Lecture lecture = Lecture.lecturers.get(lectureIndex);
                course.addLecture(lecture);
                System.out.println("Lecture added to course successfully!");
                break;
            case '5':
                for (int i = 0; i < Course.courses.size(); i++) System.out.println((i + 1) + ". " + Course.courses.get(i).getCourseName());
                System.out.print("Enter the number of the course to add a student to: "); courseIndex = scanner.nextInt() - 1; scanner.nextLine();
                course = Course.courses.get(courseIndex);
                for (int i = 0; i < Student.students.size(); i++) System.out.println((i + 1) + ". " + Student.students.get(i).getName());
                System.out.print("Enter the number of the student to add to the course: "); int studentIndex = scanner.nextInt() - 1; scanner.nextLine();
                Student student = Student.students.get(studentIndex);
                course.addStudent(student);
                System.out.println("Student added to course successfully!");
                break;
            case '6':
                for (int i = 0; i < Course.courses.size(); i++) System.out.println((i + 1) + ". " + Course.courses.get(i).getCourseName());
                System.out.print("Enter the number of the course to remove a student from: "); courseIndex = scanner.nextInt() - 1; scanner.nextLine();
                course = Course.courses.get(courseIndex);
                for (int i = 0; i < Student.students.size(); i++) System.out.println((i + 1) + ". " + Student.students.get(i).getName());
                System.out.print("Enter the number of the student to remove from the course: "); studentIndex = scanner.nextInt() - 1; scanner.nextLine();
                student = Student.students.get(studentIndex);
                course.removeStudent(student);
                System.out.println("Student removed from course successfully!");
                break;
            case '7':
                for (int i = 0; i < Course.courses.size(); i++) System.out.println((i + 1) + ". " + Course.courses.get(i).getCourseName());
                System.out.print("Enter the number of the course to view lecturers: "); courseIndex = scanner.nextInt() - 1; scanner.nextLine();
                course = Course.courses.get(courseIndex);
                course.viewLecturers();
                break;
            case '8':
                for (int i = 0; i < Course.courses.size(); i++) System.out.println((i + 1) + ". " + Course.courses.get(i).getCourseName());
                System.out.print("Enter the number of the course to view enrolled students: "); courseIndex = scanner.nextInt() - 1; scanner.nextLine();
                course = Course.courses.get(courseIndex);
                course.viewEnrolledStudents();
                break;
            default:
                System.out.println("Invalid option!");
                break;
        }
    }

    static void exit(Scanner scanner) {
        scanner.close();
        System.out.println("Goodbye!");
        System.exit(0);
    }
}