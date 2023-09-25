public class WeatherDTO {
    private String day;
    private String tempOfDay;
    private String date;
    private String windDTO;


    public WeatherDTO(String day, String tempOfDay, String date, String windDTO) {
        this.day = day;
        this.tempOfDay = tempOfDay;
        this.date = date;
        this.windDTO = windDTO;
    }

    // Getters and setters for the new attributes


    @Override
    public String toString() {
        return "WeatherDTO{" +
                "day='" + day + '\'' +
                ", tempOfDay='" + tempOfDay + '\'' +
                ", date='" + date + '\'' +
                ", windDTO='" + windDTO + '\'' +
                '}';
    }
}



