package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class weatherScraper {

    String dmiUrl = "https://www.dmi.dk/lokation/show/DK/2618468/Kongens_Lyngby/";

    Document docs;

    {
        try {
            docs = Jsoup.connect(dmiUrl).get();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public void getWeather() throws IOException {

        //get title of website
        System.out.println(docs.getElementsByClass("sc-kgoBCf fORdZq"));


    }
}
