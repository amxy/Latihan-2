/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo310117087latihan24perbandingan;

/**
 *
 * @author
 * Nama              : Ahmad Maula
 * Kelas             : IF - 3
 * NIM               : 10117087
 * Deskripsi Program : Perbandingan Dua Buah Nilai
 */

import java.util.Scanner;
public class Pbo310117087latihan24perbandingan {

    public static void main(String[] args) {

    int n1;
    int n2;
    String again;
    Scanner scn = new Scanner(System.in);
    
        System.out.println("========Program Perbandingan Nilai========");
    do{
        System.out.print("Masukkan Nilai Pertama : ");
        n1 = scn.nextInt();
        System.out.print("Masukkan Nilai Kedua   : ");
        n2 = scn.nextInt();
        
    if (n1 > n2){
            System.out.print("Hasil : "+n1+" Lebih Besar Dari "+n2+"\n");
        }else if (n1 < n2){
            System.out.print("Hasil : "+n1+" Lebih Kecil Dari "+n2+"\n");
        }else
            System.out.print("Hasil : "+n1+" Sama Dengan "+n2+"\n");
            
    //Ketikan "Tidak" bila ingin berhenti aktifitas
            System.out.print("ulangi aktifitas ? (Ya/Tidak) : ");
            again = scn.next();
            System.out.println("");
        }while (!again.equals("Tidak"));
    }
    }
    

