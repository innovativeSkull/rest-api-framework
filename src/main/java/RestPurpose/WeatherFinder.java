package RestPurpose;

import RestAction.RestActionBase;
import io.restassured.http.Method;
import org.testng.Assert;

import java.util.HashMap;
import java.util.Random;

public class WeatherFinder {

    public void getWeatherByToolsQA(String city) {

        RestActionBase weatherAPI = new RestActionBase();
        weatherAPI.setBaseURI(Method.GET, "http://demoqa.com/utilities/weather/city/" + city);
        weatherAPI.execute();

        System.out.println("Weather : \n " + weatherAPI.getPrettyResponseBody());

        Assert.assertEquals(weatherAPI.getStatusCode(), 200);
    }

    public void getWeatherByOpenWeatherMap(String country) {

        RestActionBase weatherAPI = new RestActionBase();
        weatherAPI.setBaseURI(Method.GET, "https://samples.openweathermap.org/data/2.5/weather");
        weatherAPI.setQueryParameter("q", country);
        weatherAPI.setQueryParameter("appid", String.valueOf(Math.random()));
        weatherAPI.execute();

        System.out.println("Weather : \n " + weatherAPI.getPrettyResponseBody());

        Assert.assertEquals(weatherAPI.getStatusCode(), 200);
    }
}
