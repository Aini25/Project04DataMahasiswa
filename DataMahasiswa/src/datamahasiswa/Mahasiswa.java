/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datamahasiswa;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 *
 * @author ASUS
 */
public class Mahasiswa {
    String nim, nama;
    Date tgl;
    int gender;
    
    Mahasiswa(String nimmhs, String namamhs, String tanggalmhs, int gendermhs) throws ParseException {
        this.nim = nimmhs;
        this.nama = namamhs;
        this.tgl = new SimpleDateFormat("dd-MM-yyyy").parse(tanggalmhs);
        this.gender = gendermhs;
    }
    
    
    void tampilan() {
        String gen = (this.gender == 0)? "Laki - Laki" : "Perempuan";
        System.out.println(" ");
        System.out.println("--------------------------------------------");
        System.out.println("============ Database Mahasiswa ============");
        System.out.println("--------------------------------------------");
        System.out.println("NIM         : " + nim);
        System.out.println("Nama        : " + nama);
        System.out.println("Tgl Lahir   : " + tgl);
        System.out.println("Gender      : " + gen);
        System.out.println("--------------------------------------------");
    }
}
