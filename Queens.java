public class Queens {
    public static void main(String[] args) {
        Enight et = new Enight();
        et.find(0);
        System.out.println("八皇后问题共有："+et.count+"种可能");
    }
}
class Enight{
    int count = 0;//村结果
    int map[][] = new int[8][8];//棋盘，放皇后
    public boolean findWay(int map[][],int i,int j) {
        for (int n = 0;n < 8;n++) {//行列冲突
            if (map[n][j] == 1) {
                return false;
            }
        }
        for (int n = i-1,m=j-1;n >= 0 && m >= 0;n--,m--) {//左对角线
            if (map[n][m] == 1) {
                return false;
            }
        }
        for (int n = i-1,m=j+1;n >= 0 && m <= 7;n--,m++) {//右对角线
            if (map[n][m] == 1) {
                return false;
            }
        }
        return true;
    }
    public void find(int i){//寻找皇后节点
        if (i > 7){
            count++;
            print();
            return;
        }
        for (int m = 0;m < 8;m++) {
            if (findWay(map,i,m)) {
                map[i][m] = 1;
                find(i + 1);
                map[i][m] = 0;
            }
        }
    }
    public void print(){//打印结果
        System.out.print("方案"+count+":");
        for(int i=0;i<8;i++){
            for(int m=0;m<8;m++){
                if(map[i][m]==1){
                    System.out.print("皇后"+(i+1)+"在第"+i+"行，第"+m+"列\t");

                }
            }
        }
        System.out.println();
    }
}