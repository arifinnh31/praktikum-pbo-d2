/* 
 * File      : Car.java    02/05/24
 * Penulis   : Arifin Nurmuhammad Haris
 * Deskripsi : Subclass Car dari Superclass Vehicle
 */

public class Car extends Vehicle {
    void calRent(int jarak, float harga) {
        float fare = jarak * harga;
        fare = fare - 100.00f;
        System.out.println("Harga sewa mobil = " + fare);
    }
}