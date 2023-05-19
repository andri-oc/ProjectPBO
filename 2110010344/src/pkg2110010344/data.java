/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2110010344;

/**
 *
 * @author ASUS
 */
class data {
    private String kode;
    private String nama;
    private String no_telp;
    
    public data (String kode, String nama, String no_telp){
        this.kode=kode;
        this.nama=nama;
        this.no_telp=no_telp;
    }
    
    public String getkode(){
        return kode;
    }
    public void setkode(){
        this.kode=kode;
    }
    
    public String getnama(){
        return nama;
    }
    public void setnama(){
        this.nama=nama;
    }
    
    public String getno_telp(){
        return no_telp;
    }
    public void setnot_telp(){
        this.no_telp=no_telp;
    }
}
