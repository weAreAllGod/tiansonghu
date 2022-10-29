public class Homework03 {
    public static void main(String[] args) {
        //编写类A03，实现数组的复制功能copyArr,输入旧数组，返回新数组，元素和旧数组一样
        int oldArr[] = {3,6,5,8,5};
        A03 a3 = new A03();
        int newArr[] = a3.copyArr(oldArr);
        System.out.println("返回的newArr：");
        for (int i = 0;i < newArr.length;i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
class A03 {
    public int[] copyArr(int oldArr[]) {
        int newArr[] = new int[oldArr.length];
        for (int i = 0;i < oldArr.length;i++) {
            newArr[i] = oldArr[i];
        }
        return newArr;
    }
}