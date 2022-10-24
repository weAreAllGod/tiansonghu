import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        //实现判断一个数是不是水仙花数，所谓水仙花数是指一个三位数，各个位上数字立方和等于其本身
        Scanner myScanner = new Scanner(System.in);
        System.out.println("输入一个三位整数");
        int num = myScanner.nextInt();
        int num1 = num /100;//获取百位
        int num2 = num % 100 / 10;//获取十位
        int num3 = num % 10;//获取个位
        if (num1 * num1 * num1 + num2 * num2 * num2 + num3 * num3 * num3 == num) {
            System.out.println("是水仙花数");
        }else {
            System.out.println("不是水仙花数");
        }
    }
}
