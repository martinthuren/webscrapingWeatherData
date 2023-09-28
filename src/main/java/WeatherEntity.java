import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "weather_data")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class WeatherEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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




    public WeatherEntity(String time, String temperature, String weatherCondition, String precipitationChance, String precipitationAmount, String humidity, String windSpeed, String windGust, String windDirectionDegrees, String windDirection, String cloudCoverage, String uvIndex, String visibility) {
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




}
