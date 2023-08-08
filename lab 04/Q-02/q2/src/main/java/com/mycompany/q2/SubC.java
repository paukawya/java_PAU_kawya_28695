/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.q2;

/**
 *
 * @author Piyumi
 */
    public class SubC extends SuperB {
    void triple() {
        x = x + 3; // Override existing method
    }

    void quadruple() {
        x = x * 4; // New method
    }

    void setIt(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

