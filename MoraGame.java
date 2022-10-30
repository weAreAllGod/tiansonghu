import java.util.Random;
import java.util.Scanner;

public class MoraGame {
    //出拳游戏:0表示石头,1表示剪刀,2表示布
    //   接收Tom输入的拳  并输出 ,然后电脑随机产生一个数 对比输赢
    //   请Tom出拳(0表示石头,1表示剪刀,2表示布)
    public static void main(String[] args) {
        //创建一个玩家对象
        Tom t = new Tom();
        //记录输赢次数
        int isWinCount = 0;
        //创建二维数组，接收局数，双方出拳情况
        int arr1[][] = new int[3][3];
        int j = 0;
        //创建一维数组，接收输赢情况
        String arr2[] = new String[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0;i < 3;i++) {
            //获取玩家出拳
            System.out.println("请输入你要出的0表示石头,1表示剪刀,2表示布：");
            int num = scanner.nextInt();
            t.setTomGuessNum(num);
            int tomGuess = t.getTomGuessNum();
            arr1[i][j+1] = tomGuess;
            //获取电脑出拳
            int comGuess = t.computerNum();
            arr1[i][j+2] = comGuess;
            //将出拳结果对比
            String isWin = t.vsComputer();
            arr2[i] = isWin;
            arr1[i][j] = t.count;
            //对每一局结果进行输出
            System.out.println("==============================");
            System.out.println("局数\t玩家的出拳\t电脑的出拳\t输赢情况");
            System.out.println(t.count + "\t" + tomGuess + "\t\t" + comGuess + "\t\t" +isWin);
            System.out.println("==============================");
            System.out.println("\n\n");
            isWinCount = t.winCount(isWin);
        }
        //对游戏最终结果进行输出
        System.out.println("局数\t玩家的出拳\t电脑的出拳\t输赢情况");
        for (int a = 0;a < arr1.length;a++) {
            for (int b = 0;b < arr1[a].length;b++) {
                System.out.println(arr1[a][b] + "\t\t\t");
            }
            System.out.print(arr2[a]);
            System.out.println();
        }
        System.out.println("你赢了" + isWinCount + "次");
    }
}
class Tom {
    //玩家出拳类型
    int tomGuessNum;
    //电脑出拳类型
    int comGuessNum;
    //玩家赢得次数
    int winCountNum;
    //比赛的次数
    int count = 1;

    public void showInfo() {

    }
    public int computerNum() {
        Random r = new Random();
        comGuessNum = r.nextInt(3);//返回0-2随机数
        return comGuessNum;
    }

    public void setTomGuessNum(int tomGuessNum) {
        if (tomGuessNum > 2 || tomGuessNum < 0) {
            System.out.println("数字输入错误");
        }
        this.tomGuessNum = tomGuessNum;
    }
    public int getTomGuessNum() {
        return tomGuessNum;
    }
    //比较猜拳结果
    public String vsComputer() {
        if (tomGuessNum == 0 && comGuessNum == 1) {
            return "你赢了";
        } else if (tomGuessNum == 1 && comGuessNum == 2) {
            return "你赢了";
        } else if (tomGuessNum == 2 && comGuessNum == 0) {
            return "你赢了";
        } else if (tomGuessNum == comGuessNum) {
            return "平局";
        } else {
            return "你输了";
        }
    }
    public int winCount(String s) {
        count++;
        if (s.equals("你赢了")) {
            winCountNum++;
        }
        return winCountNum;
    }
}