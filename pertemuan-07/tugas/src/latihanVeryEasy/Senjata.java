/* 
 * File      : Senjata.java    02/05/24
 * Penulis   : Arifin Nurmuhammad Haris
 * Deskripsi : File kelas Senjata
 */

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanVeryEasy;

/**
 *
 * @author Arifin N.H
 */
public class Senjata {
    private String bunyi;
    private int peluru;

    public Senjata(String bunyi) {
        this.bunyi = bunyi;
        this.peluru = 0;
    }

    public String getBunyi() {
        return bunyi;
    }

    public int getPeluru() {
        return peluru;
    }

    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }

    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }

    public void menembak(int jumlah) {
        if (getPeluru() == 0) {
            System.out.println("Peluru Habis");
        } else {
            for (int i = 0; i < jumlah; i++) {
                if (getPeluru() == 0) {
                    System.out.println("Gagal tembak, Peluru Habis");
                } else {
                    System.out.println(getBunyi());
                    setPeluru(getPeluru() - 1);
                }
            }
            if (getPeluru() > 0){
                System.out.println("Sisa Peluru: " + getPeluru());
            }
        }
    }
}