import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        //创建一个char类型26个元素的数组，分别放置A-Z，for循环打印出来
        char chars[] = new char[26];
        for (int i = 0; i < chars.length; i++){
            chars[i] = (char)('A' + i);
        }
        System.out.println("=============");
        for (int i = 0; i < chars.length; i++){
            System.out.print(chars[i] + " ");
        }
        //求出最大值，并得到对应下标
        int arr[] = {4,-1,92,10,23};
        int max = arr[0];
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++){
            if (max < arr[i]) {
                max = arr[i];
                maxIndex = i;
            }
        }
        System.out.println("最大值是" + max + "下标为" + maxIndex);
    }
}
