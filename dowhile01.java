public class dowhile01 {
    public static void main(String[] args) {
        //打印1-100，并统计和
        int i = 1;
        int sum = 0;
        do {
            sum += i;
            System.out.println("i=" + i);
            i++;
        } while (i <= 100);
        System.out.println("sum=" + sum);
        //统计1-200之间能被5整除但不能被3整除的数的个数
        int n = 1;
        int count = 0;
        do {
            if (n % 5 == 0 && n % 3 !=0){
                System.out.println("n=" + n);
                count++;

            }
            n++;
        }while (n <= 200);
        System.out.println("count=" + count);
    }
}
