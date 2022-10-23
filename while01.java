public class while01 {
    public static void main(String[] args) {
        //打印1-100之间所有能被三整除的数
        int i = 1;
        while (i <= 100) {
            if (i % 3 ==0){
                System.out.println("i=" + i);
            }
            i++;
        }
        //打印40-200之间所有偶数
        int n = 40;
        while (n <= 200){
            if (n % 2 == 0){
                System.out.println("n=" + n);
            }
            n++;
        }
    }
}
