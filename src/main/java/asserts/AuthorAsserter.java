package asserts;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import services.RestClient;
import utils.Author;

public class AuthorAsserter {
    public static final int STATUS_SUCCESS = 201;
    public static final String EXPECTED_BUT_FOUND = "Expected [%s], but found [%s]";

    public void createAuthorAsserter(Response response, Author expected){
        Assert.assertEquals(response.getStatusCode(), STATUS_SUCCESS);
        Author received = response.body().as(Author.class);
        Assert.assertEquals(received, expected, String.format(EXPECTED_BUT_FOUND,received,expected));
    }
    public void getAuthorAsserter(Response response, Author expected){
        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
        Author received = response.body().as(Author.class);
        Assert.assertEquals(received,expected,
                String.format(EXPECTED_BUT_FOUND, expected, received));
    }

    public void deleteAuthorAsserter(Response response){
        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_NO_CONTENT,
                String.format(EXPECTED_BUT_FOUND, response.getStatusCode(),HttpStatus.SC_NO_CONTENT));
    }

    public void updateAuthorAsserter(Response response, Author expected){
        Assert.assertEquals(response.getStatusCode(),HttpStatus.SC_OK);
        Author received = response.body().as(Author.class);
        Assert.assertEquals(received, expected, String.format(EXPECTED_BUT_FOUND, expected, received));
    }
    public void statusNotFoundAsserter(Response response) {
        int expected = HttpStatus.SC_NOT_FOUND;
        int received = response.statusCode();
        Assert.assertEquals(received, expected,
                String.format(EXPECTED_BUT_FOUND, received, received));
    }
}
