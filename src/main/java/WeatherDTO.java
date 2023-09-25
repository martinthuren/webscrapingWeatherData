public class WeatherDTO {
    private String time;
    private String temperature;
    private String humidity;
    private String weatherCondition;
    private String day;

    public WeatherDTO(String time, String temperature, String humidity, String weatherCondition) {
        this.time = time;
        this.temperature = temperature;
        this.humidity = humidity;
        this.weatherCondition = weatherCondition;
    }

    public WeatherDTO(String day) {
        this.day = day;
    }

    // Getters and setters for the new attributes

    @Override
    public String toString() {
        return "WeatherDTO{" +
                "day='" + day + '\'' +
                '}';
    }
}

