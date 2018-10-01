/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo310117087latihan27huruf;

/**
 *
 * @author
 * Nama              : Ahmad Maula
 * Kelas             : IF - 3
 * NIM               : 10117087
 * Deskripsi Program : Huruf Besar & kecil
 */
import java.util.Scanner;
public class Pbo310117087latihan27Huruf {

    public static void main(String[] args) {
    String kalimat, hBesar, hKecil;
    Scanner scn = new Scanner(System.in);
    
        System.out.print("Masukkan Kalimat : ");
        kalimat = scn.nextLine(); //untuk input lebih dari 1 kata
        
        hBesar = kalimat.toUpperCase(); //ke format kapital
        hKecil = kalimat.toLowerCase(); //ke format kecil
        
        System.out.println("\n=====Hasil Formatting====");
        System.out.println("Huruf Besar : "+ hBesar);
        System.out.println("Huruf Kecil : "+ hKecil);
    }
    
}
