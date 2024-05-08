/* 
 * File      : MapTest.java    08/05/24
 * Penulis   : Arifin Nurmuhammad Haris
 * Deskripsi : Program yang menggunakan Generic untuk pasangan Kunci-Nilai
 */

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        // kunci-> integer, nilai-> string
        Map<Integer, String> map = new HashMap<Integer, String>();
        // menempatkan elemen kunci dan nilai
        map.put(1, "satu");
        map.put(2, "dua");
        map.put(3, "tiga");
        map.put(4, "empat");
        map.put(5, "lima");
        // mengambil elemen pertama
        System.out.println(map.get(1));
        // mengambil keseluruhan kunci sebagai objek collection Set
        Set<Integer> keys = map.keySet();
        // iterasi pada keseluruhan Map
        for (Integer key : keys) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}