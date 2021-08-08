package test.activity.post;

import io.restassured.http.Method;
import org.json.JSONException;
import org.json.JSONObject;
import org.testng.Assert;
import rest.action.RestActionBase;

public class RegisterCustomer {

    public void registerCustomer(String firstName, String lastName, String userName, String password, String email) throws JSONException {

        // Temporary static payload is generated
        // TODO - Logic to generate payload dynamically
        JSONObject payload = new JSONObject();
        payload.put("FirstName", firstName);
        payload.put("LastName", lastName);
        payload.put("UserName", userName);
        payload.put("Password", password);
        payload.put("Email", email);

        RestActionBase customer = new RestActionBase();
        customer.setBaseURI(Method.POST, "https://restapi.demoqa.com/customer/register");
        customer.setHeaderParameter("Content-Type", "application/json");
        customer.setRequestBody(payload.toString());
        customer.execute();

        System.out.println("Registered : \n " + customer.getPrettyResponseBody());

        Assert.assertEquals(customer.getStatusCode(), 201);
    }

    public void createUser(String userName, String job) throws JSONException {

        JSONObject payload = new JSONObject();
        payload.put("name",userName);
        payload.put("job",job);

        RestActionBase user = new RestActionBase();
        user.setBaseURI(Method.POST, "https://reqres.in/api/users");
        user.setHeaderParameter("Content-Type","application/json");
        user.setRequestBody(payload.toString());
        user.execute();

        System.out.println("user Created : \n " + user.getPrettyResponseBody());

        Assert.assertEquals(user.getStatusCode(), 201);
    }
}
