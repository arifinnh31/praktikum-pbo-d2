/* 
 * File      : Person.java    16/03/24
 * Penulis   : Arifin Nurmuhammad Haris
 * Deskripsi : File Kelas Person
 */

public class Person {
    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void getDetails() {
        System.out.println("Name\t\t: " + name);
        System.out.println("Age\t\t: " + age);
        System.out.println("Address\t\t: " + address);
    }
}