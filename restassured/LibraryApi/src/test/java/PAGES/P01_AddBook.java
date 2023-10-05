package PAGES;

import POGO.PG01_AddBookReposneBody;
import POGO.PG01_AddBookRequestBody;
import io.restassured.RestAssured;
import io.restassured.parsing.Parser;

import static io.restassured.RestAssured.given;

public class P01_AddBook {
    public PG01_AddBookReposneBody Req01_AddBook(PG01_AddBookRequestBody reqData){
        RestAssured.baseURI = "http://216.10.245.166";
        String Endpoint ="Library/Addbook.php";
        PG01_AddBookReposneBody Resbody1 = given().log().all().header("Content-Type", "application/json")
                .body(reqData).expect().defaultParser(Parser.JSON)
                .when().post(Endpoint).as(PG01_AddBookReposneBody.class);
        return Resbody1 ;
    }
}
