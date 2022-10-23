import java.util.Scanner;

public class Stars {
    public static void main(String[] args) {
        //打印空心金字塔
        //改成变量，更灵活
        int cengshu = 6;
        for (int i = 1; i <= cengshu; i++){
            //总层数-当前层个空格
            for (int k = 1; k <= cengshu - i; k++){
                System.out.print(" ");
            }
            //打印每层的*
            for (int j = 1; j <= 2 * i - 1; j++){
                //只输出第一个，最后一个，其他的都是输出空格,最后一层全部输出
                if (j == 1 || j == 2 * i - 1 ||i == cengshu){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
