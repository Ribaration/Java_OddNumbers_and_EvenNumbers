/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oddnumbersevennumbers;

/**
 *
 * @author Ribaration
 */
/*public class OddNumbersEvenNumbers {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
*/
class JVM1MCW8 {
    
    {
        System.out.println("A");
    }
    JVM1MCW8() {
        System.out.println("B");
    }
    {
        System.out.println("C");
    }
    public static void main(String[] args) {

        System.out.println("D");
        new JVM1MCW8();
        System.out.println("E");
    }
}
