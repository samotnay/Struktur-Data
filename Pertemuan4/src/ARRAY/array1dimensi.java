/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ARRAY;

/**
 *
 * @author Sam Otnay
 */
public class array1dimensi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nilai[] = new int[5];
        nilai[0] = 134;
        nilai[1] = 157;
        nilai[2] = 276;
        nilai[3] = 358;
        nilai[4] = 545;

        System.out.print("Nilai Array         = ");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print(nilai[i] + " ");
        }

        System.out.println();

        int NilaiTerendah = nilai[0];
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] < NilaiTerendah) {
                NilaiTerendah = nilai[i];
            }
        }

        int NilaiTertinggi = nilai[0];
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] > NilaiTertinggi) {
                NilaiTertinggi = nilai[i];
            }
        }

        int total = 0;
        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i];
        }
        int rata2 = total / nilai.length;

        System.out.println("Nilai Terendah      = " + NilaiTerendah);
        System.out.println("Nilai Tertinggi     = " + NilaiTertinggi);
        System.out.println("Nilai Rata-rata     = " + rata2);
    }

}
