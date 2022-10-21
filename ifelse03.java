import java.util.Scanner;
public class ifelse03 {
    public static void main(String[] args) {
        //根据淡旺季的月份和年龄，打印票价
        //4-10月旺季，大人18-60岁，60元；18岁以下，半价，老人三分之一价格
        //淡季，大人40，其他人20
        Scanner myScanner = new Scanner(System.in);
        System.out.println("输入月份");
        int month = myScanner.nextInt();
        System.out.println("输入年龄");
        int age = myScanner.nextInt();
        if (month >=4 && month <= 10) {
            if (age >=18 && age <=60) {
                System.out.println("票价60");
            } else if (age < 18) {
                System.out.println("票价30");
            } else if (age > 60) {
                System.out.println("票价20");
            } else
			System.out.println("年龄输入错误" );
            }
        } else  {
            if (age >=18 && age <=60){
                System.out.println("票价40");
            } else if ((100 > age && age > 60) || (18 > age && age > 0)) {
                System.out.println("票价20");
            }else {
			System.out.println("年龄输入错误" );
		    }
        }
    }
}
