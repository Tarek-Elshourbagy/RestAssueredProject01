package PAGES;

import POGO.PGO4_DeleteBook;
import io.restassured.RestAssured;
import io.restassured.parsing.Parser;

import java.lang.reflect.Type;

import static io.restassured.RestAssured.given;

public class P04_DeleteBook {
    public PGO4_DeleteBook DeleteBook04(String ID) {
        RestAssured.baseURI = "http://216.10.245.166";
        String endpoint = "/Library/DeleteBook.php";
        String payload = "{\"ID\":\"" + ID + "\"}";
        PGO4_DeleteBook response04 = RestAssured.given().log().all().header("Content-Type", "application/json")
                .body(payload)
                .expect().defaultParser(Parser.JSON)
                .when().post(endpoint)
                .as((Type) PGO4_DeleteBook.class);
        return response04;
    }
}
