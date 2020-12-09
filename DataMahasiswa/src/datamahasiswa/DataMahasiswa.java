/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datamahasiswa;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *makane, lali
 * @author ASUS
 */
public class DataMahasiswa {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        OperasiData o = new OperasiData();
        System.out.println("**************** SELAMAT DATANG ****************");
        System.out.println(" ");
        
        int pilih;
        do {
            System.out.println("\n                Data Mahasiswa               ");
            System.out.println(" ");
            System.out.println("1. Tambah Data");
            System.out.println("2. Hapus Data");
            System.out.println("3. Cari Data");
            System.out.println("4. Tampilkan Data");
            System.out.println("5. Keluar");
            System.out.println(" ");
            System.out.print("Pilihan Kamu [1/2/3/4/5] : ");
            pilih = input.nextInt();
            System.out.println("================================================");
        
            
            switch (pilih) {
                case 1 : 
                    o.tambahData();
                    break;

                case 2 : 
                    o.hapusData();
                    break;
                
                case 3: 
                    o.cariData();
                    break;
                
                case 4 : 
                    o.tampilData();
                    break;

                case 5 : 
                    System.out.println(" ");
                    System.out.println("BUBAY!, TERIMAKASIH!");
                    System.out.println(" ");
                    System.exit(3);

                default : 
                    System.out.println(" ");
                    System.out.println("Pilihan Tidak Tersedia!");
                    System.out.println(" ");
                    System.out.println("================================================");
            }
        } 
        while (true);
    }
    
}
