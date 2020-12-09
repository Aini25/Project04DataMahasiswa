/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datamahasiswa;
import java.text.ParseException;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author ASUS
 */
public class OperasiData {
    ArrayList<Mahasiswa> operasiData = new ArrayList<Mahasiswa>();
    Scanner input = new Scanner(System.in);
    
    
    void tambahData() throws ParseException {
        String nimmhs, namamhs, tanggalmhs;
        int gendermhs;
        char ans;   
        
        System.out.println(" ");
        System.out.println("================= Tambah Data ==================");
        do {
             input.nextLine();
            System.out.print("Masukkan NIM : ");
            nimmhs = input.nextLine();
            
            System.out.print("Masukkan Nama : ");
            namamhs = input.nextLine();

            System.out.print("Masukkan Tanggal Lahir [dd-mm-yyyy] : ");
            tanggalmhs = input.nextLine();

            System.out.print("Masukkan Gender [0:LK / 1:P] : ");
            gendermhs = input.nextInt();

            this.operasiData.add(new Mahasiswa(nimmhs, namamhs, tanggalmhs, gendermhs));
            System.out.println("\n------------------------------");
            System.out.println(" - Data berhasil ditambahkan! -");
            System.out.println("------------------------------");
            
            System.out.print("\n Tambah Data Lagi? [y/n] : ");
            ans = input.next().charAt(0);
            System.out.println(" ");
            System.out.println("================================================");
            
        } while (ans == 'y' || ans == 'Y');
    }
    
    void hapusData() {
        input.nextLine();
        System.out.println("================= Hapus Data ===================");
        String nim;
        tampilData();
        
        if(this.operasiData.isEmpty()) {
            System.out.println(" ");
        }
        else {
            System.out.print("\n Data yang ingin dihapus [nim] : ");
            nim = input.nextLine();
        
            this.operasiData.removeIf(i -> i.nim.equals(nim));
        }
    }
    
    void cariData() {
        String nim;
        int gender;
        
        input.nextLine();
        System.out.println("================== Cari Data ===================");
        System.out.println(" ");
        System.out.println("1. Berdasarkan NIM");
        System.out.println("2. Berdasarkan Gender");
        System.out.println(" ");
        System.out.print("Pilihan [1/2] : ");
        int pilih = input.nextInt();
        input.nextLine();
        
        if (pilih == 1) {
            System.out.print("\n NIM yang ingin dicari : ");
            nim = input.nextLine();
            
            for(int i =0; i < this.operasiData.size(); i++) {
                if(this.operasiData.get(i).nim == null ? nim == null : this.operasiData.get(i).nim.equals(nim)) {
                    this.operasiData.get(i).tampilan();
                }
            }
        }
        
        if (pilih == 2) {
            System.out.print("Gender yang ingin dicari [0:LK / 1:P] : ");
            gender = input.nextInt();
            
            for(int i =0; i < this.operasiData.size(); i++) {
                if(this.operasiData.get(i).gender == gender) {
                    this.operasiData.get(i).tampilan();
                }
            }
        }
    }
    
    void tampilData() {
        System.out.println(" ");
        
        if(this.operasiData.isEmpty()) {
            System.out.println("Belum Ada Data Terinput");
        }
        else {
            for(Mahasiswa i : this.operasiData) {
            i.tampilan(); 
            }
        }
    }
}
