package utils;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RestLogger {
    private static final Logger logger = LogManager.getLogger(RestLogger.class);

    private RestLogger() {
    }

    public static void logRequest(RequestSpecification request) {
        logger.info("\nREQUEST:\n" + request.log().everything());
    }

    public static void logResponse(Response response) {
        logger.info("\nRESPONSE:\n" +
                "status code : " + response.statusCode() + "\n" +
                "headers : " + response.getHeaders() + "\n" +
                "response body : " + "\n" + response.asPrettyString());
    }

}
