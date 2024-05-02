/* 
 * File      : Vehicle.java    02/05/24
 * Penulis   : Arifin Nurmuhammad Haris
 * Deskripsi : Superclass Vehicle
 */

public class Vehicle {
    void calRent(int distance, float price) {
        float fare = distance * price;
        System.out.println("Vehicle price = " + fare);
    }
}