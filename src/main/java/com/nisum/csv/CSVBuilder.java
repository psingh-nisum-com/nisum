package com.nisum.csv;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yc05ps3 on 6/23/15.
 */
public final class CSVBuilder {
    public static List<StringBuilder> buildCSVRows(Element table){
        List<StringBuilder> csvList=new ArrayList<StringBuilder>();
        Elements trs = table.getElementsByTag("tr");
        for(Element tr:trs){
            Elements tds =  tr.select("th,td");
            int i=0;
            StringBuilder oneRow=new StringBuilder();
            for(Element td:tds){
                oneRow.append(td.text());
                if(i++>0){
                    oneRow.append(",");
                }
            }
            csvList.add(oneRow);
        }
        return csvList;
    }
}
