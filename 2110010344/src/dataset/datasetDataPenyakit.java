package dataset;

import java.util.ArrayList;

public class datasetDataPenyakit {

    private ArrayList<String> namaPenyakit;

    public datasetDataPenyakit() {
        namaPenyakit = new ArrayList<String>();
    }

    public void insertnamaPenyakit(String isi) {
        this.namaPenyakit.add(isi);
    }

    public ArrayList<String> getRecordNamaPenyakit() {
        return this.namaPenyakit;
    }

}
