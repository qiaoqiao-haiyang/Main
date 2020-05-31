package zixueday02.Demo;

import jdk.nashorn.internal.ir.CallNode;
import org.junit.Test;

import java.util.Arrays;

public class ProgramExample {
    /**
     * 方法定义
     */
    @Test
    public void Testfn(){
//    int menuSize = getMenu();
//        System.out.println(menuSize);
//        String order = getOrder(1);
//        String order1 = getOrder(2);
//        System.out.println(order +'\n'+  order1);
//        printAn(8);
        printAn('8');
    }

    /**
     * void :空返回
     * ing :返回数字
     * 8中基本数据类型
     * 引用类型
     *
     * public :方法体权限访问修饰符
     *
     * private：私有的，只有本类中的方法才能调用
     *
     * static：其他修饰符，静态的
     * int 方法的返回值
     * getMenu：方法名，驼峰命名法
     * int a 形参  10：实参
     *
     * 实参和形参的类型要互相兼容，int 1 ！=char ‘1’
     * 且：实参的取值范围要小于或等于形参类型的取值范围
     *
     */
    public int getMenu(){//如果void换成int则
        System.out.println("1,锅包肉");
        System.out.println("2,可乐鸡翅");
        System.out.println("3,水煮肉");
        return 3;
    }


    public String getOrder( int a ) {
        String str  = "";
        switch(a){
            case 1:
                str +="1,锅包肉";
                break;
            case 2:
                str +="2,可乐鸡翅";
                break;
            case 3:
                str +="3,水煮肉";
                break;
        }
        return str;
    }
    /**
     * 根据传入的参数打印直角三角形
     * 重载：
     * 1，方法名称必须相同
     * 2，参数类型与参数数量的不同才能决定重载条件成立
     * 3，返回值类型不同不可以作为方法重载条件
     */
    public void printAn(int num){
        for(int i = 1;i <=num;i++){
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printAn(int num,int sum){
        for(int i = 1;i <=num;i++){
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void printAn(String num){
        for(int i = 1;i <=Integer.valueOf(num);i++){
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    /**
     * 数组的定义
     */
    @Test
    public void testFn1(){
        int s1 = 20180206;
//      int s1 = 20193213;
        int[] students = new int[50];
        //上面的初始化方式为动态初始化数组，索引从0开始
        students[0] = 20180206;
        students[1] = 20180305;
        int len = students.length;
        System.out.println(len);
        int[] students2;
        students2 = new int[50];
        //2，先定义，后分配空间
        int[] students3 = new int []{1,2,3,4,5};
        //3,静态初始化，直接复制决定空间大小
        System.out.println(students3.length);
        int[] students4 = {1,2,3,4};
        //4，静态初始化，上面第三种的简单方法最常用
        //java抛出异常，数组越界异常：java.lang.ArrayIndexOutOfBoundsException: 4
        System.out.println(students4[students4.length-1]);

        for(int i = 0;i<len;i++){
            students[i] = s1+i;
            System.out.println(students[i]);
        }
    }
    /**
     * foreach循环
     */
    @Test
    public void testFn2(){
        int[] array = {22,33,44,55,66};
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        //foreach语法 int x :x 的类型必须是你数组封装类型
        //场景，你不需要应用数组的索引做操作的时候即可使用此方式
        for (int x:array) {
            System.out.println(x);
        }
    }
    /**
     * 可变参数...a
     * 必须放在方法里面的最后一个参数位置
     */
    @Test
    public void testFn3(){
    sortArray(10,11,22,32);
    }
    public void sortArray(int b,int ...a){
        for(int x:a){
            System.out.println(x);
        }
        System.out.println(b);

    }

    /**
     * 空指针异常
     * 数组越界异常
     */
    @Test
    public void testFn4(){
    int[]array = {1,2,3,4,5};
    for(int i= 0;i<array.length;i++){
        System.out.println(array[i]);
    }
//    int[]arrays = getStudentsNo();
//        System.out.println(arrays[1]);
    }
//    public int[] getStudentsNo(){
//        int[] arrays = null;
//        return arrays;
//    }
    /**
     * 成员变量和局部变量的区别
     * 1.从语法形式上，看成员变量是属于类的，而局部变量是在方法中定义的变量或是方法的参数；
     * 成员变量可以被public,private,static等修饰符所修饰，而局部变量不能被访问控制修饰符及static所修饰；
     * 但是，成员变量和局部变量都能被final所修饰；
     *    2.从变量在内存中的存储方式来看，成员变量是对象的一部分，
     *    而对象存在于堆内存，局部变量存在于栈内存
     *    3.从变量在内存中的生存时间上看，成员变量是对象的一部分，
     *    它随着对象的创建而存在，而局部变量随着方法的调用而自动消失。
     *    4.成员变量如果没有被赋初值，则会自动以类型的默认值而赋值
     *    （一种情况例外被final修饰但没有被static修饰的成员变量必须显示地赋值）；
     *    而局部变量则不会自动赋值
     */
    /**
     * 猜数游戏：从键盘中任意输入一个数据，判断数列中是否包含此数
     */
    @Test
    public void testFn5(){
        int[] arr ={11,22,33,44,55};
        boolean b = findX(arr,11);
        if(b) System.out.println("猜对了！");
        else System.out.println("猜错了！");

        //方法二
        findX(12,arr);
    }
    private void findX(int X,int[] arr){
        boolean flag = false;
        for(int i:arr){
            if(i==X){
                flag = true;
                break;
            }
        }
        if(flag) System.out.println("猜对了！");
        else System.out.println("猜错了！");
    }
    private boolean findX(int[] arr,int X){
        for (int i:arr) {
            if(i==X)
                return true;
        }
        return false;
    }
    /**
     * 多维数组
     * 一起来参加程序员大赛吧，有3各班级各3名学员参加，
     * 记录每个学员的成绩，并计算每个班的平均分
     */
    @Test
    public void testFn6(){
        int [][] c = {{1,3,5},{2,4,6},{7,8,9}};
        for(int i =0;i<c.length;i++){
            int totalScore = 0;
            for(int j=0;j<c[i].length;j++){
            totalScore += c[i][j];
            }
            System.out.println("第" + (i+1) + "个班级的平均成绩为：" +(totalScore*1.0/c[i].length));
        }
    }
    /**
     * 在一个数列中找出最大的数
     */
    @Test
    public void testFn7(){
        int[] arr = {-1,22,33,45,11,2,87};
        int maxValue = arr[0];
        for(int x:arr){
            if(x>maxValue){
                maxValue = x;
            }
        }
        System.out.println(maxValue);
    }
    /**
     * 在一个数列中找出最小的数
     */
    @Test
    public void testFn8(){
        int[] arr = {-1,22,33,45,11,2,87};
        int minValue = arr[0];
        for(int x:arr){
            if(x>minValue){
                x= minValue ;
            }
        }
        System.out.println(minValue);
    }
    /**
     * 冒泡排序
     */
    @Test
    public void testFn9(){
        int[] arr = {-1,33,22,11,2,87};
        //-1,22,33,45,11,2,87
        //i=-1,i+1=22
        //交换一次 -1 22 33 11  2 87
        //交换两次 -1 22 11 33 2 87
        //交换三次-1 22 11 2 33 87    至此第一轮操作结束，87到最后
        //第二轮操作结果 -1 11 2 22 33 87
        //第三轮结果 -1 2 11 22 33 87
        for(int i = 0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.print("[");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("]");
    }
    /**
     * 选择排序算法
     */
    @Test
    public void testFn10(){
        int[] arr = {-1,33,22,11,2,87};
        //-1 33 22 11 2 87
        //-1 33 22 11 2 87
        //-1 2 22 11 33 87
        //-1 2 11 22 33 87
        for (int i = 0;i<arr.length;i++){
            int minIndex = i;
            for(int j = i+1; j<arr.length; j++) {
                if (arr[minIndex] < arr[j]) {
                    minIndex = j;
                }
            }
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            System.out.println(Arrays.toString(arr));
                }
//            System.out.print("[");
//            for (int i=0;i<arr.length;i++){
//                System.out.print(arr[i]+" ");
//            }
//            System.out.println("]");
        }

}
