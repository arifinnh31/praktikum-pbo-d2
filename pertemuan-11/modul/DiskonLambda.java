/* 
 * File      : DiskonLambda.java    29/05/24
 * Penulis   : Arifin Nurmuhammad Haris
 * Deskripsi : Ekspresi lambda dasar, digunakan untuk menghitung diskon.
 */

interface IDiskon {
    public double hitungDiskon(int harga);
}

public class DiskonLambda {
    public static void main(String[] args) {
        // tanpa lambda
        IDiskon diskonMerdeka = new IDiskon() {
            @Override
            public double hitungDiskon(int harga) {
                return harga * (1 - 0.3);
            }
        };
        // dengan lambda
        IDiskon diskonLebaran = (harga) -> harga * (1 - 0.4);
        // lambda dengan blok statement
        IDiskon diskonBiasa = (harga) -> {
            return harga * (1 - 0.1);
        };
        System.out.println("Diskon Merdeka: " + diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon Lebaran: " + diskonLebaran.hitungDiskon(45000));
        System.out.println("Diskon Biasa: " + diskonBiasa.hitungDiskon(45000));
    }
}