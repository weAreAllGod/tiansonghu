import java.util.Scanner;
    public class ifelse01 {
        public static void main(String[] args) {
            //输入信用分，100信用极好，80-99，优秀；60-80一般；其他是不及格
            Scanner myScanner = new Scanner(System.in);
            System.out.println("请输入信用分");
            int score = myScanner.nextInt();
            if (score == 100) {
                System.out.println("信用极好");
            } else if (score > 80 && score <= 99) {
                System.out.println("信用优秀");
            } else if (score >= 60 && score <= 80) {
                System.out.println("信用一般");
            } else {
                System.out.println("信用不及格");
            }
        }
    }
