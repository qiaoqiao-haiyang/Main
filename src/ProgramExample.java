import org.junit.Test;

import java.util.Scanner;


public class ProgramExample {


    /*
    *1,通过键盘输入声明初始化一个圆柱体的高和底面半径，pai值是3.14
    * 求圆柱的体积，并显示输出圆柱体的体积；Π（r^2）h
    * {
    *   Scanner sc = new Scanner (System.in);
        System.out.print("请输入半径r=");
        int r = sc.nextInt();
        System.out.print("请输入高h=");
        int h = sc.nextInt();
        double pai = 3.14;
        System.out.println("圆柱体的体积是：" +pai *(r*r)*h);
        * }
     */
    /*
    *3,根据天数计算周数和剩余天数，天数通过键盘输入
    *
    *
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("请输入天数d=");
        int d = sc.nextInt();
        int z = d/7;
        int t = d%7;
        System.out.print("周数为："+ z + ",天数为：" + t);
    }
    @Test
    public void testFn(){
    int l = 54321;
    int w = l/10000;
    int q = l/1000%10;
    int b = l/100%10;
    int s = l/10%10;
    int g = l%10;
        System.out.println("五位数之和为：" +(w+q+b+s+g));
    }
}
