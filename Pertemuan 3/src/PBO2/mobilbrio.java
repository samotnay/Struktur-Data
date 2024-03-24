/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO2;

/**
 *
 * @author Sam Otnay
 */
public class mobilbrio {

    public static void main(String[] args) {
        mobil brio = new mobil();

        brio.merkMobil = "BRIO";
        brio.tahunBuat = 2022;
        brio.warnaMobil = "HITAM MERONA";

        System.out.println("=====DATA MOBIL BRIO TERBARU=====");
        System.out.println("=====KELUARAN PERTAMA DI BLITAR=====");
        System.out.println("warna mobil     = " + brio.warnaMobil);
        System.out.println("Merk mobil      = " + brio.merkMobil);
        System.out.println("Tahun Pembuatan = " + brio.tahunBuat);
        brio.mobilberjalan();
        brio.mobilberhenti();

    }
}
