/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2110010344;

/**
 *
 * @author ASUS
 */
public class Main {

  
    public static void main(String[] args) {
        // TODO code application logic here
        
       registrasi pasien = new registrasi("213124","zidan","ayani");
        System.out.println("kode: " + pasien.getkode());
        System.out.println("nama: " + pasien.getnama());
        System.out.println("alamat: " + pasien.getalamat());
        
        data pasien1 = new data ("21433","zidan","03983274327");
        System.out.println("kode: " + pasien1.getkode());
        System.out.println("nama: " + pasien1.getnama());
        System.out.println("no_telp: " + pasien1.getno_telp());
        
        daftar pasien2 = new daftar("zidan","tulang");
        System.out.println("nama: " + pasien2.getnama());
        System.out.println("poli: " + pasien2.getpoli());
        
        databerobat pasien3 = new databerobat ("zidan","pria","18");
        System.out.println("nama: " + pasien3.getnama());
        System.out.println("jenis_kelamin: " + pasien3.getjenis_kelamin());
        System.out.println("umur: " + pasien3.getumur());
        
        datapenyakit pasien4 = new datapenyakit("zidan");
        System.out.println("nama: " + pasien4.getnama());
        
        dataobat pasien5 = new dataobat ("zidan","15ribu");
        System.out.println("nama_obat: " + pasien5.getnama_obat());
        System.out.println("harga_obat: " + pasien5.getharga_obat());
        
        datapelayanan pasien6 = new datapelayanan ("zidan");
        System.out.println("nama: " + pasien6.getnama());
        
        pengguna pasien7 = new pengguna ("100","rahasi","menengah");
        System.out.println("user: " + pasien7.getuser());
        System.out.println("password: " + pasien7.getpassword());
        System.out.println("level: " + pasien7.getlevel());
    }
    
}
