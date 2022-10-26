import java.util.Scanner;
public class Homework32 {
    public static void main(String[] args) {
        //随机生成十个整数（1-100的范围）保存到数组，
        // 并倒叙打印以及求平均值，最大值和下标，并查找里面是否有8
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 100) + 1;
        }
        System.out.println("======================");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("==============");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + "\t");
        }
        //平均值，最大值和下标
        double sum = arr[0];
        int max = arr[0];
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];//累计求和
            if (max < arr[i]) {//遍历求最大值
                max = arr[i];
                maxIndex = i;
            }
        }
        System.out.println("\nmax=" + max + " maxIndex=" + maxIndex);
        System.out.println("\n平均值=" + (sum / arr.length));
        //查找是否有8
        int findNum = 8;
        int index = -1;
        for(int i = 0; i < arr.length; i++) {
            if (findNum == arr[i]) {
                System.out.println("找到了" + findNum + "下标=" + i);
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("没找到" + findNum);
        }
    }
}