public class Homework02 {
    public static void main(String[] args) {
        //编写类Book,定义方法updatePrice,实现改变某书的价格，具体：
        //价格大于150改为150，大于100改为100，否则不变
        Book book = new Book("人间",220);
        book.info();
        book.updatePrice();
        System.out.println("改价之后");
        book.info();
    }
}
class Book {
    String name;
    double price;
    public Book(String name,double price) {
        this.name = name;
        this.price = price;
    }
    public void updatePrice() {
        //如果方法中没有price局部变量，this.price等价price
        if(this.price > 150) {
            this.price = 150;
        } else if (this.price > 100) {
            this.price = 100;
        }
    }
    //显示书籍的情况
    public void info() {
        System.out.println("书名：" + this.name + "||" + "价格=" + this.price);
    }
}