import java.util.Scanner;

public class RecursionExercise01 {
    public static void main(String[] args) {
        //递归的方法求出斐波那契数1.2，3，5，8，。。。给你一个整数n，求出它的值
        T t1 = new T();
        int n = 9;
        int res = t1.fb(n);
        if (res != -1) {
            System.out.println("当n="+ n + "斐波那契=" + res);
        }
    }
}
class  T {
    public  int fb(int n) {
        if (n >= 1) {
            if (n == 1 || n == 2) {
                return 1;
            } else {
                return fb(n - 1) + fb(n - 2);
            }
        } else {
            System.out.println("要求输入大于等于1的整数");
            return -1;
        }
    }
}