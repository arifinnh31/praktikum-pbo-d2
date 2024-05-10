/* 
 * File      : Data.java    08/05/24
 * Penulis   : Arifin Nurmuhammad Haris
 * Deskripsi : File kelas Data
 */

public class Data<T> {
    private T isi;

    public T getIsi() {
        return this.isi;
    }

    public void setIsi(T x) {
        this.isi = x;
    }
}