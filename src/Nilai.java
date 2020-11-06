/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 * Nama  : Diva Sabila Ramadhan
 * Kelas : IF1
 * NIM   : 10119039
 * Deskripsi Program : berisi class Nilai 
 */
public class Nilai {
    private int terbesar, terkecil;
    
    private int menentukanNilaiTerkecil(int[] nilaiMhs){
        int nilaiTerkecil = nilaiMhs[0];
        for(int i : nilaiMhs) {
            if(nilaiTerkecil > i) {
                nilaiTerkecil = i;
            }
            return nilaiTerkecil;
    }
        
    private int menentukanNilaiTerbesar(int[] nilaiMhs) {
        int nilaiTerbesar = nilaiMhs[0];
        for(int i : nilaiMhs) {
            if(nilaiTerbesar < i) {
                nilaiTerbesar = i;
            }
        }
        return nilaiTerbesar;
    }
    
    private void tampil(int terbesar, int terkecil, int[] nilaiMhs, String petugas) {
        System.out.println("=====Hasil Nilai Mahasiswa=====");
        int num = 1;
        for(int i : nilaiMhs) {
            System.out.println("Nilai Mahasiswa Ke-"+num+" = "+i);
            num++;
        }
        System.out.println("Nilai Terbesar adalah "+terbesar);
        System.out.println("Nilai Terkecil adalah "+terkecil);
        System.out.println("Petugas : "+petugas);
    }
     
    public void penentuanNilai(int[] nilaiMhs, String petugas) {
        terbesar = menentukanNilaiTerbesar(nilaiMhs);
        terkecil = menentukanNilaiTerkecil(nilaiMhs);
        tampil(terbesar, terkecil, nilaiMhs, petugas);
    } 
}
