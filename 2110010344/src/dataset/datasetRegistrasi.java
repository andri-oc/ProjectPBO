
package dataset;
import java.util.ArrayList;
public class datasetRegistrasi {

    private ArrayList<Integer> kode;
    private ArrayList<String> nama;
    private ArrayList<String> alamat;
    
    public datasetRegistrasi() {
    kode = new ArrayList<Integer>();
    nama = new ArrayList<String>();
    alamat = new ArrayList<String>();
    
    }
    
    public void insertkode(int isi){
        this.kode.add(isi);
    }
    
    public ArrayList<Integer> getRecordKode(){
        return this.kode;
    }
    
    
    public void insertNama(String isi){
        this.nama.add(isi);
    }
    
    public ArrayList<String> getRecordNama(){
        return this.nama;
    }
    
    public void insertAlamat(String isi){
        this.alamat.add(isi);
    }
    
    public ArrayList<String> getRecordAlamat(){
     return this.alamat;
    }
    
    public void insertRegistrasi(int kode, String nama, String alamat){
        this.kode.add(kode);
        this.nama.add(nama);
        this.alamat.add(alamat);
        
    }
 
}

    
  
