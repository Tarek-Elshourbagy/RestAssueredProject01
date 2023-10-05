package PAGES;

import POGO.PG02_SearchForBookName;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.Arrays;
import java.util.List;

public class P02_SearchForBookName {
    public List<PG02_SearchForBookName> Req02_SearchForBookName(String authorName) {
        RestAssured.baseURI = "http://216.10.245.166";
        String endpoint = "/Library/GetBook.php";

        Response response = RestAssured.given()
                .queryParam("AuthorName", authorName)
                .get(endpoint);

        response.then().assertThat().statusCode(200);

        PG02_SearchForBookName[] parsedResponse = response.getBody().as(PG02_SearchForBookName[].class);
        return Arrays.asList(parsedResponse);
    }
}
