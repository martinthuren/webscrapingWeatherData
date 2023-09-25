package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class WebscraperDMI {

    public static void main(String[] args) throws IOException {
            scrapeDMI();
    }

    public static void scrapeDMI() throws IOException {
        String url = "https://www.vejreti.com/europe/denmark?page=14";
        Document doc = Jsoup.connect(url).get();

        String className = "weather_day_box ";

        int count = 0;

        for (Element row : doc.getElementsByClass(className)) {

            final String day = row.getElementsByClass("weather_day_date").text();

            final String dateMonth = row.getElementsByClass("weather_date_month").text();

            final String temp = row.getElementsByClass("fourteen_day_wrap").text();

            System.out.println(day + " " + dateMonth + " " + temp);
        }
    }
}
