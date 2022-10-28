public class VarParmeterExercise {
    public static void main(String[] args) {
        //有三个方法，分别实现返回姓名；2门课成绩总分，返回姓名和三门课成绩总分，返回姓名和五门课总分
        studnet stu =new studnet();
        System.out.println(stu.xuesheng("张三",95.1,85.6));
        System.out.println(stu.xuesheng("张4",95.1,85.6,65.2));
        System.out.println(stu.xuesheng("张5",95.1,85.6,55.4,69.6,78.9));
    }
}
class studnet {
    public String xuesheng(String name,double...score) {
        double sum = 0;
        for (int i = 0; i < score.length;i++) {
            sum += score[i];
        }
        return name + "有"+ score.length + "门课,总分=" + sum;
    }
}
