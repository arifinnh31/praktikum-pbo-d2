/* 
 * File      : Titik.java   21/02/24
 * Penulis   : Arifin Nurmuhammad Haris
 * Deskripsi : File Kelas Titik
 */

public class Titik {
    double absis;
    double ordinat;
    static int counterTitik;

    Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    Titik(double x, double y) {
        absis = x;
        ordinat = y;
        counterTitik++;
    }

    // Overloading
    Titik(int x, int y) {
        absis = x;
        ordinat = y;
        counterTitik++;
    }

    void setAbsis(double x) {
        absis = x;
    }

    void setOrdinat(double y) {
        ordinat = y;
    }

    double getAbsis() {
        return absis;
    }

    double getOrdinat() {
        return ordinat;
    }

    static int getCounterTitik() {
        return counterTitik;
    }
}