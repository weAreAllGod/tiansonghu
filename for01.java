public class for01 {
    public static void main(String[] args) {
        //打印1-100中9的倍数的整数，统计个数，总和
        int count = 0;
        int sum = 0;
//        int start = 1;
//        int end = 100;
//        int t = 9;倍数
//        for (int i = start;i <= end;i++){
        for (int i = 1;i <= 100;i++){
            if (i % 9 ==0){
//          if (i % t ==0){改为变量，更能适应需求；
                System.out.println("i=" +i);
                count++;
                sum += i;
            }
        }
        System.out.println("count=" + count);
        System.out.println("sum=" + sum);
        //打印图上计算公式
        int n = 5;
        for (int i = 0;i <= n;i++) {
            System.out.println(i + "+" + (n - i) + "=" + n);
        }
    }
}
