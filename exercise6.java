import java.util.Scanner;

public class exercise6 {
    public static void main(String[] args) {
        //求出1+(1+2)+(1+2+3)+(1+2+3+4)+……(1+2+3+……+100)的结果
        int sum = 0;
        for (int i = 1; i <= 100; i++){
            for (int j = 1; j <= i; j++){
                sum +=j;
            }
        }
        System.out.println("sum=" + sum);
        System.out.println("==================");
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 1; i <= 100; i++){
            sum1 += i;
            sum2 += sum1;
        }
        System.out.println("sum1=" + sum2);
    }
}
