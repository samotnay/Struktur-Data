/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ARRAY;

/**
 *
 * @author Sam Otnay
 */
public class arraymultidimensi {

    public static void main(String[] args) {
        //Cara Pertama
        System.out.println("CARA PERTAMA");
        String hewan[][] = new String[2][2];

        hewan[0][0] = "kucing";
        hewan[0][1] = "singa";
        hewan[1][0] = "landak";
        hewan[1][1] = "kerbau";

        System.out.println(hewan[0][0]);
        System.out.println(hewan[0][1]);
        System.out.println(hewan[1][0]);
        System.out.println(hewan[1][1]);

        System.out.println("");

        //Cara Kedua
        System.out.println("CARA KEDUA");
        String profesi[][] = {{"dokter", "polisi"}, {"arsitek", "guru"}};

        System.out.println(profesi[0][0]);
        System.out.println(profesi[0][1]);
        System.out.println(profesi[1][0]);
        System.out.println(profesi[1][1]);

        System.out.println("");

        //Cara Ketiga
        System.out.println("CARA KETIGA");
        String mobil[][] = {{"avansa", "pajero"}, {"civic", "panther"}};

        for(int k=0; k<mobil.length; k++)
        {
            for(int b=0; b<mobil.length; b++)
            {
                System.out.println(mobil[k][b]);
            }
        }
    }
}
