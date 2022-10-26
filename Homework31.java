import java.util.Scanner;
public class Homework31 {
    public static void main(String[] args) {
        //已知有个升序的数组，要求插入一个元素，该数组顺序仍然是升序
        int arr[] = {10,12,45,85,99,150};
        Scanner myScanner = new Scanner(System.in);
        int n = myScanner.nextInt();
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (n <= arr[i]) {
                index = i;
                break;
            }else {
                index = i+ arr.length;
                break;
            }
        }
        if (index == -1){
             index = args.length;
        }
        System.out.println("index=" + index);
        int arrNew[] = new int[arr.length + 1];
        for (int i = 0, j = 0; i < arrNew.length; i++){
            if ( i != index) {
                arrNew[i] = arr[j];
                j++;
            } else {
                arrNew[i] = n;
            }
        }
        arr = arrNew;
        System.out.println("=================");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}