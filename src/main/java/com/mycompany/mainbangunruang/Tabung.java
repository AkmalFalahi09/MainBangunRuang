/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainbangunruang;

/**
 *
 * @author akmal
 */
public class Tabung extends BangunRuang{
    double r;
    double t;
    double volume (){
        double volume = 3.14*r*r*t;
        System.out.println("Volume Tabung           : "+volume);
        return volume;
    }
    double luasP(){
        double luasP = 2*3.14*r*(r+t);
        System.out.println("Luas permukaan          : "+luasP);
        return luasP;
    }
}
