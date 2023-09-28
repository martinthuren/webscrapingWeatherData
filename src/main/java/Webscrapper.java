import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

public class Webscrapper {

    public static ArrayList<WeatherEntity> getDTOData() {

        String url = "https://www.vejreti.com/europe/denmark?page=today";
        String url2 = "https://www.imdb.com/chart/top/?ref_=nv_mv_250";

        Document doc = null;

        try{
            doc = Jsoup.connect(url).get();


            String secondFocusPoint = ".weather_table.day_table";
            Element table = doc.select(secondFocusPoint).first();
            Elements rows = table.select("tr");


            ArrayList<WeatherEntity> weatherObjects = new ArrayList<>();



            for (int iterator = 0; iterator < 8; iterator++) {

                // Select all columns in each row// Ensure there are enough columns for weather data
                    // Declare variables to hold extracted data

                    // get first index of row
                    String time = Webscrapper.bruh(0,iterator,rows);


                String temperature = Webscrapper.bruh(1,iterator,rows);


                String weatherCondition = Webscrapper.bruh(2,iterator,rows);

                String precipitationChance = Webscrapper.bruh(3,iterator,rows);

                String precipitationAmount = Webscrapper.bruh(4,iterator,rows);


                String humidity = Webscrapper.bruh(5,iterator,rows);
                String windSpeed = Webscrapper.bruh(6,iterator,rows);
                String windGust = Webscrapper.bruh(7,iterator,rows);
                String windDirectionDegrees = Webscrapper.bruh(8,iterator,rows);
                String windDirection = Webscrapper.bruh(9,iterator,rows);
                String cloudCoverage = Webscrapper.bruh(10,iterator,rows);
                String uvIndex = Webscrapper.bruh(11,iterator,rows);
                String visibility = Webscrapper.bruh(12,iterator,rows);



                WeatherEntity weatherEntity = WeatherEntity.builder()
                        .time(time)
                        .temperature(temperature)
                        .weatherCondition(weatherCondition)
                        .precipitationChance(precipitationChance)
                        .precipitationAmount(precipitationAmount)
                        .humidity(humidity)
                        .windSpeed(windSpeed)
                        .windGust(windGust)
                        .windDirectionDegrees(windDirectionDegrees)
                        .windDirection(windDirection)
                        .cloudCoverage(cloudCoverage)
                        .uvIndex(uvIndex)
                        .visibility(visibility).build();
                weatherObjects.add(weatherEntity);
                }

return weatherObjects;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static String bruh(int index, int iterator, Elements rows) {
        //index chooses which vertical row to use eg. index(0) = time 00:00, 03:00 | index(1) = temperature
        //Iterator
        //rows is just simply the ElementsLIST  we're working with
        String bruh = rows.get(index).select("td").stream()
                .limit(iterator+1)
                .toList()
                .get(iterator).text();
        return bruh;
    }


}
