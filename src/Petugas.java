/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author 
 * Nama  : Diva Sabila Ramadhan 
 * Kelas : IF1
 * NIM   : 10119039
 * Deskripsi Program : berisi class petugas 
 */
public class Petugas {
    Scanner sc = new Scanner(System.in);
    private String namaPetugas;
    private int [] arrNilai;
    
    public void masukkanNama(){
        System.out.print("Masukkan nama petugas : ");
        namaPetugas = sc.next();
    }

public void masukkanNilai(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan banyaknya mahasiswa : ");
    int jumlah = sc.nextInt();
    arrNilai = new int[jumlah];
    for(int i=0;i<jumlah;i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-"+(i+1)+" = ");
            arrNilai[i] = sc.nextInt();
        }
        menentukanNilai(arrNilai);
}    

public void menentukanNilai(int[] nilaiMhs){
    Nilai nilai = new Nilai();
    nilai.penentuanNilai(nilaiMhs, namaPetugas);
}
}
