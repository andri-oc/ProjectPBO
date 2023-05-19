/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2110010344;

/**
 *
 * @author ASUS
 */
 class daftar {
     private String nama;
     private String poli;
    
     public daftar (String nama, String poli){
         this.nama=nama;
         this.poli=poli;
     }
     
     public String getnama(){
         return nama;
     }
     public void setnama(){
         this.nama=nama;
     }
     
     public String getpoli(){
         return poli;
     }
     public void setpoli(){
         this.poli=poli;
     }
}
