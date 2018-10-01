/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo310117087latihan23maxmin;

/**
 *
 *@author
 * Nama              : Ahmad Maula
 * Kelas             : IF - 3
 * NIM               : 10117087
 * Deskripsi Program : Menentukan Nilai Terkecil & Terbesar
 */

import java.util.Scanner;
public class Pbo310117087latihan23maxmin {

    public static void main(String[] args) {
        
        String petugas;
        int nMhs;
        int nBesar;
        int nKecil;
        int nilaiMhs;
        Scanner scn = new Scanner(System.in);
        
        System.out.println("=====Program Nilai Terbesar & Terkecil Nilai "
                + "Mahasiswa");
        System.out.print("Masukkan Nama Petugas : ");
        petugas=scn.next();
        
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        nMhs = scn.nextInt();
        
        nBesar = 0;
        nKecil = 100;
        
        for (int i = 1; i <= nMhs; i++){
            System.out.print("Masukkan Nilai Mahasiswa-"+i+" = ");
            nilaiMhs = scn.nextInt();
            
            nBesar = ((nBesar<=nilaiMhs)?nilaiMhs:nBesar);
            nKecil = ((nKecil>=nilaiMhs)?nilaiMhs:nKecil);
        }
        
        System.out.print("\nNilai Terbesar adalah : "+nBesar);
        System.out.println("\nNilai Terkecil adalah : "+nKecil);
        
            
        }

    }
    

