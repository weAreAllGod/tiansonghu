import java.util.Scanner;

public class Switch02 {
    //输入a-e转换成大写
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("输入小写a-e");
        char c1 = myScanner.next().charAt(0);
        switch (c1) {
            case  'a' :
                System.out.println("A");
                break;
            case  'b' :
                System.out.println("B");
                break;
            case  'c' :
                System.out.println("C");
                break;
            case  'd' :
                System.out.println("D");
                break;
            case  'e' :
                System.out.println("E");
                break;
            default:
                System.out.println("输入不符合要求");
        }
    }
}
