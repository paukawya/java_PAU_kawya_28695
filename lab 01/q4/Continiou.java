/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.continiou;

public class Continiou {

    public static void main(String[] args) {
        int[] numArray = {10, 20, 30, 40, 50};
        for (int x : numArray) 
        {
            if (x == 30) {
                continue;
            }
            System.out.println(x);
            System.out.println("\n");
        }
    }
}
