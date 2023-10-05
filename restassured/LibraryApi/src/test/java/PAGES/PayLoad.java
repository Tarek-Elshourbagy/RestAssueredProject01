package PAGES;

import POGO.PG01_AddBookRequestBody;

public class PayLoad {
    PG01_AddBookRequestBody reqdata01 = new PG01_AddBookRequestBody();
    public PG01_AddBookRequestBody addbookpayload(String isbn , String aisle, String name, String author){
        reqdata01.setIsbn(isbn);
        reqdata01.setAisle(aisle);
        reqdata01.setName(name);
        reqdata01.setAuthor(author);
        return reqdata01;
    }
}
