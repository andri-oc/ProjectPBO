package dataset;

import java.util.ArrayList;

public class datasetDataPelayan {

    private ArrayList<String> nama;

    public datasetDataPelayan() {
        nama = new ArrayList<String>();
    }

    public void insertnama(String isi) {
        this.nama.add(isi);
    }

    public ArrayList<String> getRecordNama() {
        return this.nama;
    }
}
