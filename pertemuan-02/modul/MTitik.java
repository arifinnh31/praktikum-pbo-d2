/* 
 * File      : MTitik.java	28/02/24
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

		System.out.println("t1(" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");
		System.out.println("t2(" + t2.getAbsis() + ", " + t2.getOrdinat() + ")");
		System.out.println("t3(" + t3.getAbsis() + ", " + t3.getOrdinat() + ")");
		System.out.println();

		System.out.println("Jarak t2 ke pusat: " + t2.getJarakPusat());
		System.out.println();

		System.out.println("t1 setelah direfleksi terhadap sumbu x");
		t1.refleksiX();
		System.out.println("t1(" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");
		System.out.println();

		System.out.println("t1 setelah direfleksi terhadap sumbu y");
		t1.refleksiY();
		System.out.println("t1(" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");
		System.out.println();

		System.out.println("t4 merupakan refleksi t2 terhadap sumbu x");
		Titik t4 = t2.getRefleksiX();
		System.out.println("t4(" + t4.getAbsis() + ", " + t4.getOrdinat() + ")");
		System.out.println();

		System.out.println("t5 merupakan refleksi t3 terhadap sumbu y");
		Titik t5 = t3.getRefleksiY();
		System.out.println("t5(" + t5.getAbsis() + ", " + t5.getOrdinat() + ")");
	}
}