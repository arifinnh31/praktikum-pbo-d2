/* 
 * File      : ArrayListTest.java    08/05/24
 * Penulis   : Arifin Nurmuhammad Haris
 * Deskripsi : program penggunaan objek ArrayList sebagai Collection class
 */

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        // inisialisasi ArrayList yang hanya dapat
        // berisi objek String
        ArrayList<String> strings = new ArrayList<String>();
        // menambah elemen
        strings.add("praktikum");
        strings.add("collection");
        strings.add("generics");
        // menghapus elemen
        strings.remove("praktikum");
        // iterasi pada keseluruhan ArrayList
        for (String s : strings) {
            System.out.println(s + " ");
        }
    }
}