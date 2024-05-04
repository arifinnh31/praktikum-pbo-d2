/* 
 * File      : PegawaiDanGaji.java    02/05/24
 * Penulis   : Arifin Nurmuhammad Haris
 * Deskripsi : Program atau main class pegawai dan gaji
 */

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PegawaiDanGaji;

/**
 *
 * @author Arifin N.H
 */
public class PegawaiDanGaji {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pegawai pegawai = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Pegawai pegawai3 = new Manajer("Argo");

        Payroll payroll = new Payroll();
        payroll.cetakGaji(pegawai);
        payroll.cetakGaji(pegawai2);
        payroll.cetakGaji(pegawai3);
    }
}