/* 
 * File      : Garis.java	28/02/24
 * Penulis   : Arifin Nurmuhammad Haris
 * Deskripsi : File Kelas Garis
 */

public class Garis {
    private Titik titikAwal, titikAkhir;

    public Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
    }

    public Titik getTitikAwal() {
        return titikAwal;
    }

    public Titik getTitikAkhir() {
        return titikAkhir;
    }

    public double getPanjang() {
        double x1 = getTitikAwal().getAbsis();
        double y1 = getTitikAwal().getOrdinat();
        double x2 = getTitikAkhir().getAbsis();
        double y2 = getTitikAkhir().getOrdinat();
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

    public Garis getRefleksiX() {
        return new Garis(getTitikAwal().getRefleksiX(), getTitikAkhir().getRefleksiX());
    }

    public Garis getRefleksiY() {
        return new Garis(getTitikAwal().getRefleksiY(), getTitikAkhir().getRefleksiY());
    }

    public double getGradien() {
        double x1 = getTitikAwal().getAbsis();
        double y1 = getTitikAwal().getOrdinat();
        double x2 = getTitikAkhir().getAbsis();
        double y2 = getTitikAkhir().getOrdinat();
        return (y2 - y1) / (x2 - x1);
    }

    public boolean isSejajar(Garis g) {
        return this.getGradien() == g.getGradien();
    }

    public boolean isTegakLurus(Garis g) {
        return this.getGradien() == -g.getGradien();
    }
}