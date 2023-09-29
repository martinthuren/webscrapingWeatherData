import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@Builder
public class WeatherDTO {

    private String time;
    private String temperature;
    private String weatherCondition;
    private String precipitationChance;
    private String precipitationAmount;
    private String humidity;
    private String windSpeed;
    private String windGust;
    private String windDirectionDegrees;
    private String windDirection;
    private String cloudCoverage;
    private String uvIndex;
    private String visibility;

    public WeatherDTO(String time, String temperature, String weatherCondition, String precipitationChance, String precipitationAmount, String humidity, String windSpeed, String windGust, String windDirectionDegrees, String windDirection, String cloudCoverage, String uvIndex, String visibility) {
        this.time = time;
        this.temperature = temperature;
        this.weatherCondition = weatherCondition;
        this.precipitationChance = precipitationChance;
        this.precipitationAmount = precipitationAmount;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
        this.windGust = windGust;
        this.windDirectionDegrees = windDirectionDegrees;
        this.windDirection = windDirection;
        this.cloudCoverage = cloudCoverage;
        this.uvIndex = uvIndex;
        this.visibility = visibility;
    }

    @Override
    public String toString() {
        return "WeatherDTO{" +
                "time='" + time + '\'' +
                ", temperature='" + temperature + '\'' +
                ", weatherCondition='" + weatherCondition + '\'' +
                ", precipitationChance='" + precipitationChance + '\'' +
                ", precipitationAmount='" + precipitationAmount + '\'' +
                ", humidity='" + humidity + '\'' +
                ", windSpeed='" + windSpeed + '\'' +
                ", windGust='" + windGust + '\'' +
                ", windDirectionDegrees='" + windDirectionDegrees + '\'' +
                ", windDirection='" + windDirection + '\'' +
                ", cloudCoverage='" + cloudCoverage + '\'' +
                ", uvIndex='" + uvIndex + '\'' +
                ", visibility='" + visibility + '\'' +
                '}';
    }


    // Constructors, getters, and setters
    // You can generate constructors, getters, and setters for the above fields using your IDE.
}
