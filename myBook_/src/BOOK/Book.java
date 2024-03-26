package BOOK;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:34398
 * Date:2024-03-23
 * Time:8:47
 */
public class Book {
    private String Bname;
    private String author;
    private String type;
    private boolean lean;
    private int price;

    public Book(String bname, String author, String type, int price) {
        Bname = bname;
        this.author = author;
        this.type = type;
        this.price = price;
    }

    public String getBname() {
        return Bname;
    }

    public void setBname(String bname) {
        Bname = bname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setLean(boolean lean) {
        this.lean = lean;
    }

    @Override
    public String toString() {
        return "Book{" +
                "书名='" + Bname + '\'' +
                ", 作者='" + author + '\'' +
                ", 类型='" + type + '\'' +
                ", 价格=" + price +
                '}';
    }
}
