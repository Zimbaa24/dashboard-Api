package collins.prince.domain.weather.models;

import java.util.Objects;

public class WeatherMain {

    private Double temp;
    private Double feel_like;
    private Double temp_min;
    private Double temp_max;
    private Integer pressure;
    private Integer humidity;

    public WeatherMain(){

    }

    public WeatherMain(Double temp, Double feel_like, Double temp_min, Double temp_max, Integer pressure, Integer humidity) {
        this.temp = temp;
        this.feel_like = feel_like;
        this.temp_min = temp_min;
        this.temp_max = temp_max;
        this.pressure = pressure;
        this.humidity = humidity;
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public Double getFeel_like() {
        return feel_like;
    }

    public void setFeel_like(Double feel_like) {
        this.feel_like = feel_like;
    }

    public Double getTemp_min() {
        return temp_min;
    }

    public void setTemp_min(Double temp_min) {
        this.temp_min = temp_min;
    }

    public Double getTemp_max() {
        return temp_max;
    }

    public void setTemp_max(Double temp_max) {
        this.temp_max = temp_max;
    }

    public Integer getPressure() {
        return pressure;
    }

    public void setPressure(Integer pressure) {
        this.pressure = pressure;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WeatherMain weatherMain = (WeatherMain) o;
        return Objects.equals(temp, weatherMain.temp) && Objects.equals(feel_like, weatherMain.feel_like) && Objects.equals(temp_min, weatherMain.temp_min) && Objects.equals(temp_max, weatherMain.temp_max) && Objects.equals(pressure, weatherMain.pressure) && Objects.equals(humidity, weatherMain.humidity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(temp, feel_like, temp_min, temp_max, pressure, humidity);
    }

    @Override
    public String toString() {
        return "Main{" +
                "temp=" + temp +
                ", feel_like=" + feel_like +
                ", temp_min=" + temp_min +
                ", temp_max=" + temp_max +
                ", pressure=" + pressure +
                ", humidity=" + humidity +
                '}';
    }
}
