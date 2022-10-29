public class Homework07 {
    public static void main(String[] args) {
        //设计一个Dog类，有名字，颜色，年龄属性，定义show显示信息并创建对象测试
        Dog dog = new Dog("大黄","黄色",8);
        dog.show();
    }
}
class Dog{
    String name;
    String color;
    int age;
    public Dog(String name,String color,int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }
    public void show() {
        System.out.println(name + "\t" + color + "\t" + age);
    }
}