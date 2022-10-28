public class HanoiTower {
    public static void main(String[] args) {

        Tower tower = new Tower();
        tower.move(5,'A','B','C');
    }
}
class Tower {
    //num表示要移动的个数
    public void move(int num, char a,char b,char c) {
        //如果就一个盘
        if (num == 1) {
            System.out.println(a + "->" + c);
        } else {
            //多个盘，看作两个盘，最下面和上面所有的盘(num-1)
            //先移动上面所有的盘到吧，借助c
            move(num - 1,a,c,b);
            //把最下面的盘移动到c
            System.out.println(a + "->" + c);
            //再把b的所有盘移动到c,借助a
            move (num - 1,b,a,c);
        }
    }
}