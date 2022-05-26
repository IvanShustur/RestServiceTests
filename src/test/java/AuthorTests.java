import asserts.AuthorAsserter;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.http.HttpStatus;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import services.AuthorService;
import tools.PropertiesManager;
import utils.Author;
import utils.FileManager;
import utils.RestLogger;


public class AuthorTests extends DataForTests{

    @Test(description = "Create author test case")
    public void createAuthorTest() {
      response = authorService.createAuthor(FileManager.getValidAuthor());
      authorAsserter.createAuthorAsserter(response, FileManager.getValidAuthor());


    }
    @Test(description = "Get author test case")
    public void getAuthorTest(){
        Author author =  FileManager.getValidAuthor();
        authorService.createAuthor(author);
        response = authorService.getAuthor(FileManager.getValidAuthor().getAuthorId());
        authorAsserter.getAuthorAsserter(response, FileManager.getValidAuthor());
    }

    @Test(description = "Update author test case")
    public void updateAuthorTest() {
        authorService.createAuthor(FileManager.getValidAuthor()).then()
                .assertThat().statusCode(HttpStatus.SC_CREATED);
        response = authorService.updateAuthor(FileManager.getUpdatedAuthor());
        authorAsserter.updateAuthorAsserter(response, FileManager.getUpdatedAuthor());
    }

    @Test(description = "Delete author request")
    public void deleteAuthor() {
        Author author = FileManager.getValidAuthor();
       authorService.createAuthor(author).then()
               .assertThat().statusCode(HttpStatus.SC_CREATED);
       response = authorService.deleteAuthor(FileManager.getValidAuthor().getAuthorId());
       authorAsserter.deleteAuthorAsserter(response);
    }

    @Test(description = "Get author if doesn't exist test case")
    public void getAuthorThatDoesNotExistTestCase() {
        response = authorService.getAuthor(FileManager.getValidAuthor().getAuthorId());
        authorAsserter.statusNotFoundAsserter(response);
    }

    @AfterMethod(description = "Delete test data")
    public void clearData() {
        authorService.deleteAuthor(FileManager.getValidAuthor().getAuthorId());

    }
}
