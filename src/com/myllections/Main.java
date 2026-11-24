/**
 *  Java program to create, store, update, delete HashSet.
 */

package com.myllections;

import java.util.HashSet;
import java.util.Set;

/**
 *
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Create.
        Set<Double> digits = new HashSet<>();

        // Add.
        digits.add(2.1);
        digits.add(3.2);
        digits.add(4.3);
        digits.add(5.4);
        digits.add(6.5);
        digits.add(7.6);
        digits.add(8.7);
        digits.add(9.8);

        // Show elements of HashSet to console.
        System.out.println(digits); // Output: [4.3, 3.2, 8.7, 7.6, 9.8, 6.5, 2.1, 5.4]

        // Update.
        digits.add(10.9);

        // Show elements of HashSet to console.
        System.out.println(digits); // Output: [4.3, 3.2, 8.7, 7.6, 10.9, 9.8, 6.5, 2.1, 5.4]

        // Write if there is an element with value 9.8.
        System.out.println("Has 9.8: " + digits.contains(9.8)); // Output: Has 9.8: true

        // Write if there is an element with value 9.9.
        System.out.println("Has 9.9: " + digits.contains(9.9)); // Output: Has 9.9: false

        // Clear.
        digits.clear();

    }

}