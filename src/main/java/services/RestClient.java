package services;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utils.RestLogger;

public class RestClient {
    private RestClient() {
    }

    public static Response post(RequestSpecification request) {
        RestLogger.logRequest(request);
        Response response = request.post();
        RestLogger.logResponse(response);
        return response;
    }

    public static Response get(RequestSpecification request) {
        RestLogger.logRequest(request);
        Response response = request.get();
        RestLogger.logResponse(response);
        return response;
    }

    public static Response delete(RequestSpecification request) {
        RestLogger.logRequest(request);
        Response response = request.delete();
        RestLogger.logResponse(response);
        return response;
    }

    public static Response put(RequestSpecification request) {
        RestLogger.logRequest(request);
        Response response = request.put();
        RestLogger.logResponse(response);
        return response;
    }
}
