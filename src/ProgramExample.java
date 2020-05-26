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
    *   Scanner sc = new Scanner(System.in);
        System.out.print("请输入天数d=");
        int d = sc.nextInt();
        int z = d/7;
        int t = d%7;
        System.out.print("周数为："+ z + ",天数为：" + t);
     */
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int yi = sc.nextInt();
        System.out.println("请输入第二个数：");
        int er = sc.nextInt();
        int temp;
        temp = yi;
        yi=er;
        er = temp;
        System.out.println("第一个数"+yi +"第二个数"+er);
    }

//    int l = 54321;
//    int w = l/10000;
//    int q = l/1000%10;
//    int b = l/100%10;
//    int s = l/10%10;
//    int g = l%10;
//        System.out.println("五位数之和为：" +(w+q+b+s+g));
        /*int a = 4;
        int b = 6;
        //逻辑与：＆同为１时为１，否则为０
        if (a < 3 & b++ > 6) {
            System.out.println(a + b);
        } else {
            System.out.println(a * b);
        }
        //短路与
        //ｉｆ（ａ＝＝１＆＆ｂ＝＝２）　这是说既要满足ａ＝１也要满足ｂ＝２
        if (a < 6 && b++ > 6) {
            System.out.println(a - b);
        } else {
            System.out.println(a / b);
        }
        //逻辑或：｜同为０时为０，否则为１
        if (a < 3 | b++ > 6) {
            System.out.println(a + b);
        } else {
            System.out.println(a * b);
        }
        //短路或
        //ｉｆ（ａ＝＝１｜｜ｂ＝＝２）　这是说或者满足ａ＝１或者要满足ｂ＝２
        if (a < 3 || b++ > 6) {
            System.out.println(a + b);
        } else {
            System.out.println(a * b);
        }*/
        /*
        输入一个字符，判断是大写还是小写，输出提示信息
              char  a = 'G';
        if(a>='a' && a<='z'){
            System.out.println("小写字母");
        }else if(a>='A'&&a<='Z'){
            System.out.println("大写字母");
        }else{
            System.out.println("其他字符");
        }
         */
    @Test
        public void testFn() {
        final int a = 1;//final修饰不可变量
    switch (a){
        case a:
            System.out.println(1);
            break;
        case 2:
                System.out.println(2);
            break;
        case 4:
            System.out.println(3);
            break;
        default:
            System.out.println("default");
            break;
    }
    }
    /**
     * 输入一个月数，然后输入对应月份有多少天（不考虑闰年），将天数输出。
     */
    @Test
    public void testFn8(){
        int d = 1;
        switch(d){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31天");
                break;
            case 2:
                System.out.println("28天");
            break;
            default:
                System.out.println("30天");
        }
        int a = 10, b = 12;
        String ysf = "+";
        switch(ysf){
            case"+":
                System.out.println(a+b);
                break;
        }
    }
    /**
     * while循环
     */
    @Test
    public void testFn9(){
    int i = 10;
    while(i-->4){
        System.out.println(i);
    }
    }
    /**
     * 计算1-100之间所有整数的和。。5050
     */
    @Test
    public void testFn10(){
        int i = 1;
        int sum = 0;
        while (i<=100){
            sum+=i++;
        }
        System.out.println(sum);
    }
    /**
     * 计算10的阶乘
     */
    @Test
    public void testFn11(){
        int i = 1;
        int mul = 1;
        while (i<10){
            mul *=i++;
        }
        System.out.println(mul);
    }
}
