/* 
 * File      : Manajer.java    02/05/24
 * Penulis   : Arifin Nurmuhammad Haris
 * Deskripsi : Subclass dari pegawai yakni manajer
 */

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PegawaiDanGaji;

/**
 *
 * @author Arifin N.H
 */
public class Manajer extends Pegawai {
    private int tunjangan = 700000;

    public Manajer(String nama) {
        super(nama);
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan : " + this.tunjangan);
    }
}