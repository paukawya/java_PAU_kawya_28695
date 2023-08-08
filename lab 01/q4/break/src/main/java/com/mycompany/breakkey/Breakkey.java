
package com.mycompany.breakkey;

public class Breakkey {

    public static void main(String[] args) {
        int[] numarray = {10, 20, 30, 40, 50};
        for (int x : numarray) {
            if (x == 30) {
                break;
            }
            System.out.println(x);
            System.out.println("\n");
        }
    }
}
