import PAGES.*;
import POGO.PG01_AddBookReposneBody;
import POGO.PG02_SearchForBookName;
import POGO.PG03_SearcHForBookIDResponseBody;
import POGO.PGO4_DeleteBook;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TEST {
    P01_AddBook p1 = new P01_AddBook();

    P02_SearchForBookName p2 = new P02_SearchForBookName();
    P03_SearchForBookID p3 = new P03_SearchForBookID();
    P04_DeleteBook p4 = new P04_DeleteBook();
    PayLoad payload = new PayLoad();
    String name = "tarek";
    String ID = "1005";
    @Test
    public void T01_addbook() {
        PG01_AddBookReposneBody ResponseBody01 = p1.Req01_AddBook(payload.addbookpayload("ccc", ID, name, "ahmed"));
        Assert.assertEquals(ResponseBody01.getID(),"ccc"+"1005");
        ID = ResponseBody01.getID();
    }
    @Test
    public void T02_SearchForBookName() {
        List<PG02_SearchForBookName> responseBody02 = p2.Req02_SearchForBookName(name);
        System.out.println(responseBody02);
    }
    @Test
    public void T03_SearchForBookID(){
        PG03_SearcHForBookIDResponseBody responseBody03 = p3.Req03_searchForBookID(ID);
        System.out.println(responseBody03);
    }
    @Test
    public void T04_DeleteBook(){
        PGO4_DeleteBook responseBody04 = p4.DeleteBook04(ID);
        System.out.println(responseBody04);
    }


}
