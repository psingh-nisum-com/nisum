package com.nisum.csv;

import au.com.bytecode.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * Created by yc05ps3 on 6/23/15.
 */
public final class CSVFileWriter {
    public static void writeToFile(String filePath, List<StringBuilder> csvRows) throws IOException{
        CSVWriter writer = new CSVWriter(new FileWriter(filePath));

        for(StringBuilder csvRow:csvRows){
            //Create record
            String [] record = csvRow.toString().split(",");
            //Write the record to file
            writer.writeNext(record);
        }
        //close the writer
        writer.close();
    }
}
