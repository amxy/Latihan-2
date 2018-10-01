/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo310117087latihan28gantikata;

/**
 *
 * @author
 * Nama              : Ahmad Maula
 * Kelas             : IF - 3
 * NIM               : 10117087
 * Deskripsi Program : Ganti Kata
 */
import java.util.Scanner;
public class Pbo310117087latihan28gantikata {

    
    public static void main(String[] args) {
    
    String kalimatAwal, kalimatBaru, gantiKata, jadiKata;
    Scanner scn = new Scanner(System.in);
    
        System.out.println("=====Program Ganti Kata=====");
        System.out.print("Masukkan Kalimat : ");
        kalimatAwal = scn.nextLine();
        System.out.print("Ganti Kata   : ");
        gantiKata = scn.next();
        System.out.print("Menjadi Kata : ");
        jadiKata = scn.next();
        
        kalimatBaru = (kalimatAwal).replaceAll(gantiKata, jadiKata);
        
        System.out.println("\n======Hasil Formatting======");
        System.out.println("Kalimat Awal : "+kalimatAwal);
        System.out.println("Kalimat Baru : "+kalimatBaru);
    }
    
}
