/* 
 * File      : BangunDatarGeneric.java    08/05/24
 * Penulis   : Arifin Nurmuhammad Haris
 * Deskripsi : main class untuk generic bangun datar
 */

public class BangunDatarGenericTest {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
        bdg.set(l);
        System.out.println("keliling lingkaran : " + bdg.hitungKeliling());
        System.out.println("tipe generic : " + bdg.get().getClass().getName());
    }
}