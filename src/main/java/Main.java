import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;

public class Main {

    public static void main(String [] args){

        //ArrayList to store WeatherEntity objects
        ArrayList<WeatherEntity> list = Webscrapper.getDTOData();

        // Iterate each WeatherEntity in the list
        list.forEach(weatherEntity -> {

            // For each WeatherEntity, save it using the WeatherDAO
            WeatherDAO.save(weatherEntity);
        });



    }
}
