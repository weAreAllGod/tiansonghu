public class ConstructorExercise {
    public static void main(String[] args) {
        //一个无参构造器，设置所有人年龄初始值18
        //第二个带名字和年龄两个参数的构造器
        Person p1 = new Person();
        System.out.println("p1name=" + p1.name + "age=" + p1.age);
        Person p2 = new Person("jack",56);
        System.out.println("p2name=" + p2.name + "age=" + p2.age);
    }
}
class Person {
    String name;//默认null
    int age;//默认0
    public Person() {
        age = 18;
    }
    public Person(String pname,int page) {
        name = pname;
        age = page;
    }
}
