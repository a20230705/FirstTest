package User;

import Operation.*;
import User.Users;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:34398
 * Date:2024-03-23
 * Time:9:20
 */
public class Admin extends Users {
    public Admin(String name) {//管理员的名字
        super(name);
        this.ioperatios = new Ioperation[]{
                new ExitOpera(),
                new FindOpera(),
                new AddOper(),
                new DelOpera(),
                new ShowOpera(),
        };
    }

    @Override
    public int menu() {
        System.out.println("******管理员菜单******");
        System.out.println("1.查找图书");
        System.out.println("2.新增图书");
        System.out.println("3.删除图书");
        System.out.println("4.显示图书");
        System.out.println("0.退出系统");
        System.out.println("*******************");
        System.out.println("请输入你的操作：");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }


}
