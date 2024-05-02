/* 
 * File      : Sewa.java    02/05/24
 * Penulis   : Arifin Nurmuhammad Haris
 * Deskripsi : Program main inclusion
 */

public class Sewa {
    public static void main(String[] args) {
        Vehicle kendaraan = new Vehicle();
        Vehicle mobil = new Car();
        Vehicle bis = new Bus();
        kendaraan.calRent(50, 1000);
        mobil.calRent(50, 1000);
        bis.calRent(50, 1000);
    }
}