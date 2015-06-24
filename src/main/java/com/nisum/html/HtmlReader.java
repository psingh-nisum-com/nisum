package com.nisum.html;

import au.com.bytecode.opencsv.CSVWriter;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yc05ps3 on 6/23/15.
 */
public class HtmlReader {

    public Document getDocument(String url) throws IOException{
        return Jsoup.connect(url).get();
    }

    public Element getCenterTable(Document doc){
        return doc.select("td>table").first();
    }
}


