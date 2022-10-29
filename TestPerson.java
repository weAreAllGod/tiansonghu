public class TestPerson {
    public static void main(String[] args) {
        //定义person类，里面有name，age属性，并提供compareTo比较方法，
        //用于判断和另一个人是否相等，一样返回true,否则返回false
        Person p1 = new Person("jack",62);
        Person p2 = new Person("tom",65);
        System.out.println("比较结果是" + p1.compareTo(p2));
    }
}
class Person {
    String name;
    int age;
    public Person(String name,int age) {
        this.name = name;
        this.age = age;
    }
    public boolean compareTo(Person p) {
        if (this.name.equals(p.name) && this.age == p.age) {
            return true;
        } else {
            return false;
        }
        //return this.name.equals(p.name) && this.age == p.age;
    }
}