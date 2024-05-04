/* 
 * File      : KontrolSenjata.java    02/05/24
 * Penulis   : Arifin Nurmuhammad Haris
 * Deskripsi : File kelas KontrolSenjata
 */

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanMedium;

/**
 *
 * @author Arifin N.H
 */
public class KontrolSenjata {
    private Senjata senjata;

    public KontrolSenjata(Senjata senjata) {
        this.senjata = senjata;
    }

    public boolean isAdaPeluru() {
        return senjata.getPeluru() > 0;
    }

    public void isiPeluru(int jumPeluru) {
        senjata.setPeluru(senjata.getPeluru() + jumPeluru);
        System.out.println(">> Peluru berhasil ditambah: " + jumPeluru);
    }

    public void menembak(int jumlah) {
        System.out.println(">> Siap menembak " + jumlah + " kali");
        if (!isAdaPeluru()) {
            System.out.println("Peluru Habis");
        } else {
            for (int i = 0; i < jumlah; i++) {
                if (!isAdaPeluru()) {
                    System.out.println("Gagal tembak, Peluru Habis");
                } else {
                    System.out.println(senjata.getBunyi());
                    senjata.setPeluru(senjata.getPeluru() - 1);
                }
            }
            if (isAdaPeluru()) {
                System.out.println(">> Peluru sisa: " + senjata.getPeluru());
            }
        }
    }

    public String menusuk() {
        if (senjata.isMenusuk()) {
            return "Jleb! ";
        } else {
            return "Gagal, belum pasang bayonet";
        }
    }

    public void pasangBayonet() {
        senjata.setMenusuk(true);
        System.out.println("Bayonet Terpasang");
    }
}