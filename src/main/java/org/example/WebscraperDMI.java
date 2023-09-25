package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class WebscraperDMI {
    public static void main(String[] args) throws IOException {
        scrape();
    }

    public static void scrape() throws IOException {
        String url = "https://www.dmi.dk/lokation/show/DK/2618468/Kongens_Lyngby/";
        Document doc = Jsoup.connect(url).get();

        
    }
}



