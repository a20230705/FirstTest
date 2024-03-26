package Operation;

import BOOK.Book;
import BOOK.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:34398
 * Date:2024-03-23
 * Time:9:10
 */
public class DelOpera implements Ioperation {
    @Override
    public void work(BookList bookListist) {
        System.out.println("请输入要删除的书的书名：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Book[] books = bookListist.getBooks();
        int size = bookListist.getSizeCur();
        for (int i = 0; i < size; i++) {//先找
            if (books[i].getBname() == name) {
                if (i == size - 1) {//要删除的是最后一个
                    bookListist.setSizeCur(size - 1);

                } else{
                    for (int j = i; j <size-1 ; j++) {
                        books[j]=books[j+1];
                    }
                }

                System.out.println("删除成功！");
                return;
            }

        }
        System.out.println("没有找到要删除的书！");
        return;
    }
}
