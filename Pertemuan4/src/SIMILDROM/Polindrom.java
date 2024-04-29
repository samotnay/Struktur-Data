/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SIMILDROM;

/**
 *
 * @author Sam Otnay
 */
import java.util.Scanner;
public class Polindrom {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Masukkan kata: ");
        String kata = input.nextLine();

        if (isPalindrome(kata)) {
            System.out.println("'" + kata + "' adalah palindrom.");
        } else {
            System.out.println("'" + kata + "' bukan palindrom.");
        }
    }

    public static boolean isPalindrome(String kata) {
        int panjang = kata.length();
        for (int i = 0; i < panjang / 2; i++) {
            if (kata.charAt(i) != kata.charAt(panjang - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
