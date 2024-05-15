/* 
 * File      : ReadSerializedPerson.java    15/05/24
 * Penulis   : Arifin Nurmuhammad Haris
 * Deskripsi : Program untuk serialisasi objek Person
 */

import java.io.*;

public class ReadSerializedPerson {
    public static void main(String[] args) {
        Person p = null;
        try {
            FileInputStream f = new FileInputStream("person.ser");
            ObjectInputStream s = new ObjectInputStream(f);
            p = (Person) s.readObject();
            s.close();
            System.out.println("Serialized person name = " + p.getName());
        } catch (Exception ioe) {
            ioe.printStackTrace();
        }
    }
}