import asserts.AuthorAsserter;
import io.restassured.response.Response;
import services.AuthorService;

public class DataForTests {
    protected AuthorService authorService = new AuthorService();
    protected AuthorAsserter authorAsserter = new AuthorAsserter();
    protected Response response;

}
