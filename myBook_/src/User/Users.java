package User;

import BOOK.Book;
import BOOK.BookList;
import Operation.Ioperation;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:34398
 * Date:2024-03-23
 * Time:9:18
 */
public abstract class Users {
    protected String name;
    protected Ioperation[] ioperatios;//定义一个接口数组等一下用（多态）

    public Users(String name) {
        this.name = name;
    }

    public abstract int menu();

    //抽象方法可以有具体方法
    public void doWork(int choice, BookList bookList) {
        this.ioperatios[choice].work(bookList);
    }
}
