package zixueday01.Demo;

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
     */
         @Test
        public void testFn3(){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入天数d=");
        int d = sc.nextInt();
        int z = d/7;
        int t = d%7;
        System.out.print("周数为："+ z + ",天数为：" + t);
    }


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
        /**
        输入一个字符，判断是大写还是小写，输出提示信息
        */
        @Test
        public void testFn6(){
            char  a = 'G';
            if(a>='a' && a<='z'){
                System.out.println("小写字母");
            }else if(a>='A'&&a<='Z'){
                System.out.println("大写字母");
            }else{
                System.out.println("其他字符");
            }
        }


        @Test
            public void testFn7() {
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

        /**
         * 逆序输出10-0
         */
        @Test
        public void testFn12(){
            int i = 10;
        do{
            System.out.println(i);
            i--;
        }while(i>=0);
        }
    /**
     * java阶乘求和1！+2！+。。。+10！
     */
    @Test
    public void testFn13() {
        int i = 1;
        int sum = 0;
        do {
            int num = 1;
            int j = 1;
            do {
                num *= j;
                j++;
            } while (j <= i);
            sum += num;
            i++;
        } while (i <= 3);
        System.out.println(sum);
    }
    /**
     *for循环简单示例
     */
    @Test
    public void testFn14(){
        for(int i = 0; i < 8 ; i++){
            if(i==4)
                continue;
            System.out.println(i);
        }
    }
    /**
     * 打印输出0~200之间能被7整除但不能被4整除的所有整数
     */
    @Test
    public void testFn15(){
    for(int i = 0;i<=200;i++){
        if((i%7==0)&&(i%4!=0)){
            System.out.print(i+"\t");
        }
    }
    }
    /**
     * 输出十个斐波那契数列
     */
    @Test
    public void testFn16(){
        int i = 1; int j =1;
        for(int n = 0;n < 5;n++){
            System.out.print(i+" "+j+" ");
            i+=j;
            j+=i;
        }
    }
    /**
     * *
     * **
     * ***
     * ****
     * *****
     */
    @Test
    public void testFn17(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    /**
     * 九九乘法表
     */
    @Test
    public void testFn18(){
        for(int i = 1;i <=9;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(j+"*"+i+"="+j*i+"\t");
            }
            System.out.println();
        }
    }
    /**
     *    *
     *   **
     *  ***
     * ****
     ******
     */
    @Test
    public void testFn19(){
        for(int i=1;i<=5;i++){
            for(int j=5;j>=1;j--){
                if(j<=i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    /**
     *    *
     *   ***
     *  *****
     * *******
     **********
     */
    @Test
    public void testFn20(){
        for(int i = 1; i <=5;i++){
            for(int j=5;j>i;j--){
                System.out.print(" ");
            }
            for(int k = 1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    /**
     *     A
     *    BBB
     *   CCCCC
     *  DDDDDDD
     * EEEEEEEEE
     */
    @Test
    public void testFn21(){
        char a = 'A';
        for(int i = 1; i <=5;i++){
            for(int j=5;j>i;j--){
                System.out.print(" ");
            }
            for(int k = 1;k<=2*i-1;k++){
                System.out.print(a);
            }
            a++;
            System.out.println();
        }
    }
}

