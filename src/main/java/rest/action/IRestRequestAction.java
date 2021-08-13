package rest.action;

import io.restassured.http.Method;
import io.restassured.response.Response;

public interface IRestRequestAction {

    void setBaseURI(String baseUri);

    void setPathParameter(String key, String value);

    void setQueryParameter(String key, String value);

    void setHeaderParameter(String key, String value);

    void setRequestBody(String payload);

    void setRequestType(Method method);

    Response execute();

}
