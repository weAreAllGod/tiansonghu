import java.util.Scanner;

public class MulFor01 {
    public static void main(String[] args) {
        //统计三个班成绩，一个班5人，求每个班平均分和所有班级平均分，统计三个班及格人数
        Scanner myScanner = new Scanner(System.in);
        double sumScore = 0;//所有人总成绩
        int num = 0;//及格人数
        for (int j = 1; j <= 3; j++ ) {
            double sum = 0;
            for (int i = 1; i <= 5; i++) {
                System.out.println("请输入第"+j+"个班第" + i + "个学生的成绩");
                double score = myScanner.nextDouble();
                if (score >= 60) {
                    num++;
                }
                sum += score;
                System.out.println("成绩为" + score);
            }
            System.out.println("第"+j+"个班级总分是" + sum);
            System.out.println("第"+j+"个班级平均分是" + (sum / 5));
            sumScore += sum;
            System.out.println("总共及格人数" + num);
        }
        System.out.println("三个班总分=" + sumScore + "总平均分=" + sumScore / 15);
    }
}
