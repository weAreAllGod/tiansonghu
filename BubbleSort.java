import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={15,72,95,4,5};
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = false;
                }
            }
            if (flag != false){
                break;
            }
            System.out.println("\n"+"第" + (i + 1) + "次排序");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + "\t");
            }
        }
    }
}