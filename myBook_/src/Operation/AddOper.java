package Operation;

import BOOK.BookList;
import BOOK.Book;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:34398
 * Date:2024-03-23
 * Time:9:23
 */
public class AddOper implements Ioperation {
    @Override
    public void work(BookList bookList) {
        if (bookList.getCapcity() == bookList.getSizeCur() + 1) {
            System.out.println("书架已满，不能新增了！");
        } else {

            System.out.println("请输入新曾图书的名字：");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();

            System.out.println("请输入书的作者：");
            String author = scanner.nextLine();

            System.out.println("请输入书的类型：");
            String type = scanner.nextLine();

            System.out.println("请输入书的价格：");
            int price = scanner.nextInt();

            Book book = new Book(name, author, type, price);

            //当前空的下标
            int curSize = bookList.getSizeCur();

            bookList.setBook(curSize, book);

            bookList.setSizeCur(curSize + 1);

        }
        return;
    }
}
