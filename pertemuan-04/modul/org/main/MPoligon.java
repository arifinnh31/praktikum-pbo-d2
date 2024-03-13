/* 
 * File      : MPoligon.java    13/03/24
 * Penulis   : Arifin Nurmuhammad Haris
 * Deskripsi : driver class untuk poligon, persegi panjang, dan segitiga
 */

package org.main;

import org.bangundatar.*;

public class MPoligon {
    public static void main(String[] args) {
        PersegiPanjang persegi = new PersegiPanjang(10, 10, 4);
        persegi.printInfo();
        System.out.println("Luas Persegi Panjang : " + persegi.hitungLuas());

        Segitiga segitigaIstimewa = new Segitiga(3, 4, 3);
        segitigaIstimewa.printInfo();
        System.out.println("Luas Segitiga : " + segitigaIstimewa.hitungLuas());
    }
}