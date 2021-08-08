package apitester;

import test.activity.get.WeatherFinder;
import org.testng.annotations.Test;

public class TC002_GET_Tester {

    WeatherFinder weatherFinder = new WeatherFinder();

    @Test(priority = 1, description = "Get Weather by Tools QA API")
    public void getWeatherByToolsQA() {

        System.out.println("TC002 : Method 1 : Get Weather by Tools QA API");
        System.out.println("==================================================================");
        weatherFinder.getWeatherByToolsQA("Pune");
        weatherFinder.getWeatherByToolsQA("Mumbai");
        weatherFinder.getWeatherByToolsQA("Bengaluru");
    }

    @Test(priority = 2, description = "Get Weather by Tools Open weather API")
    public void getWeatherByOpenWeather() {

        System.out.println("TC002 : Method 2 : Get Weather by Open Weather API");
        System.out.println("==================================================================");
        weatherFinder.getWeatherByOpenWeatherMap("India");
        weatherFinder.getWeatherByOpenWeatherMap("UK");
        weatherFinder.getWeatherByOpenWeatherMap("USA");
    }
}
