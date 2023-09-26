import java.io.IOException;
import java.time.LocalDate;

public class WeatherAPIReader {

    private static final String API_KEY = "06e47ecc2007202aeeeb0052f290d0a4";
    private static final String API_BASE_URL = "https://api.openweathermap.org/data/2.5/weather";


    public WeatherDTO fetchWeatherData(String location, LocalDate date) {
        try {
            String APIUrl = constructAPIUrl(location, date);
            String APIResponse = makeHttpRequest(APIUrl);
            WeatherDTO weatherDTO = parseAPIResponse(APIResponse);

            return weatherDTO;
        } catch (IOException e) {
            e.printStackTrace();  // Handle IO errors
            return null;
        }
    }
}
