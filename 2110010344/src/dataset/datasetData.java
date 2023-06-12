package dataset;
import java.util.ArrayList;


public class datasetData {
    private ArrayList<String> kode;
    private ArrayList<String> nama;
    private ArrayList<Integer> noTelp;
    
    
    public datasetData(){
    kode = new ArrayList<String>();
    nama = new ArrayList<String>();
    noTelp = new ArrayList<Integer>();
    }
    
    public void insertKode (String isi){
        this.kode.add(isi);
    }
    
    public ArrayList<String> getRecordKode() {
    return this.kode;
    }
    
    
      public void insertNama (String isi){
        this.nama.add(isi);
    }
    
    public ArrayList<String> getRecordNama() {
    return this.nama;
    }
    
    public void insertNoTelp(int isi){
        this.noTelp.add(isi);
    }
    
     public ArrayList<Integer> getRecordNoTelp() {
    return this.noTelp;
    }
    
    
    
}
