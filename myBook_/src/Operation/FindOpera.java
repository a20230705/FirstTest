package Operation;

import BOOK.Book;
import BOOK.BookList;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:34398
 * Date:2024-03-23
 * Time:8:58
 */
public class FindOpera implements Ioperation{//查找有没有书


    @Override
    public void work(BookList bookListist) {
        System.out.println("请输入要查找的书的书名：");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        Book[] books=bookListist.getBooks();
        int size=bookListist.getSizeCur();
        for (int i = 0; i <size ; i++) {
            if(books[i].getBname()==name){
                System.out.println("查找成功！");
                books[i].toString();
                return;
            }

        }

        System.out.println("没有查找到该书！");
        return;
    }
}
