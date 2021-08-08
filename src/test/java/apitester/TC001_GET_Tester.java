package apitester;

import RestPurpose.WeatherFinder;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONException;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC001_GET_Tester {

    @Test
    public void getWeather() throws JSONException {

        RestAssured.baseURI = "http://demoqa.com/utilities/weather/city/";

        RequestSpecification request = RestAssured.given();

        Response response = request.get("/Pune");

        String responseBody = response.getBody().asPrettyString();

        JSONObject responseJson = new JSONObject(responseBody);

        System.out.println("Response Body : \n" + responseBody);
        System.out.println("City : " + responseJson.get("City"));
        System.out.println("Temperature : " + responseJson.get("Temperature"));

        Assert.assertEquals(responseJson.get("Temperature").toString().contains("celsius"), true, "Assert : Checking whether Temperature is in celsius");

    }


    @Test
    public void getWeatherWithQueryParameter() throws JSONException {

        RestAssured.baseURI = "https://samples.openweathermap.org/data/2.5/";

        RequestSpecification requestSpecification = RestAssured.given();

        requestSpecification = requestSpecification.queryParam("q", "London,uk");
        requestSpecification = requestSpecification.queryParam("appid", "2b1fd2d7f77ccf1b7de9b441571b39b8");

        Response response = requestSpecification.get("/weather");

        String responseBody = response.getBody().asPrettyString();

        JSONObject responseJson = new JSONObject(responseBody);

        System.out.println("Response Body : \n" + responseBody);
    }
}
