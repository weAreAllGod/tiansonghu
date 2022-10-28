import java.util.Scanner;

public class MiGong {
    public static void main(String[] args) {
        //老鼠出迷宫
        //先创建迷宫，用二维数组表示，0可以走，1障碍物
        int map[][] = new int[8][7];
        //将最上面一行，最下面一行设为1
        for (int i = 0; i < 7; i++){
            map[0][i] = 1;
            map[7][i] = 1;
        }
        //最右边和最左边一列设置为1
        for (int i = 0; i < 8; i++) {
            map[i][0] = 1;
            map[i][6] = 1;
        }
        map[3][1] = 1;
        map[3][2] = 1;
        map[2][2] = 1;//测试回溯
        System.out.println("\n=========初始地图情况如下======");
        for (int i = 0;i < map.length; i++){
            for (int j = 0; j <map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        T t1 = new T();
        t1.findWay(map,1,1);
        System.out.println("\n=========找路的情况如下======");
        for (int i = 0;i < map.length; i++){
            for (int j = 0; j <map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}
class T {
    //递归回溯解决老鼠出迷宫
    //找到就返回true，没有就是false
    //map数组表示迷宫，i，j表示老鼠初始位置
    //先规定map数组中值的含义，0可以走，1障碍物。2可以走，3走过，死路
    //当map[6][5] = 2，表明走通了可以退出，否则继续
    //确定找路的策略，下右上左
    public boolean findWay(int map[][],int i,int j) {
        if (map[6][5] == 2) {
            return true;
        } else {
            if (map[i][j] == 0) {//当前位置为0，表示可以走，还没探测走过
                //假定可以走通
                map[i][j] = 2;
                //使用探测策略，确定该位置是否可以走通
                if (findWay(map, i + 1,j)) {//先走下
                    return true;
                } else if (findWay(map,i,j + 1)) {//右
                    return true;
                } else if (findWay(map,i - 1,j)) {//上
                    return true;
                } else if (findWay(map,i,j - 1)) {//左
                    return true;
                } else {
                    map[i][j] = 3;
                    return false;
                }
            } else {//map[i][j] =1,2,3
                return false;
            }
        }
    }
}