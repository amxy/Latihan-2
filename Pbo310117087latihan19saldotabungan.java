/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo310117087latihan19saldotabungan;

/**
 *
 * @author 
 * Nama              : Ahmad Maula
 * Kelas             : IF - 3
 * NIM               : 10117087
 * Deskripsi Program : Saldo Tabungan
 */
public class Pbo310117087latihan19saldotabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double  depositBulan;
    double bunga = 0.15;
    double saldoAwal = 2500000;
    
    for ( int bulan = 1; bulan <= 6; bulan++ )
    {
    depositBulan = saldoAwal * Math.pow( 1 + bunga, bulan );
        System.out.println("Saldo Di Bulan Ke-" +bulan +" Rp "+ depositBulan );
    }
        
    
    
    }
    
}
