public class Homework01 {
    public static void main(String[] args) {
        //编写类A01，定义方法max，实现求某个double数组的最大值并返回
        A01 a1 = new A01();
        double arr[] = {2.5,6.4,5.2,6.1,1.6};
        System.out.println("arr最大值=" + a1.max(arr));
        A02 a2 = new A02();
        String str[] = {"jack","tom","li","zhang"};
        int index = a2.find("hsp",str);
        System.out.println("查找的下标是" + index);
        int index1 = a2.find("jack",str);
        System.out.println("查找的下标是" + index1);
    }
}
class A01 {
    public double max(double arr[]) {
        double max = arr[0];//假设第一个元素是最大值
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                    max = arr[i];
            }
        }
            return max;
    }
}
//编写A02,定义方法find，实现查找某字符串数组中的元素查找，并返回索引，找不到返回-1
class A02 {
    public int find(String findStr,String str[]) {
        for (int i = 0;i < str.length;i++) {
            if (findStr.equals(str[i])) {
                return i;
            }
        }
        return -1;
    }
}