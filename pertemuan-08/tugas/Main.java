/* 
 * File      : Main.java    08/05/24
 * Penulis   : Arifin Nurmuhammad Haris
 * Deskripsi : File kelas Main
 */

public class Main {
    public static void main(String[] args) {
        Ulat K = new Ulat();
        Data<Kupu> anu = new Data<>();

        K.gerak();

        anu.setIsi(K);
        anu.getIsi().gerak();

        anu.setIsi(new Kepompong());
        anu.getIsi().gerak();

        anu.setIsi(new KupuDewasa());
        anu.getIsi().gerak();
    }
}
