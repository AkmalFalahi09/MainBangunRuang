/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainbangunruang;

/**
 *
 * @author akmal
 */
public class Limas extends BangunRuang{
    double a;
    double t;
    double tl;
    double tst;
    double volume(){
        double volume = a*t*tl/6;
        System.out.println("Volume Limas            : "+volume);
        return volume;
    }
    double luasP(){
        double luasP = 1/2*a*t+3*a*tst;
        System.out.println("Luas permukaan limas    : "+luasP);
        return luasP;
    }
}
