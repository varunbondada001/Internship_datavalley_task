import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class WeatherData {
    double temperature;
    double humidity;

    public WeatherData(double temperature, double humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
    }
}

public class WeatherAnalyzer {
    public static void main(String[] args) {
        List<WeatherData> weatherDataList = new ArrayList<>();
        weatherDataList.add(new WeatherData(5.0, 60.0));
        weatherDataList.add(new WeatherData(15.0, 70.0));
        weatherDataList.add(new WeatherData(25.0, 80.0));

        Map<String, WeatherStats> analysis = analyzeWeather(weatherDataList);
        for (Map.Entry<String, WeatherStats> entry : analysis.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<String, WeatherStats> analyzeWeather(List<WeatherData> weatherDataList) {
        Map<String, WeatherStats> result = new HashMap<>();

        result.put("<0°C", new WeatherStats());
        result.put("0-10°C", new WeatherStats());
        result.put("10-20°C", new WeatherStats());
        result.put(">20°C", new WeatherStats());

        for (WeatherData data : weatherDataList) {
            double temperature = data.temperature;
            double humidity = data.humidity;

            if (temperature < 0) {
                result.get("<0°C").addData(temperature, humidity);
            } else if (temperature >= 0 && temperature <= 10) {
                result.get("0-10°C").addData(temperature, humidity);
            } else if (temperature > 10 && temperature <= 20) {
                result.get("10-20°C").addData(temperature, humidity);
            } else {
                result.get(">20°C").addData(temperature, humidity);
            }
        }

        return result;
    }
}

class WeatherStats {
    double totalTemperature;
    double totalHumidity;
    int count;

    public WeatherStats() {
        this.totalTemperature = 0.0;
        this.totalHumidity = 0.0;
        this.count = 0;
    }

    public void addData(double temperature, double humidity) {
        totalTemperature += temperature;
        totalHumidity += humidity;
        count++;
    }

    @Override
    public String toString() {
        double avgTemperature = count > 0 ? totalTemperature / count : 0.0;
        double avgHumidity = count > 0 ? totalHumidity / count : 0.0;
        return "Average Temperature: " + avgTemperature + "°C, Average Humidity: " + avgHumidity;
    }
}
