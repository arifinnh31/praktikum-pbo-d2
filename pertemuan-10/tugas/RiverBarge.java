/* 
 * File      : RiverBarge.java    22/05/24
 * Penulis   : Arifin Nurmuhammad Haris
 * Deskripsi : File kelas RiverBarge
 */

public class RiverBarge extends Vehicle {
    private double maxLoad;

    public RiverBarge(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    public double calcFuelEfficiency() {
        return maxLoad * 0.5;
    }

    public double calcTripDistance() {
        return 200.00;
    }
}