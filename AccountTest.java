public class AccountTest {

    public static void main(String[] args) {
        //Account类要求具有属性：名字2-4位，余额大于20，密码6位，不满足提示，给予默认值
        //通过set方法给Account的属性赋值，在AccountTest中测试
        Account account1 = new Account("jack",500,"111111");
        System.out.println(account1.info());
        System.out.println("================");
        Account account2 = new Account("jackada",5,"44");
        System.out.println(account2.info());
    }
}
class Account {
    private String name;
    private double money;
    private String password;

    public Account(String name, double money, String password) {
        this.setName(name);
        this.setMoney(money);
        this.setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <=4) {
            this.name = name;
        } else {
            System.out.println("输入名字长度不符，给与默认值");
            this.name = "无名氏";
        }
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        if (money > 20.0) {
            this.money = money;
        } else {
            System.out.println("余额不足，给与默认值");
            this.money = 0.0;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() == 6) {
            this.password = password;
        } else {
            System.out.println("密码长度不对，给与默认值");
            this.password = "123456";
        }
    }
    public String info() {
        return "名字=" + name + "余额" + money + "密码" + password;
    }
}
