/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2110010344;

/**
 *
 * @author ASUS
 */
 class dataobat {
     private String nama_obat;
     private String harga_obat;
     
     public dataobat (String nama_obat, String harga_obat){
         this.nama_obat=nama_obat;
         this.harga_obat=harga_obat;
     }
     
     public String getnama_obat(){
        return nama_obat;
     }
     public void setnama_obat(){
         this.nama_obat=nama_obat;
     }
     
     public String getharga_obat(){
         return harga_obat;
     }
     public void setharga_obat(){
         this.harga_obat=harga_obat;
     }
}
