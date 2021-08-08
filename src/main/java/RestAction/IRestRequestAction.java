package RestAction;

import io.restassured.http.Method;
import io.restassured.response.Response;

public interface IRestRequestAction {

    public void setBaseURI(String baseUri);

    public void setQueryParameter(String key, String value);

    public void setHeaderParameter(String key, String value);

    public void setRequestBody(String payload);

    public void setRequestType(Method method);

    public Response execute();

}
