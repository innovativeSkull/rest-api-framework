package RestAction;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class RestRequest implements IRestRequestAction {

    private Method restMethod = null;
    private RequestSpecification requestSpecification;

    @Override
    public void setBaseURI(String baseURI) {
        RestAssured.baseURI = baseURI;
        this.requestSpecification = RestAssured.given();
    }

    @Override
    public void setQueryParameter(String key, String value) {
        requestSpecification = requestSpecification.queryParam(key, value);
    }

    @Override
    public void setHeaderParameter(String key, String value) {
        requestSpecification = requestSpecification.header(key, value);
    }

    @Override
    public void setRequestBody(String payload) {
        requestSpecification = requestSpecification.body(payload);
    }

    @Override
    public void setRequestType(Method method) {
        this.restMethod = method;
    }

    @Override
    public Response execute() {
        return requestSpecification.request(this.restMethod);
    }
}
