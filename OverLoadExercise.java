public class OverLoadExercise {
    public static void main(String[] args) {
        //Methods定义三个重载方法并调用
        Methods me = new Methods();
        me.m(5);
        me.m(9,6);
        me.m("好");
        Methods me1 = new Methods();
        System.out.println(me1.max(8,9));
        System.out.println(me1.max(15.5,42.6));
        System.out.println(me1.max(1.5,2.6,9.5));
    }
}
class Methods{
    public void m(int i) {
        System.out.println("平方=" + (i * i));
    }
    public void m(int j,int n) {
        System.out.println("相乘=" + (j * n));
    }
    public void m(String str) {
        System.out.println("传入的=" + str);
    }
    //在Methods中定义三个重载方法max()，返回2个int最大值/返回2个double最大值/返回3个double最大值
    public int max(int i,int j) {
        return i > j ?i : j;
    }
    public double max(double i,double j) {
        return i > j ?i : j;
    }
    public double max(double i,double j,double n) {
        double max1 = i > j ?i : j;
        return max1 > n ? max1 : n;
    }
}
