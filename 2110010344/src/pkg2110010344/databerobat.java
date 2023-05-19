/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2110010344;

/**
 *
 * @author ASUS
 */
 class databerobat {
     private String nama;
     private String jenis_kelamin;
     private String umur;
     
     public databerobat(String nama, String jenis_kelamin, String umur){
         this.nama=nama;
         this.jenis_kelamin=jenis_kelamin;
         this.umur=umur;
     }
    public String getnama(){
       return nama;
    }
    public void setnama(){
        this.nama=nama;
    }
    
    public String getjenis_kelamin(){
        return jenis_kelamin;
    }
    public void setjenis_kelamin(){
        this.jenis_kelamin=jenis_kelamin;
    }
    
    public String getumur(){
        return umur;
    }
    public void setumur(){
        this.umur=umur;
    }
 }