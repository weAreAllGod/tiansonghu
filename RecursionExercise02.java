import java.util.Scanner;

public class RecursionExercise02 {
    public static void main(String[] args) {
        //一堆桃子，猴子第一天吃一半，再多吃一个以后每天都是吃一半+1个
        //第十天想再吃，即还没吃，发现就一个桃子了，问最初是多少个
        //规律就是前一天的桃子=（后一天的桃子+1）* 2
        T t1 = new T();
        int day = 1;
        int peachNum = t1.peach(day);
        if (peachNum != -1) {
            System.out.println("第" + day + "天有" + peachNum + "个桃子");
        }
    }
}
class T {
    public  int peach(int day) {
        if (day == 10) {
            return 1;
        } else if (day >=1 && day <= 9) {
            return (peach(day + 1) + 1) * 2;
        } else {
            System.out.println("输入天数不在范围内");
            return -1;
        }
    }
}