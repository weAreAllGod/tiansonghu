public class Homework06 {
    public static void main(String[] args) {
        //编写一个Cale计算类，在其中定义两个变量表示两个操作数
        //定义4个方法实现加减乘除，除数为0要提示，并创建两个对象。分别测试
        Cale cale = new Cale(8,0);
        System.out.println("和=" + cale.jia());
        System.out.println("减=" + cale.jian());
        System.out.println("乘积=" + cale.cheng());
        Double chures = cale.chu();
        if (chures != null) {
            System.out.println("商=" + cale.chu());
        }
    }
}
class Cale {
    double num1;
    double num2;
    public Cale(double num1,double num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public double jia() {
        return num1 + num2;
    }
    public double jian() {
        return num1 - num2;
    }
    public double cheng() {
        return num1 - num2;
    }
    public Double chu() {
        if (num2 == 0) {
            System.out.println("分母不能为0");
            return null;
        } else {
            return num1 / num2;
        }
    }
}