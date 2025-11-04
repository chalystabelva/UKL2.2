/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soal4;

/**
 *
 * @author IDEAPAD
 */
import java.util.Scanner;
public class Soal4 {
    
    public static double hitungVolume(double r, double t){
        double volume = Math.PI*r*r*t;
        return volume;
    }
    
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        
        System.out.println("Masukkan jari jari: ");
        double r = masukan.nextDouble();
        System.out.println("Masukkan tinggi: ");
        double t = masukan.nextDouble();
        
        double hasil = hitungVolume(r,t);
        
        System.out.println("Volume tabung adalah " + hasil);
    }
}
