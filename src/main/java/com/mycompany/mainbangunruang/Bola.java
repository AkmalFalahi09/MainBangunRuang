/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainbangunruang;

/**
 *
 * @author akmal
 */
public class Bola extends BangunRuang {
    double r;
    double volume(){
        double volume = 4/3*3.14*r*r*r;
        System.out.println("Volume bola             : "+volume);
        return volume;
    }
    double luasP(){
        double luasP = 4*3.14*r*r;
        System.out.println("Luas Permukaan bola     : "+luasP);
        return luasP;
    }
}
