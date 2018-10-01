/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo310117087latihan21rataratanilai;

/**
 *
 * @author
 * Nama              : Ahmad Maula
 * Kelas             : IF - 3
 * NIM               : 10117087
 * Deskripsi Program : Program Rata-rata Nilai
 */
import java.util.Scanner;
public class Pbo310117087latihan21rataratanilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, jml, nilai[];
        float rata, jumlah = 0;
        
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        n = input.nextInt();
        
        nilai = new int[n];
        
        for (int i=0; i<= n-1; i++){
            System.out.print("Nilai Mahasiswa " + (i+1)+ " : ");
            nilai[i] = input.nextInt();
        }
        for(int j=0; j<= n-1; j++){
            jumlah = jumlah + nilai[j];
        }
        
        rata = jumlah/n;
        
        
        System.out.println("Maka,Rata-rata Nilainya Adalah " + rata);
        
     
        
    }
    
}
