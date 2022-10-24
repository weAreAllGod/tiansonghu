import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        //实现判断一个整数，属于哪个范围，大于0，小于0，等于0
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int  num = myScanner.nextInt();
        if (num > 0){
            System.out.println("你输入的数大于0");
        }else if (num < 0){
            System.out.println("你输入的数小于0");
        }else {
            System.out.println("你输入的数等于0");
        }
        //输入年份，判断是不是闰年
        System.out.println("输入一个年份");
        int year = myScanner.nextInt();
        if (year % 4 == 0 && year % 100 != 0 ){
            System.out.println("输入的是闰年");
        }else if (year % 400 == 0){
            System.out.println("输入的是闰年");
        }else {
            System.out.println("输入的不是闰年");
        }
    }
}
