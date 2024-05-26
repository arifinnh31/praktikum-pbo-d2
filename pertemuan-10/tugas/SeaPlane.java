/* 
 * File      : SeaPlane.java    22/05/24
 * Penulis   : Arifin Nurmuhammad Haris
 * Deskripsi : File kelas SeaPlane
 */

public class SeaPlane extends Airplane {
    private double maxLoad;

    public SeaPlane(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    public double calcFuelEfficiency() {
        return maxLoad * 2;
    }

    public double calcTripDistance() {
        return 5000.0;
    }

    public void takeOff() {
        System.out.println("Pesawat laut sedang lepas landas dari laut");
    }

    public void land() {
        System.out.println("Pesawat laut sedang mendarat di atas laut");
    }

    public void fly() {
        System.out.println("Pesawat laut sedang terbang di atas laut");
    }

    @Override
    public String toString() {
        return "SeaPlane dapat take-off dan mendarat di perairan laut";
    }
}