import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入一个字符a-g");
        char c1 = myScanner.next().charAt(0);
        switch(c1) {
            case 'a' :
                System.out.println("今天是周一");
                break;
            case 'b' :
                System.out.println("今天是周二");
                break;
            case 'c' :
                System.out.println("今天是周三");
                break;
            case 'd' :
                System.out.println("今天是周四");
                break;
            case 'e' :
                System.out.println("今天是周五");
                break;
            case 'f' :
                System.out.println("今天是周六");
                break;
            case 'g' :
                System.out.println("今天是周天");
                break;
            default:
                System.out.println("输入错误");
        }
        System.out.println("退出switch,继续执行");
    }
}
