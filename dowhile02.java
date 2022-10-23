import java.util.Scanner;

public class dowhile02 {
    public static void main(String[] args) {
        //如果不还钱，一直打，直到还钱为止
        Scanner myScanner = new Scanner(System.in);
        char answer = ' ';
        do {
            System.out.println("不还钱，使劲打");
            System.out.println("问还钱吗？y/n");
            answer = myScanner.next().charAt(0);
            System.out.println("他的回答是" + answer);
        }while (answer != 'y');
        System.out.println("拿到钱了，走人");
    }
}
