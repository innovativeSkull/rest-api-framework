package RestAction;

import io.restassured.response.Response;

import java.lang.invoke.MethodType;
import java.util.HashMap;

public interface IRestResponseAction {

    public void setResponse(Response response);

    public int getResponseCode();

    public String getResponseLine();

    public HashMap getResponseHeaders();

    public String getResponseBody();

    public String getPrettyResponseBody();
}
