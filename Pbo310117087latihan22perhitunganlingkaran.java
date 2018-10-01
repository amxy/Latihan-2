/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo310117087latihan22perhitunganlingkaran;

 /*
 *@author
 * Nama              : Ahmad Maula
 * Kelas             : IF - 3
 * NIM               : 10117087
 * Deskripsi Program : Perhitungan Lingkaran
*/
import java.util.Scanner;
public class Pbo310117087latihan22perhitunganlingkaran {
    public static void main(String[] args) {
    
    String d;
    double diameter,r,l,k;
    Scanner scn = new Scanner(System.in);
    
        System.out.println("========Perhitungan Lingkaran=======");
        
    do {
        System.out.print("Masukkan Nilai Diameter Lingkaran : ");
        d = scn.nextLine();
        System.out.println((!d.matches("[0-9]*"))?"Nilai Diameter Tidak "
                + "Sesuai\n":"");
    } while (!d.matches ("[0-9]*"));
        System.out.println("\n=====Hasil Perhitungan Lingakaran=====");
        diameter = Double.parseDouble(d);
        
    r = diameter/2;
        System.out.printf("Jari-jari Lingkaran = %.0f cm %n",r);
    l = Math.PI*r*r;
        System.out.printf("Luas Lingkaran = %.2f cm %n",l);
    k = 2*Math.PI*r;
        System.out.printf("Keliling Lingkaran = %.2f cm %n",k);
    
    
    }
    
}
