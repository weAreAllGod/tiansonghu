public class Homework10 {
    public static void main(String[] args) {
        //定义一个Circle类，包含一个double型的radius属性代表圆的半径，findArea()方法返回圆的面积
        //定义一个类PassObject,在类中定义一个方法printAreas()
        //方法定义如下：public void printAreas(Cricle c,int times)
        //在printAreas方法中输出1到times之间每个整数半径值，以及对应面积
        //在main方法中调用printAreas()方法，调用完毕输出结果
        Circle circle = new Circle(6.0);
        PassObject passObject = new PassObject();
        passObject.printAreas(circle,5);
    }
}
class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double findArea() {
        return 3.14 * radius * radius;
    }
}
class PassObject {
    public void printAreas(Circle c, int times) {
        for (int i = 1; i <= times; i++) {
            c.radius = i;
            System.out.println(i + "\t" + c.findArea());
        }
    }
}