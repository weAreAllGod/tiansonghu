public class Homework04 {
    public static void main(String[] args) {
        //编写圆类Circle,定义属性：半径，提供显示圆周长，面积方法
        Circle c = new Circle(6);
        System.out.println("面积=" + c.area());
        System.out.println("周长=" + c.perimeter());
    }
}
class Circle {
    double radius;//半径
    public Circle(double radius) {
        this.radius = radius;
    }
    public double area() {
        return 3.14 * radius * radius;
    }
    public double perimeter() {
        return 3.14 * 2 * radius;
    }
}