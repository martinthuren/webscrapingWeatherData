import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WebScrape {
    public static void main(String[] args) {
        String url = "https://www.vejreti.com/europe/denmark?page=14";

        try {
            // Connect to the website and get the HTML document
            Document document = Jsoup.connect(url).get();

            // Create a list to store WeatherDTO objects
            List<WeatherDTO> weatherDataList = new ArrayList<>();

            // Extract temperature, humidity, and weather conditions
          /*  Elements timeElements = document.select(".hour");
            Elements temperatureElements = document.select(".hour-temperature .temp");
            Elements humidityElements = document.select(".hour-temperature .humid");
            Elements weatherConditionElements = document.select(".hour-weather .weather");
*/

            Elements dayOfWeek = document.select(".day");

            for (int i = 0; i < weatherDataList.size(); i++) {
                String day = dayOfWeek.get(i).text();

                WeatherDTO weatherDTO = new WeatherDTO(day);
                weatherDataList.add(weatherDTO);
            }

            // Iterate through the elements and create WeatherDTO objects
         /*   for (int i = 0; i < timeElements.size(); i++) {
                String time = timeElements.get(i).text();
                String temperature = temperatureElements.get(i).text();
                String humidity = humidityElements.get(i).text();
                String weatherCondition = weatherConditionElements.get(i).text();
*
                // Create a WeatherDTO object and add it to the list
                WeatherDTO weatherDTO = new WeatherDTO(time, temperature, humidity, weatherCondition);
                weatherDataList.add(weatherDTO);


            }
            */


            // Print the weather data
            for (WeatherDTO weatherDTO : weatherDataList) {
                System.out.println(weatherDTO);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
