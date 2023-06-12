
package dataset;
import java.util.ArrayList;
public class datasetDataBerobat {

    private ArrayList<String> nama;
    private ArrayList<String> jenisKelamin;
    private ArrayList<Integer> umur;
    
    
    public datasetDataBerobat(){
        nama = new ArrayList<String>();
        jenisKelamin = new ArrayList<String>();
        umur = new ArrayList<Integer>();
    }
    
     public void insertnama (String isi){
        this.nama.add(isi);
    }
    
    public ArrayList<String> getRecordNama() {
    return this.nama;
    }
    
    
     public void insertJenisKelamin (String isi){
        this.jenisKelamin.add(isi);
    }
    
    public ArrayList<String> getRecordJenisKelamin() {
    return this.jenisKelamin;
    }
    
     public void insertUmur(int isi){
        this.umur.add(isi);
    }
    
    public ArrayList<Integer> getRecordUmur() {
    return this.umur;
    }
}
