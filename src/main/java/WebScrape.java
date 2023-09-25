import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WebScrape {
    public static void main(String[] args) {
        String url = "https://www.vejreti.com/europe/denmark?page=today";

        try {
            // Connect to the website and get the HTML document
            Document document = Jsoup.connect(url)
                    .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36")
                    .get();

            // Create a list to store WeatherDTO objects
            List<WeatherDTO> weatherDataList = new ArrayList<>();

            // Select the elements by class name (without the dot)

            Elements dayAndDateElements = document.getElementsByClass("day-value");
            Elements weatherElements = document.getElementsByClass("day-value");
            Elements chanceOfRainElements = document.getElementsByClass("day-value");
            Elements rainfallElements = document.getElementsByClass("day-value");
            Elements humidityElements = document.getElementsByClass("day-value");
            Elements windSpeedElements = document.getElementsByClass("day-value");
            Elements windPushElements = document.getElementsByClass("day-value");
            Elements windDirectionElements = document.getElementsByClass("day-value");
            Elements cloudCoverElements = document.getElementsByClass("day-value");
            Elements uvIndexElements = document.getElementsByClass("day-value");
            Elements visibilityElements = document.getElementsByClass("day-value");


            for (int i = 0; i < dayAndDateElements.size(); i++) {
                String dayAndDate = dayAndDateElements.get(i).text();
                String weather = weatherElements.get(i).text();
                String chanceOfRain = chanceOfRainElements.get(i).text();
                String rainfall = rainfallElements.get(i).text();
                String humidity = humidityElements.get(i).text();
                String windSpeed = windSpeedElements.get(i).text();
                String windPush = windPushElements.get(i).text();
                String windDirection = windDirectionElements.get(i).text();
                String cloudCover = cloudCoverElements.get(i).text();
                String uvIndex = uvIndexElements.get(i).text();
                String visibility = visibilityElements.get(i).text();

                WeatherDTO weatherDTO = new WeatherDTO(dayAndDate, weather, chanceOfRain, rainfall, humidity, windSpeed, windPush, windDirection, cloudCover, uvIndex, visibility);
                weatherDataList.add(weatherDTO);
            }


            // Print the weather data
            for (WeatherDTO weatherDTO : weatherDataList) {
                System.out.println(weatherDTO);
            }

            Thread.sleep(2000);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
