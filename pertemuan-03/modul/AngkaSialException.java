/* 
 * File      : ExceptiononArray.java    06/03/24
 * Penulis   : Arifin Nurmuhammad Haris
 * Deskripsi : Eksepsi buatan sendiri, menolak masukan angka 13!
 */

class AngkaSialException extends Exception {
    public AngkaSialException() {
        super("jangan memasukkan angka 13 karena angka sial !!!");
    }
}