/* 
 * File      : MBujurSangkar.java    20/03/24
 * Penulis   : Arifin Nurmuhammad Haris
 * Deskripsi : kelas yang mengimplementasikan cara menghitung
 *             luas bujur sangkar
 */

import java.util.Scanner;

public class MBujurSangkar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.print("Masukan sisi bujur sangkar : ");
        double sisi = scan.nextDouble();
        System.out.println("Luas bujur sangkar dengan sisi " + sisi + " satuan adalah " + bs.hitungLuas(sisi));
        scan.close();
    }
}
