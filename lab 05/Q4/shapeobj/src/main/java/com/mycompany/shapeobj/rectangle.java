/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shapeobj;

/**
 *
 * @author Piyumi
 */
class rectangle extends shape
 {
    protected double length;
    protected double height;
    
    public rectangle (double w,double h)
    {
        this.length=w;
        this.height=h;
    }
    double calculateArea()
    {
        return length *height;
    }
}
