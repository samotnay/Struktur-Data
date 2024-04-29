/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SIMILDROM;

/**
 *
 * @author Sam Otnay
 */
import java.util.HashSet;
import java.util.Set;

public class similaritas {

    public static void main(String[] args) {
        String kata1 = "pogal";
        String kata2 = "begal";

        double similarity = calculateJaccardSimilarity(kata1, kata2);

        System.out.println("Similaritas antara '" + kata1 + "' dan '" + kata2 + "' adalah: " + similarity);
    }

    public static double calculateJaccardSimilarity(String str1, String str2) {
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        for (char c : str1.toCharArray()) {
            set1.add(c);
        }

        for (char c : str2.toCharArray()) {
            set2.add(c);
        }

        Set<Character> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        Set<Character> union = new HashSet<>(set1);
        union.addAll(set2);

        return (double) intersection.size() / union.size();
    }
}
