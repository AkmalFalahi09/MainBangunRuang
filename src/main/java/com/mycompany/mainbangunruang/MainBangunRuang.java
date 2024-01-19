/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mainbangunruang;
import java.util.Scanner;

public class MainBangunRuang {

    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        BangunRuang bangunRuang = new BangunRuang();
        bangunRuang.volume();
        bangunRuang.luasP();
        
        Balok balok = new Balok();
        System.out.println("\nBalok");
        System.out.print("Masukkan panjang        : ");
        balok.p = aa.nextDouble();
        System.out.print("masukkan lebar          : ");
        balok.l = aa.nextDouble();
        System.out.print("masukkan tinggi         : ");
        balok.t = aa.nextDouble();
        balok.volume();
        balok.luasP();
        
        Bola bola = new Bola();
        System.out.println("\nBola");
        System.out.print("masukkan jari jari      : ");
        bola.r = aa.nextDouble();
        bola.volume();
        bola.luasP();
        
        Tabung tabung = new Tabung();
        System.out.println("\nTabung");
        System.out.print("masukkan jari jari      : ");
        tabung.r = aa.nextDouble();
        System.out.print("masukkan tinggi         : ");
        tabung.t = aa.nextDouble();
        tabung.volume();
        tabung.luasP();
        
        
        Limas limas = new Limas();
        System.out.println("\nLimas");
        System.out.print("masukkan alas           : ");
        limas.a = aa.nextDouble();
        System.out.print("masukkan tinggi alas    : ");
        limas.t = aa.nextDouble();
        System.out.print("masukkan tinggi limas   : ");
        limas.tl = aa.nextDouble();
        System.out.print("masukkan tinggi sisi tegak : ");
        limas.tst = aa.nextDouble(); 
        limas.volume();
        limas.luasP();
        
        bangunRuang.byebye();
    }
}