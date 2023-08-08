/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shapeobj;

/**
 *
 * @author Piyumi
 */
abstract class shape
{
    protected double area;
    abstract double calculateArea();
    
    public void display (double area)
    {
        System.out.println("Area="+area);
    }
}
