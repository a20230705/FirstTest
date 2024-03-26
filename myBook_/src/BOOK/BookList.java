package BOOK;

//import BOOK.Book;  可以直接用Book这个类，因为他是public的

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:34398
 * Date:2024-03-23
 * Time:8:50
 */
public class BookList{

    private int sizeCur;
    private Book[] books=new Book[10];

public BookList(){
    books[0] = new Book("三国演义", "罗贯中", "小说", 12);
    books[1] = new Book("西游记", "吴承恩", "小说", 13);
    books[2] = new Book("红楼梦", "曹雪芹", "小说", 15);
    this.sizeCur = 3;
}


private int capcity=10;


    public int getCapcity() {
        return capcity;
    }

    public void setCapcity(int capcity) {
        this.capcity = capcity;
    }

    public int getSizeCur() {
        return sizeCur;
    }

    public void setSizeCur(int sizeCur) {
        this.sizeCur = sizeCur;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }
    public void setBook(int dex,Book book){
        this.books[dex]=book;
    }
}
