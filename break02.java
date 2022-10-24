import java.util.Scanner;

public class break02 {
    public static void main(String[] args) {
        //实现登录验证，有三次机会，如果用户名为丁真，密码666，提示登录成功，否则提示还有几次机会
        Scanner myScanner = new Scanner(System.in);
        String name = "";
        String passwd = "";
        int chance = 3;
        for (int i = 1; i <= 3; i++){
            System.out.println("输入名字");
            name = myScanner.next();
            System.out.println("输入密码");
            passwd = myScanner.next();
            //开始比较是否输入正确
            //字符串比较使用的是String里的equals方法
            if ("丁真".equals(name) && "666".equals(passwd)) {
                System.out.println("登录成功");
                break;
            }
            //登录失败，机会减一
            chance--;
            System.out.println("还有" + chance + "次机会");
        }
    }
}
