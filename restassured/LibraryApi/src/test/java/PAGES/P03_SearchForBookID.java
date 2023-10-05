package PAGES;

import POGO.PG01_AddBookReposneBody;
import POGO.PG01_AddBookRequestBody;
import POGO.PG03_SearcHForBookIDResponseBody;
import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import static io.restassured.RestAssured.given;
public class P03_SearchForBookID {
    public PG03_SearcHForBookIDResponseBody Req03_searchForBookID(String ID){
        RestAssured.baseURI = "http://216.10.245.166";
        String Endpoint = "/Library/GetBook.php?ID+"+ID;
        PG03_SearcHForBookIDResponseBody Resbody3 = given().expect().defaultParser(Parser.JSON).
                when().get(Endpoint).as(PG03_SearcHForBookIDResponseBody.class);
        return Resbody3;
    }
}

