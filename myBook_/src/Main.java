/**
 * Created with IntelliJ IDEA
 * Description:
 * User:34398
 * Date:2024-03-23
 * Time:8:39
 */


import BOOK.BookList;
import User.Admin;
import User.NormUser;
import User.Users;

import java.util.Scanner;


public class Main {


    public static Users login() {
        System.out.println("欢迎来到图书管理系统!");
        System.out.println("请输入你的名字：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("请输入你的身份：1,管理员  2，普通用户");

        int choice = scanner.nextInt();
        if (choice == 1) {
            Admin adminUser = new Admin(name);
            return adminUser;
        } else {
            NormUser normUser = new NormUser(name);
            return normUser;
        }

    }

    public static void main(String[] args) {
        BookList bookList = new BookList();
        Users users = login();
        while (true) {
            int choice = users.menu();
            users.doWork(choice, bookList);
        }

    }


}
