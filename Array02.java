import java.util.Scanner;
public class Array02 {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        Scanner myScanner = new Scanner(System.in);
        do{
            int arr2[] = new int[arr1.length - 1];
            for (int i = 0; i<arr1.length - 1; i++ ) {
                arr2[i] = arr1[i];
            }
            arr1 = arr2;
            for (int i = 0; i < arr1.length; i++) {
                System.out.println(arr1[i]+"\t");
            }
            System.out.println("是否继续缩减元素y/n");
            char key = myScanner.next().charAt(0);
            if (key == 'n') {
                System.out.println("退出删除程序！");
                break;
            }else if (arr1.length == 1) {
                System.out.println("已经是最后一个元素，无法删除！");
                break;
            }
        }while(true);
    }
}