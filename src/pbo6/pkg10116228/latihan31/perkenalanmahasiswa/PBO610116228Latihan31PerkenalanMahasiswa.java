/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10116228.latihan31.perkenalanmahasiswa;
import java.util.Scanner;
/**
 *
 * @author 
 * Nama     : Gandy Christian Situmorang
 * Kelas    : PBO-6
 * NIM      :10116228
 * Deskripsi Program    : Program ini berisi program yang menampilkan data 
 * untuk mengenalkan beberapa siswa
 */
public class PBO610116228Latihan31PerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        mahasiswa mahasiswa1 = new mahasiswa();
        mahasiswa1.nim = "";
        mahasiswa1.nama=""+"\n";
        mahasiswa1.PerkenalanDiri(mahasiswa1.nim, mahasiswa1.nama);
        
        mahasiswa mahasiswa2 = new mahasiswa();
        mahasiswa2.nim = "";
        mahasiswa2.nama=""+"\n";
        mahasiswa2.PerkenalanDiri(mahasiswa2.nim, mahasiswa2.nama);
        
        mahasiswa mahasiswa3 = new mahasiswa();
        mahasiswa3.nim = "";
        mahasiswa3.nama=""+"\n";
        mahasiswa3.PerkenalanDiri(mahasiswa3.nim, mahasiswa2.nama);
        
        mahasiswa mahasiswa4 = new mahasiswa();
        mahasiswa4.nim = "";
        mahasiswa4.nama=""+"\n";
        mahasiswa4.PerkenalanDiri(mahasiswa4.nim, mahasiswa2.nama);
    }
    
}
