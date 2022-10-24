import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        //输出1-100之间不能被5整除的数，每五个一行
        int count = 0;
        for (int i =1; i <= 100; i++) {
            if (i % 5 != 0) {
                count++;
                System.out.print(i + " ");
                //每五个输出一次换行
                if (count % 5 == 0){
                    System.out.println();
                }
            }
        }
        //输出小写的a-z以及大写的Z-A
        for (char c1 = 'a'; c1 <= 'z'; c1++){
            System.out.println(c1 + " ");
        }
        System.out.println("==========");
        for (char c2 = 'Z'; c2 >= 'A'; c2--){
            System.out.println(c2 + " ");
        }
    }
}
