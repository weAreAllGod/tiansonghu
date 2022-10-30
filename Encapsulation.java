import java.util.Scanner;

public class Encapsulation {

    public static void main(String[] args) {
        //不能随便查看人的年龄，工资等隐私，并对设置的年龄进行合理性验证，合理就设置，否则给默认
        //年龄在1-120之间，年龄工资不能直接看，name长度在2-6之间
        Person person = new Person();
        person.name = "jack";
        person.setAge(65);
        person.setSalary(6000);
        person.setJob("技术员");
        System.out.println(person.info());
        System.out.println(person.getSalary());
        Person person1 = new Person("aasfgsrhafa",699,600000);
        System.out.println("=======构造器创建的信息=======");
        System.out.println(person1.info());
    }
}
class Person {
    public String name;
    private int age;
    private double salary;
    private String job;
    
    public Person(String name, int age, double salary) {
    setName(name);
    setAge(age);
    setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("输入的名字长度不对，给与默认名字");
            this.name = "无名氏";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 1 && age <=120) {
            this.age = age;
        } else {
            System.out.println("输入的年龄不符，给与默认年龄");
            this.age = 24;
        }
    }

    public double getSalary() {
        int psd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入密码");
        psd = scanner.nextInt();
        if (psd == 123456) {
            return salary;
        } else {
            System.out.println("密码错误,无法查看");
            return -1;
        }
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
    public String info() {
        return "信息为 name=" + name + "age=" + age + "工资=" + salary + "职位" + job;
    }
}

