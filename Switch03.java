import java.util.Scanner;

public class Switch03 {
    //输入学生成绩，60以上及格，以下不及格，不能超过100
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("输入学生成绩");
        double score = myScanner.nextDouble();
        if (score >= 0 && score <= 100) {
            switch ((int) (score / 60)) {
                case 0:
                    System.out.println("不及格");
                    break;
                case 1:
                    System.out.println("及格");
                    break;
            }
        } else {
            System.out.println("输入超出范围");
        }
    }
}
