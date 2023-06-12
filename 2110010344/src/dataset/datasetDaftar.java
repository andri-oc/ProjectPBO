
package dataset;
import java.util.ArrayList;

public class datasetDaftar{
    private ArrayList<String> nama;
    private ArrayList<String> poli;
    
    public datasetDaftar(){
        nama = new ArrayList<String>();
        poli = new ArrayList<String>();       
    }
    
    public void insertNama (String isi) {
        this.nama.add(isi);       
    }
    
    public ArrayList<String> getRecordNama(){
        return this.nama;
    }
    
    public void insertPoli (String isi) {
        this.poli.add(isi);
    }
    
    public ArrayList<String> getRecordPoli(){
        return this.poli;
    }
    
    
}

 