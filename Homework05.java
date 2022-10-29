public class Homework05 {
    public static void main(String[] args) {
        //定义一个圆类Circle,定义属性半径，提供面积和周长方法
        Cricle cricle = new Cricle(6);
        System.out.println("面积=" + cricle.area());
        System.out.println("周长=" + cricle.length());
    }
}
class Cricle{
    double r;
    public Cricle(double r) {
        this.r = r;
    }
    public double area() {
        return 3.14 * r * r;
    }
    public double length() {
        return 3.14 * 2 * r;
    }
}