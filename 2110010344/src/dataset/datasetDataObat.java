package dataset;

import java.util.ArrayList;




public class datasetDataObat {
    
    private ArrayList<String> namaObat;
    private ArrayList<Integer> hargaObat;

    
    public datasetDataObat (){
        namaObat = new ArrayList<String>();
        hargaObat = new ArrayList<Integer>();     
    }
    
    
    public void insertnamaObat (String isi){
        this.namaObat.add(isi);
    }
    
    public ArrayList<String> getRecordNamaObat() {
    return this.namaObat;
    }
    
    public void inserthargaObat (int isi){
        this.hargaObat.add(isi);
    }
    
    public ArrayList<Integer> getRecordhargaObat() {
    return this.hargaObat;
    }
    
}
