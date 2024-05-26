/* 
 * File      : Vehicle.java    22/05/24
 * Penulis   : Arifin Nurmuhammad Haris
 * Deskripsi : File kelas abstrak Vehicle
 */

public abstract class Vehicle {
    public abstract double calcFuelEfficiency();

    public abstract double calcTripDistance();

    public String toString() {
        return this.getClass().getSimpleName();
    }
}