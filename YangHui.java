import java.util.Scanner;
public class YangHui {
    public static void main(String[] args) {
        //打印十行杨辉三角
        int yangHui[][] = new int[10][];
        for (int i = 0; i < yangHui.length; i++) {//遍历数组每个元素
            //给每个一维数组开辟空间
            yangHui[i] = new int[i+1];
            //给每个一维数组赋值
            for (int j = 0; j < yangHui[i].length; j++) {
                if (j == 0 || j == yangHui[i].length - 1) {
                    yangHui[i][j] = 1;
                } else  {
                    //中间的数等于上一行同列的和前一位的和
                    yangHui[i][j] = yangHui[i-1][j] + yangHui[i-1][j-1];
                }
            }
        }
        for (int i = 0; i < yangHui.length; i++) {
            for (int j = 0; j < yangHui[i].length; j++) {
                System.out.print(yangHui[i][j] + " ");
            }
            System.out.println();
        }
    }
}