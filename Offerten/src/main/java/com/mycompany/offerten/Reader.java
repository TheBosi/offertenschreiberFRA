package com.mycompany.offerten;

import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Iuri Menia
 */
public class Reader {

    private String url;
    private int i = 0;
    String line;
    String[] dataIn;
    List<String[]> rows = new ArrayList<>();
    CSVReader read = null;

    public void read() {
        try {
            read = new CSVReader(new FileReader(url));

            while ((dataIn = read.readNext()) != null) {
                rows.add(dataIn);
                rows.spliterator();
                for (String string : dataIn) {
                    System.out.println(string);
                }
            }

        } catch (Exception e) {
        }
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
