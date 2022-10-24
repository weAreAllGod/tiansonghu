import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        //某人有十万元，每经过一个路口，需要缴费，用while break
        //现金大于五万，每次交5%，小于等于五万，每次交1000，算经过几次路口
        double money = 100000;
        int count = 0;
        while (true) {
            if (money > 50000) {
                money *= 0.95;
                count++;
            }else if (money >= 1000) {
                money -= 1000;
                count++;
            }else {
                break;
            }
        }
        System.out.println("能过" + count + "次路口");
    }
}
