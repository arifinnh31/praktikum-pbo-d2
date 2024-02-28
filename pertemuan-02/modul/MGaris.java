/* 
 * File      : MGaris.java	28/02/24
 * Penulis   : Arifin Nurmuhammad Haris
 * Deskripsi : File Main Program Garis
 */

public class MGaris {
	public static void main(String[] args) {
		Titik t1 = new Titik();
		Titik t2 = new Titik(3, 4);
		Garis g1 = new Garis(t1, t2);
        System.out.println("g1((" + g1.getTitikAwal().getAbsis() + ", " + g1.getTitikAwal().getOrdinat() + "), (" + g1.getTitikAkhir().getAbsis() + ", " + g1.getTitikAkhir().getOrdinat() + "))");
        System.out.println("Panjang g1: " + g1.getPanjang());
        System.out.println("Gradien g1: " + g1.getGradien());
		System.out.println();

		System.out.println("g2 merupakan refleksi g1 terhadap sumbu y");
        Garis g2 = g1.getRefleksiY();
        System.out.println("g2((" + g2.getTitikAwal().getAbsis() + ", " + g2.getTitikAwal().getOrdinat() + "), (" + g2.getTitikAkhir().getAbsis() + ", " + g2.getTitikAkhir().getOrdinat() + "))");
		System.out.println();

		Titik t3 = new Titik(-6, 8);
		Garis g3 = new Garis(t1, t3);
		System.out.println("g3((" + g3.getTitikAwal().getAbsis() + ", " + g3.getTitikAwal().getOrdinat() + "), (" + g3.getTitikAkhir().getAbsis() + ", " + g3.getTitikAkhir().getOrdinat() + "))");
		System.out.println("Apakah g1 tegak lurus dengan g3? " + (g1.isTegakLurus(g3) ? "Ya" : "Tidak"));
	}
}