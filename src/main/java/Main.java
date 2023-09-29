import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;

public class Main {

    public static void main(String [] args){

       ArrayList<WeatherEntity> list =  Webscrapper.getDTOData();

       list.forEach(weatherEntity -> {
           WeatherDAO.save(weatherEntity);
       });


    }
}
