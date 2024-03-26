package Operation;

import BOOK.BookList;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:34398
 * Date:2024-03-23
 * Time:9:36
 */
public class RetrunOpera implements Ioperation{
    @Override
    public void work(BookList bookListist) {
        System.out.println("归还书");
    }
}
