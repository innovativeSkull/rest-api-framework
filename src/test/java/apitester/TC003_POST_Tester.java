package apitester;

import org.json.JSONException;
import org.testng.annotations.Test;
import test.activity.post.RegisterCustomer;

public class TC003_POST_Tester {

    RegisterCustomer customer = new RegisterCustomer();

    @Test
    public void registerCustomer() throws JSONException {
        // customer.registerCustomer("John", "Watson", "john.23", "admin", "john@customer.com");
        customer.createUser("Frank", " Test Engineer");
    }
}
