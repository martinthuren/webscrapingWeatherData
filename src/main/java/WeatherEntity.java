import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "weather_data")
public class WeatherEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "day")
    private String day;

    @Column(name = "temperature_of_day")
    private String tempOfDay;

    @Column(name = "date")
    private String date;

    @Column(name = "wind_info")
    private String windDTO;

    public WeatherEntity(String day, String tempOfDay, String date, String windDTO) {
        this.day = day;
        this.tempOfDay = tempOfDay;
        this.date = date;
        this.windDTO = windDTO;
    }

    public WeatherEntity() {
        // Default constructor required by JPA
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getTempOfDay() {
        return tempOfDay;
    }

    public void setTempOfDay(String tempOfDay) {
        this.tempOfDay = tempOfDay;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getWindDTO() {
        return windDTO;
    }

    public void setWindDTO(String windDTO) {
        this.windDTO = windDTO;
    }

    @Override
    public String toString() {
        return "WeatherEntity{" +
                "id=" + id +
                ", day='" + day + '\'' +
                ", tempOfDay='" + tempOfDay + '\'' +
                ", date='" + date + '\'' +
                ", windDTO='" + windDTO + '\'' +
                '}';
    }
}
