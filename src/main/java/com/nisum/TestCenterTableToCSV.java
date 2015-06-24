package com.nisum;

import com.nisum.csv.CSVBuilder;
import com.nisum.csv.CSVFileWriter;
import com.nisum.html.HtmlReader;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class TestCenterTableToCSV {

        public static void main(String[] args) throws IOException {
            HtmlReader htmlReader=new HtmlReader();
            String url="http://localhost:8234/sample.html";
            Document doc = htmlReader.getDocument(url);
            Element table = htmlReader.getCenterTable(doc);
            CSVFileWriter.writeToFile("data.csv", CSVBuilder.buildCSVRows(table));
        }
}
