public class Homework09 {
    public static void main(String[] args) {
        //创建一个Employee类，属性有名字name，性别sex，年龄age，职位job，
        // 薪水salary，提供三个构造方法，
        //可以初始化名字性格年龄职位薪水，名字性别年龄，职位薪水
    }
}
class Employee {
    String name;
    char sex;
    int age;
    String job;
    double salary;
    public Employee(String name,char sex,int age,String job,double salary) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.job = job;
        this.salary = salary;
    }
    public Employee(String name,char sex,int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    public Employee(String job,double salary) {
        this.job = job;
        this.salary = salary;
    }
//    public Employee(String name,char sex,int age,String job,double salary) {
//        this(name, sex, age);
//        this.job = job;
//        this.salary = salary;
//    }
}