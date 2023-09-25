public class WeatherDTO {
    private String dailyTemperatur;
    private String dailyWeather;
    private String dailyChanceOfRain;
    private String dailyRainfall;
    private String dailyHumidity;
    private String dailyWindSpeed;
    private String dailyWindPush;
    private String dailyWindDirection;
    private String dailyCloudCover;
    private String dailyUvIndex;
    private String dailyVisibility;

    public WeatherDTO(String dailyTemperatur, String dailyWeather, String dailyChanceOfRain, String dailyRainfall, String dailyHumidity, String dailyWindSpeed, String dailyWindPush, String dailyWindDirection, String dailyCloudCover, String dailyUvIndex, String dailyVisibility) {
        this.dailyTemperatur = dailyTemperatur;
        this.dailyWeather = dailyWeather;
        this.dailyChanceOfRain = dailyChanceOfRain;
        this.dailyRainfall = dailyRainfall;
        this.dailyHumidity = dailyHumidity;
        this.dailyWindSpeed = dailyWindSpeed;
        this.dailyWindPush = dailyWindPush;
        this.dailyWindDirection = dailyWindDirection;
        this.dailyCloudCover = dailyCloudCover;
        this.dailyUvIndex = dailyUvIndex;
        this.dailyVisibility = dailyVisibility;
    }


    // Getters and setters for the new attributes


    @Override
    public String toString() {
        return "WeatherDTO{" +
                "dailyTemperatur='" + dailyTemperatur + '\'' +
                ", dailyWeather='" + dailyWeather + '\'' +
                ", dailyChanceOfRain='" + dailyChanceOfRain + '\'' +
                ", dailyRainfall='" + dailyRainfall + '\'' +
                ", dailyHumidity='" + dailyHumidity + '\'' +
                ", dailyWindSpeed='" + dailyWindSpeed + '\'' +
                ", dailyWindPush='" + dailyWindPush + '\'' +
                ", dailyWindDirection='" + dailyWindDirection + '\'' +
                ", dailyCloudCover='" + dailyCloudCover + '\'' +
                ", dailyUvIndex='" + dailyUvIndex + '\'' +
                ", dailyVisibility='" + dailyVisibility + '\'' +
                '}';
    }
}




