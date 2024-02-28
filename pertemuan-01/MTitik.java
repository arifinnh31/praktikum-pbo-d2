/* 
 * File      : MTitik.java	21/02/24
 * Penulis   : Arifin Nurmuhammad Haris
 * Deskripsi : File Main Program Titik
 */

public class MTitik {
	public static void main(String[] args) {
		Titik t1 = new Titik();
		t1.setAbsis(1.0);
		t1.setOrdinat(2.0);
		Titik t2 = new Titik(3.0, 4.0);
		Titik t3 = new Titik(5, 6);

		System.out.println("Jumlah objek titik : " + Titik.getCounterTitik());
		System.out.println("t1(" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");
		System.out.println("t2(" + t2.getAbsis() + ", " + t2.getOrdinat() + ")");
		System.out.println("t3(" + t3.getAbsis() + ", " + t3.getOrdinat() + ")");
	}
}