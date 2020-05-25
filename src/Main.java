public class Main {
    //所有单引号或双引号在java中全是在英文输入法下
    private static int age = 10;
    String str = "abc";//str:引用数据类型
    boolean b = true;//布尔型 boolean不定值 默认值：false
    byte bb = 1;//字节型 byte 1 默认值：0
    short s = 2;//短整型 short 2 默认值：0
    int i = 10;//整型 int 4 ..
    long l = 100;//长整型 long 8 ..
    float f = 10.4f;//单精度浮点型 float 4默认值为0.0f
    double d =  10.8d;//双精度浮点型 double 8 默认值为0.0d
    char c ='c';//字符型 char 2 默认值/u0000
    static int ii;//不设定初始化参数
    //以上均是成员变量，成员变量都有默认值
    public static void main (String[] args){
        int no = 2017265;//no局部变量
        String 威武 = "123";
        int ii;//java里一个重要的原则就近原则，好几个同名的变量或方法，他去调用的是离他域最近的
        //局部变量没有默认值
        age = 20;
        //。。。去数据库或文件中查询，再把取回来的值赋给之前定义好的变量
        ii=111;
        System.out.println("张三的年龄是" + age + "学号是：" +no + "威武=" +威武 + "ii=" +ii);
        short s = 11;
        int i = 22;
        i = s;
        s = (short)i;//强制类型转换损失精度
        boolean b = false;
        //boolean类型不能与其他数据类型进行转换操作        i=(int) b;
//        String str ="aaa\nbbb";
//        String str1 ="aaa\rbbb";
//        String str2 = "aaa\tbbb";
        String str3 = "aaa\\bbb";//转义，去掉原来的意义
//        System.out.println(str);
//        System.out.println(str1);
//        System.out.println(str2);
        System.out.println(str3);
    }
    /*
    *此功能是获取年龄和工号的
     */
    public void myAgeAndNo(){
        System.out.println(str);
    }
}
