
package com.mycompany.continiou;

public class Continiou {

    public static void main(String[] args) {
        int[] numarr = {10, 20, 30, 40, 50};
        for (int x : numarr) {
            if (x == 30) {
                continue;
            }
            System.out.println(x);
            System.out.println("\n");
        }
    }
}
		

