/* 
 * File      : Lingkaran.java    08/05/24
 * Penulis   : Arifin Nurmuhammad Haris
 * Deskripsi : implementasi Lingkaran sebagai BangunDatar
 */

public class Lingkaran extends BangunDatar {
    private double jejari;

    public Lingkaran(double jejari) {
        this.jejari = jejari;
    }

    public double hitungKeliling() {
        return 2 * Math.PI * jejari;
    }
}