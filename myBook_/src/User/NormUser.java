package User;

import Operation.*;
import User.Users;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:34398
 * Date:2024-03-23
 * Time:9:45
 */
public class NormUser extends Users {
    public NormUser(String name) {
        super(name);

        this.ioperatios = new Ioperation[]{//这里发生了向下转型
                new ExitOpera(),
                new FindOpera(),
                new BorrowOpera(),
                new RetrunOpera()
        };

    }

    @Override
    public int menu() {
        System.out.println("******管理员菜单******");
        System.out.println("1.查找图书");
        System.out.println("2.借阅图书");
        System.out.println("3.归还图书");
        System.out.println("0.退出系统");
        System.out.println("*******************");
        System.out.println("请输入你的操作：");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
