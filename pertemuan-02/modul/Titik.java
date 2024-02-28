/* 
 * File      : Titik.java   28/02/24
 * Penulis   : Arifin Nurmuhammad Haris
 * Deskripsi : File Kelas Titik
 */

public class Titik {
    private double absis, ordinat;
    // static int counterTitik;

    Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
    }

    Titik() {
        this(0, 0);
    }

    public void setAbsis(double absis) {
        this.absis = absis;
    }

    public void setOrdinat(double ordinat) {
        this.ordinat = ordinat;
    }

    public double getAbsis() {
        return absis;
    }

    public double getOrdinat() {
        return ordinat;
    }

    // public static int getCounterTitik() {
    //     return counterTitik;
    // }

    public double getJarakPusat() {
        return Math.sqrt(getAbsis() * getAbsis() + getOrdinat() * getOrdinat());
    }
    
    public void refleksiX() {
        setOrdinat(-getOrdinat());
    }

    public void refleksiY() {
        setAbsis(-getAbsis());
    }

    public Titik getRefleksiX() {
        return new Titik(getAbsis(), -getOrdinat());
    }

    public Titik getRefleksiY() {
        return new Titik(-getAbsis(), getOrdinat());
    }
} 