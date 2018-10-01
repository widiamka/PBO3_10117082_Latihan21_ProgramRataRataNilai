/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117082_latihan21_programrataratanilai;
import java.util.Scanner;
/**
 *
 *  Nama : WIDIAMEGA K
* Kelas : IF3
* NIM   : 10117082
* Deskripsi Program : program ini berisi program untuk menampilkan rata rata 
* nilai yang inputannya berasal dari user
 */
public class PBO3_10117082_Latihan21_ProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nMahasiswa;
        int nilaiMahasiswa;
        double totalNilai = 0;
        double rataNilai;
        
        Scanner scn = new Scanner(System.in);
        System.out.println("Masukkan Banyaknya Mahasiswa : ");
        nMahasiswa = scn.nextInt();
        
        
        for (int i = 1; i <= nMahasiswa; i++){
        System.out.println("Nilai Mahasiswa Ke-"+i+" : ");
        nilaiMahasiswa = scn.nextInt();
        totalNilai += nilaiMahasiswa;
       
        }
       rataNilai = totalNilai/nMahasiswa;
        System.out.println("\nMaka, Rata-Rata Nilainya Adalah "+rataNilai);
    }
    
}
