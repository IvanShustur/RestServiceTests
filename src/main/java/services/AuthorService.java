package services;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import tools.PropertiesManager;
import utils.Author;

public class AuthorService {
    public Response getAuthor(Long authorId) {
        RequestSpecification request = RestAssured.given()
                .accept(ContentType.JSON)
                .basePath("/author/" + authorId);
        return RestClient.get(request);
    }
    public Response createAuthor(Author author) {
        RestAssured.baseURI = "http://localhost:8080/api/library";
        RequestSpecification request = RestAssured.given()
                .body(author)
                .contentType(ContentType.JSON)
                .basePath("/author");
        return RestClient.post(request);
    }
    public Response deleteAuthor (Long authorId){
        RequestSpecification request = RestAssured.given()
                .accept(ContentType.JSON)
                .basePath("/author/" +authorId);
        return RestClient.delete(request);
    }
    public Response updateAuthor(Author author) {
        RestAssured.baseURI = "http://localhost:8080/api/library";
        RequestSpecification request = RestAssured.given()
                .body(author)
                .contentType(ContentType.JSON)
                .basePath("/author");
        return RestClient.put(request);
    }

}
