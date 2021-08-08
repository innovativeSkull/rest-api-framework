package RestAction;

import io.restassured.http.Method;

import java.util.HashMap;

public class RestActionBase {

    RestRequest request;
    RestResponse response;

    public RestActionBase() {
        request = new RestRequest();
        response = new RestResponse();
    }

    public void setBaseURI(Method restType, String baseURI) {
        this.request.setBaseURI(baseURI);
        this.request.setRequestType(restType);
    }

    public void setQueryParameter(String key, String value) {
        this.request.setQueryParameter(key, value);
    }

    public void setQueryParameters(HashMap<String, String> queryParamsMap) {
        for (String key : queryParamsMap.keySet()) {
            this.request.setQueryParameter(key, queryParamsMap.get(key));
        }
    }

    public void setHeaderParameter(String key, String value) {
        this.request.setHeaderParameter(key, value);
    }

    public void setHeaderParameters(HashMap<String, String> headerParamsMap) {
        for (String key : headerParamsMap.keySet()) {
            this.request.setHeaderParameter(key, headerParamsMap.get(key));
        }
    }

    public void setRequestBody(String payload) {
        this.request.setRequestBody(payload);
    }

    public void execute() {
        this.response.setResponse(this.request.execute());
    }

    public String getPrettyResponseBody() {
        return this.response.getPrettyResponseBody();
    }

    public int getStatusCode() {
        return this.response.getResponseCode();
    }
}
