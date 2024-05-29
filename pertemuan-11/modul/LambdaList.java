/* 
 * File      : LambdaList.java    29/05/24
 * Penulis   : Arifin Nurmuhammad Haris
 * Deskripsi : Implementasi lamda pada List, digunakan sebagai parameter
 *             pada method.
 */

import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Arifin");
        mahasiswaList.add("Sultan");
        mahasiswaList.add("Yudhis");
        mahasiswaList.add("Hamam");

        // lambda digunakan sebagai parameter
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}