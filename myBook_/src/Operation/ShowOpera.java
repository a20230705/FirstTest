package Operation;

import BOOK.BookList;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:34398
 * Date:2024-03-23
 * Time:9:35
 */
public class ShowOpera implements Ioperation{
    @Override
    public void work(BookList bookListist) {
        System.out.println("显示书");
    }
}
