package rest.action;

import io.restassured.http.Header;
import io.restassured.response.Response;

import java.util.HashMap;

public class RestResponse implements IRestResponseAction {

    Response response;

    public RestResponse() {

    }

    @Override
    public void setResponse(Response response) {
        this.response = response;
    }

    @Override
    public int getResponseCode() {
        return this.response.getStatusCode();
    }

    @Override
    public String getResponseLine() {
        return this.response.getStatusLine();
    }


    @Override
    public HashMap getResponseHeaders() {
        HashMap<String, String> headers = new HashMap<>();
        for (Header header : this.response.getHeaders().asList()) {
            headers.put(header.getName(), header.getValue());
        }
        return headers;
    }

    @Override
    public String getResponseBody() {
        return this.response.getBody().asString();
    }

    @Override
    public String getPrettyResponseBody() {
        return this.response.getBody().asPrettyString();
    }
}
