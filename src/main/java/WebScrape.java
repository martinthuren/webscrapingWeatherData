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
            Document document = Jsoup.connect(url)
                    .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36")
                    .get();

            // Create a list to store WeatherDTO objects
            List<WeatherDTO> weatherDataList = new ArrayList<>();

            // Select the elements by class name (without the dot)
            Elements dayAndDate = document.getElementsByClass("weather_day_date");
            Elements date = document.getElementsByClass("weather_date_month");
            Elements tempOfDay = document.getElementsByClass("day-max-temp");
            Elements wind = document.getElementsByClass("data-wind");
            Elements humidity = document.getElementsByClass("wind_unit");


            // Iterate over the elements
            for (int i = 0; i < dayAndDate.size(); i++) {
                String day = dayAndDate.get(i).text();
                String temp = tempOfDay.get(i).text();
                String specificdate = date.get(i).text();
                String dailyhumidity = humidity.get(i).text();
                WeatherDTO weatherDTO = new WeatherDTO(day, temp, specificdate, dailyhumidity);
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
