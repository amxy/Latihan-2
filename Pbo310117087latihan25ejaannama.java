/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo310117087latihan25ejaannama;

/**
 *
 * @author
 * Nama              : Ahmad Maula
 * Kelas             : IF - 3
 * NIM               : 10117087
 * Deskripsi Program : Ejaan Nama
 */

import java.util.Scanner;
public class Pbo310117087latihan25ejaannama {

   
    public static void main(String[] args) {
   
    String nama;
    int panjang;
    char huruf;
    Scanner scn = new Scanner (System.in);
    
        System.out.print("Masukkan Nama Anda untuk Dieja : ");
        nama = scn.next();
        panjang = nama.length();
        
        System.out.println("\nEjaan untuk "+" \""+nama+"\" adalah: ");
        
        //Jangan Gunakan i <= panjang, karena akan 'string index out of range'
        for (int i = 0; i < panjang; i++){
            System.out.println("Huruf Ke-"+(i+1)+" : "+nama.charAt(i));
        }
    }
    
}
