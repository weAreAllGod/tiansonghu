import java.util.Scanner;
public class ifelse {

    public static void main(String[] args) {
        //声明两个double变量，第一个大于十，第二个小于二十，打印和
        double d1 = 15.2;
        double d2 = 2.3;
        if(d1 > 10.0 && d2 < 20.0) {
            System.out.println("两个数之和=" + (d1 + d2));
        }
        //声明两个变量int，判断和能被3，5整除不
        int n1 = 5;
        int n2 = 3;
        int sum = n1 + n2;
        if(sum % 3 == 0 && sum % 5 == 0){
            System.out.println("和可以被3，5整除");
        } else {
            System.out.println("和不可以被3，5整除");
        }
        //判断是不是闰年，被4整除，不能被100整除，能被400整除
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入年份");
        int year = myScanner.nextInt();
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
                System.out.println("是闰年");
        } else {
            System.out.println("不是闰年");
        }
    }
}