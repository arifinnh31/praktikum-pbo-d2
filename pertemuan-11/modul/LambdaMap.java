/* 
 * File      : LambdaMap.java    29/05/24
 * Penulis   : Arifin Nurmuhammad Haris
 * Deskripsi : Implementasi lamda pada Map, digunakan sebagai parameter
 *             pada method
 */

import java.util.*;

public class LambdaMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060122130059", "Arifin");
        mahasiswaMap.put("24060122130079", "Sultan");
        mahasiswaMap.put("24060122130083", "Yudhis");
        mahasiswaMap.put("24060122130099", "Hamam");

        // lambda digunakan sebagai parameter
        mahasiswaMap.forEach((nim, nama) -> System.out.println(nim + " : " + nama));
    }
}