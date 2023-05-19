/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2110010344;

/**
 *
 * @author ASUS
 */
 class registrasi {
    private String kode;
    private String nama;
    private String alamat;
  
    public registrasi ( String kode, String nama, String alamat){
        this.kode=kode;
        this.nama=nama;
        this.alamat=alamat;
    }
    
    public String getkode(){
        return kode;
    }
    public void setkdoe(){
        this.kode=kode;
    }
    
    public String getnama(){
        return nama;
    }
    public void setnama(){
        this.nama=nama;
    }
    
    public String getalamat (){
        return alamat;
    }
    public void setalamat(){
        this.alamat=alamat;
    }
}
