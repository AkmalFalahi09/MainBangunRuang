/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainbangunruang;

/**
 *
 * @author akmal
 */
public class Balok extends BangunRuang {
    double p;
    double l;
    double t;
    double volume(){
        double volume = p*l*t;
        System.out.println("Volume Balok            : "+volume);
        return volume;
    }
    double luasP(){
        double luasP = 2*(p*l + l*t + t*p);
        System.out.println("Luas Permukaan Balok    : "+luasP);
        return luasP;
    }
}
