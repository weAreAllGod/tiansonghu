import java.util.Scanner;
public class ifelse02 {
    public static void main(String[] args) {
        //初赛成绩大于8.0进决赛，不然淘汰，根据性别分男女组
        Scanner myScanner = new Scanner(System.in);
        System.out.println("输入成绩");
        double  score = myScanner.nextDouble();
        if (score > 8.0) {
            System.out.println("请输入性别");
            char sex = myScanner.next().charAt(0);
            if (sex == '女') {
                System.out.println("女子组");
            } else if(sex == '男'){
                System.out.println("男子组");
            } else {
                System.out.println("输入错误");
            }
        } else {
            System.out.println("淘汰");
        }
    }
}
