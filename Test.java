package javatest;
//this关键字的使用
//public class Test {
//    public static void main(String[] args) {
//        student s=new student();
//        s.name="li";
//        s.set(18);
//        System.out.println(s.name);
//        System.out.println(s.getage());//0（不加this关键字前）
//        System.out.println(s.getage());//18()加关键字后
//    }
//
//}
//import java.util.Scanner;
//public class Test{
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        String b=sc.next();
//        System.out.println(a);
//        System.out.println(b);
//    }
//}

//构造方法（相当于构造函数）

//public class Test {
//    public static void main(String[] args) {
//        student s=new student();//无参构造方法
//        student s1=new student(30,"li");
//        System.out.print(s1.name+" ");//li
//        System.out.println(s1.getage());//30
//    }
//}

//String的构造方法
/*
1.public String();//创建一个空字符串  不含任何内容
2.public String(char[] c);//根据c的内容来创建字符串
3.public String(byte[] bys);//根据bys的内容创建字符串
4.String s="xxx";//直接复制给s
//建议使用直接赋值
 */

//public class Test {
//    public static void main(String[] args) {
//        String s=new String();
//        System.out.println(s);//空
//        s=new String("abc");
//        System.out.println(s);//abc
//        char[] c={'a','b','c'};
//        s=new String(c);
//        System.out.println(s);//abc
//        byte[] bys={97,98,99};
//        s=new String(bys);
//        System.out.println(s);//abc
//        s="abc";
//        System.out.println(s);//abc
//    }
//}



//在java中实现快排
//public class Test {
//    public static void my_qsort(int[] a,int left,int right){
//        if(left>=right) return;
//        int l=left,r=right;
//        int p=a[l];
//        while(l<r){
//            while(l<r&&a[r]>p){
//                r--;
//            }
//            a[l]=a[r];
//            while(l<r&&a[l]<=p){//"="不可以漏掉
//                l++;
//            }
//            a[r]=a[l];
//        }
//        a[l]=p;
//        my_qsort(a,left,l-1);
//        my_qsort(a,l+1,right);
//    }



//        public static void quickSort(int[] arr,int low,int high){
//        int i,j,temp,t;
//        if(low>high){
//            return;
//        }
//        i=low;
//        j=high;
//        //temp就是基准位
//        temp = arr[low];
//
//        while (i<j) {
//            //先看右边，依次往左递减
//            while (temp<=arr[j]&&i<j) {
//                j--;
//            }
//            //再看左边，依次往右递增
//            while (temp>=arr[i]&&i<j) {
//                i++;
//            }
//            //如果满足条件则交换
//            if (i<j) {
//                t = arr[j];
//                arr[j] = arr[i];
//                arr[i] = t;
//            }
//        }
//        //最后将基准为与i和j相等位置的数字交换
//        arr[low] = arr[i];
//        arr[i] = temp;
//        //递归调用左半数组
//        quickSort(arr, low, j-1);
//        //递归调用右半数组
//        quickSort(arr, j+1, high);
//    }
//    public static void main(String[] args) {
//        //int b=maxnum(1,2);
//        //System.out.println(b);
//        int[] a={1,4,5,6,7,3,4,66,7,544,4};
//       quick_sort sort=new quick_sort();
//       sort.my_qsort(a,0,a.length-1);
//        //my_qsort(a,0,a.length-1);
//        for(int i=0;i<a.length;i++) {
//            System.out.print(a[i]+" ");
//        }
//        System.out.println();//可以了
//    }
//    public static int maxnum(int a,int b){
//        return a>b?a:b;
//    }
//
//}

//public class Test {
//    public static void main(String[] args){
//        int[] arr = {10,7,2,4,7,62,3,4,2,1,8,9,19};
//        quickSort(arr, 0, arr.length-1);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    }
//    public static void quickSort(int[] arr,int low,int high){
//        int i,j,temp,t;
//        if(low>high){
//            return;
//        }
//        i=low;
//        j=high;
//        //temp就是基准位
//        temp = arr[low];
//
//        while (i<j) {
//            //先看右边，依次往左递减
//            while (temp<=arr[j]&&i<j) {
//                j--;
//            }
//            //再看左边，依次往右递增
//            while (temp>=arr[i]&&i<j) {
//                i++;
//            }
//            //如果满足条件则交换
//            if (i<j) {
//                t = arr[j];
//                arr[j] = arr[i];
//                arr[i] = t;
//            }
//        }
//        //最后将基准为与i和j相等位置的数字交换
//        arr[low] = arr[i];
//        arr[i] = temp;
//        //递归调用左半数组
//        quickSort(arr, low, j-1);
//        //递归调用右半数组
//        quickSort(arr, j+1, high);
//    }
//
//}


//import java.util.Scanner;
//
//public class Test{
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("请输入一个字符串：");
//        //可以用ctrl+alt+v快速补齐左边
//        String line = sc.nextLine();
//        System.out.println("你输入的字符串为："+line);
//    }
//}


//String 的构造方法
//public class Test{
//    public static void main(String[] args) {
//        //方法一
//        String s1=new String();
//        System.out.println("s1="+s1);//s1=" "
//        //方法二
//        char[] c={'a','b','c'};
//        String s2=new String(c);//通过字符数组创建字符串对象
//        System.out.println("s2="+s2);//s2=abc
//        byte[] b={97,98,99};
//        String s3=new String(b);
//        System.out.println("s3="+s3);//s3=abc
//        String s4="abc";
//        System.out.println("s4="+s4);//s4=abc
//    }
//}
//String对象的特点
/*
用 new出来的对象 每一个对象都有一个自己的地址
如果是直接赋值的如果两个字符串完全相同  则共用一个地址
 */

//import java.util.Scanner;
////用户登录
//public class Test {
//    public static void main(String[] args) {
//        String username="zhou";
//        String passwords="111";
//        Scanner sc=new Scanner(System.in);
//        for(int i=0;i<3;i++)
//        {
//            System.out.println("请输入用户名：");
//            String name=sc.nextLine();
//            System.out.println("请输入密码：");
//            String pw=sc.nextLine();
//            if(name.equals(username)&&pw.equals(passwords)){
//                System.out.println("登录成功！");
//                break;
//            }
//           if(2-i==0){
//               System.out.println("你的账号被锁定！");
//               break;
//           }
//            System.out.println("账号或密码错误，你还有"+(2-i)+"次机会！");
//        }
//    }
//}

//import java.util.Scanner;
//
////字符串的遍历
//public class Test {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("请输入一个字符串：");
//        String s=sc.nextLine();
//        for(int i=0;i<s.length();i++){
//            System.out.println(s.charAt(i));//如果输入abc 则输出 a b c (换行输出)
//        }
//    }
//}


//运用函数拼接字符串
//public class Test {
//    public static void main(String[] args) {
//        int[] arr={1,2,3};
//        String s=arrtoString(arr);
//        System.out.println("arr="+s);//arr=[1, 2, 3]
//    }
//    public static String  arrtoString(int[] a){//java中函数可以不用声明的放在main函数后面
//        String s="";
//        s+="[";
//        for(int i=0;i<a.length;i++)
//        {
//            if(i==a.length-1){
//                s+=a[i];
//                break;
//            }
//            s+=a[i];
//            s+=", ";
//        }
//        s+="]";
//        return s;
//    }
//}


//import java.util.Scanner;
//
////字符串反转
//public class Test {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("请输入一个字符串：");
//        String line=sc.nextLine();
//        String reline=reverse(line);
//        System.out.println("反转后为："+reline);
//    }
//    public static String reverse(String line){
//        String s="";
//        for(int i=line.length()-1;i>=0;i--){
//            s+=line.charAt(i);
//        }
//        return s;
//    }
//}


//String和StringBuilder
/*
String对象内容是不可变的
StringBuilder对象内容是可变的  这一点表现在字符串拼接上
String对象要多次开辟空间来接收新的值  而StringBuilder可在原来的空间进行操作
 */
//public class Test {
//    public static void main(String[] args) {
//        StringBuilder s=new StringBuilder("abc");
//        System.out.println("s:"+s);//abc
//        s.append("dd");
//        System.out.println("s:"+s);//abcdd
//        s.append(100);
//        System.out.println("s:"+s);//abcdd100
//        StringBuilder ss=new StringBuilder();
//        ss.append(100);
//        //System.out.println(ss==100);//错误 ss和100类型不同
//        //链式编程
//        StringBuilder sss=new StringBuilder();
//        sss.append("a").append("b").append("c").append("100");
//        System.out.println("sss:"+sss);//sss:abc100
//        sss.reverse();//字符串反转
//        System.out.println("sss:"+sss);//sss:001cba
//    }
//}

//StrignBuilder和String的相互转换
//因为在String中不可以调用append 和 reverse方法所以可以转换一下使其可以使用这些方法
//public class Test {
//    public static void main(String[] args) {
//        String s="hello";
//        StringBuilder sb=new StringBuilder(s);//String转换为StringBuilder
//        sb.reverse();//可以使用该方法
//        sb.toString();//StringBuilder转换为String
//        System.out.println("sb:"+sb);//sb:olleh
//    }
//}

//用StringBuilder进行字符串拼接
//public class Test {
//    public static void main(String[] args) {
//        int[] arr={1,2,3};
//        String s=arrtostring(arr);
//        System.out.println("s:"+s);
//    }
//    public static String arrtostring(int[] arr){
//        StringBuilder sb=new StringBuilder();
//        sb.append("[");
//        for(int i=0;i<arr.length;i++)
//        {
//            if(i==arr.length-1){
//                sb.append(arr[i]);
//                break;
//            }
//            sb.append(arr[i]).append(", ");
//        }
//        sb.append("]");
//        String s= sb.toString();
//        return s;
//    }
//}

//import java.util.Scanner;
//
////用StringBuilder字符串反转
//public class Test {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("请输入一个字符串：");
//        String s=sc.nextLine();
//        String ss=reverse(s);
//        System.out.println("ss:"+ss);
//    }
//    public static String reverse(String s){
//        //常规方法
////        StringBuilder sb=new StringBuilder(s);
////        sb.reverse();
////        String ss=sb.toString();
////        return ss;
//        //等价方法
//      // return new StringBuilder(s).reverse().toString();
//    }
//}

//import java.util.ArrayList;//要导包
//
////ArrayList构造和添加（其中ArrayLise代表集合）
//public class Test {
//    public static void main(String[] args) {
//        ArrayList<String> array=new ArrayList<>();
//        //也可以 ArrayList<String> array=new ArrayList<String>(); 这样
//        System.out.println("array"+array);//array[]  没有添加  集合为空
//        array.add("hello");
//        array.add("world");
//        System.out.println("array:"+array);//array:[hello, world]
//        array.add(2,"java");//在集合下标为2的位置下添加java
//        System.out.println("array:"+array);//array:[hello, world, java]
//
//    }
//}

//import java.util.ArrayList;
//
////ArrayList的常用方法
//public class Test {
//    public static void main(String[] args) {
//        ArrayList<String> array=new ArrayList();
//        array.add("hello");
//        array.add("world");
//        array.add("java");
//        //删除指定元素
//       // System.out.println(array.remove("hello"));//true(返回boolen类型) array[world, java]
//        //删除指定索引处类型
//        //System.out.println(array.remove(0));//hello(返回删除的元素) array[world, java]
//        //得到指定索引处的元素
////        System.out.println(array.get(0));//hello
////        System.out.println(array.get(3));//IndexOutOfBoundsException
////得到集合中元素的个数
//        System.out.println(array.size());//3
//        System.out.println("array"+array);
//    }
//}

//import java.util.ArrayList;
//
////ArrayList储存学生对象并输出
//public class Test {
//    public static void main(String[] args) {
//        ArrayList<student> array=new ArrayList();
//        student s1=new student("张三",18);
//        student s2=new student("李四",19);
//        student s3=new student("王五",20);
//        array.add(s1);
//        array.add(s2);
//        array.add(s3);
//        for(int i=0;i<array.size();i++){
//            student s=array.get(i);
//            System.out.println("姓名："+s.getName()+" 年龄："+s.getAge());
//        }
//    }
//}

//import java.util.ArrayList;
//import java.util.Scanner;
//
////ArrayList储存学生对象并遍历（手动敲姓名和年龄）
//public class Test {
//    public static void main(String[] args) {
//        ArrayList<student> array=new ArrayList<>();
//        setarray(array);
//        setarray(array);
//        setarray(array);
//        for(int i=0;i<array.size();i++){
//            student s=array.get(i);
//            System.out.println("姓名："+s.getName()+" 年龄："+s.getAge());
//        }
//    }
//    public static void setarray(ArrayList<student> array){
//        Scanner sc=new Scanner(System.in);
//        String n,a;
//        System.out.println("请输入姓名：");
//        n=sc.nextLine();
//        System.out.println("请输入年龄：");
//        a=sc.nextLine();
//        student s=new student(n,a);
//        array.add(s);
//    }
//}


//import java.util.Scanner;
//
////学生管理系统
//public class Test {
//    public static void main(String[] args) {
//       int[] a={1,2,3};
//        System.out.println(a[1]);//2
//       modfarray(a);
//        System.out.println(a[1]);//1
//    }
//    public static void modfarray(int[] array){//这样相当与引用参数
//        array[1]=1;
//    }
//
//    public Test() {
//    }
//}

//继承

//public class Test {
//    public static void main(String[] args) {
//        ZI z=new ZI();
//        z.showzi();//showzi被调用
//        FU f=new FU();
//        f.showfu();//showfu被调用
//        z.showfu();//showfu被调用  关键字（extends）
//    }
//}

//public class Test {
//    public static void main(String[] args) {
//        ZI z=new ZI();
//        z.showageheight();//age:20 height:10
//    }
//}

//super关键字
//用于引用指定父类中的成员变量或函数（与this相似  不过this用于引用本类中的成员变量或函数）
//public class Test {
//    public static void main(String[] args) {
//        ZI z=new ZI();
//        z.showheight();
//        /*
// height:30
//this.height:20
//super.height10
//         */
//    }
//}

//public class Test {
//    public static void main(String[] args) {
//        ZI z=new ZI();//ZI和FU中的无参构造方法都被调用了
//        ZI z1=new ZI(10);//ZI中调用带参构造方法 FU中调用无参构造方法
//    }
//}

//可以显示一个对话框
//import javax.swing.*;
//
//public class Test {
//    public static void main(String[] args) {
//        JOptionPane.showMessageDialog(null,"我爱学习");
//        System.exit(0);
//    }
//}

//
//import javax.swing.*;//导入swing包
//public class Test {
//    public static void main(String[] args) {
//        String s1=JOptionPane.showInputDialog(null,"请输入整数a");
//        String s2=JOptionPane.showInputDialog(null,"请输入整数b");
//        int a=Integer.parseInt(s1);
//        int b=Integer.parseInt(s2);
//        int m=a>b?a:b;
//        JOptionPane.showMessageDialog(null,a+"和"+b+"中较大值为"+m);
//        System.exit(0);
//    }
//}


//方法重写
//class fuu{
//    public void call(String name){
//        System.out.println("给"+name+"打电话");
//    }
//}
//class zii extends fuu{
//
//}
//
//public class Test {
//    public static void main(String[] args) {
////        zii z=new zii();
////        z.call("li");//给li打电话(没方法重写之前)
////        fu f=new fu();
////        f.call("li");
//        //System.out.println(111);
//        ZI z=new ZI();
//
//        int a=z.addd(10,20);
//        System.out.println(a);
//    }
//    static int add(int x,int y){
//        return x+y;
//    }
//}

//@Override
//class fuu{
// public void show(){
//     System.out.println("fuu类中show 方法被调用");
// }
//}
//class zii extends fuu{
//    @Override//用于检验子类中的方法是否为父类的重写 如果不是则会报错
//    public void show(){
//        System.out.println("zii类中show方法被调用");//注意  子类的访问权限一定要设置的比父类大 且父类中 protected
//        //和private权限的成员不可被继承
//    }
//}
//
//public class Test {
//    public static void main(String[] args) {
//        zii z=new zii();
//        z.show();//zii类中show方法被调用
//
//    }
//}

//java中继承的特点
//1.java中类不支持多继承
//2.java中支持多层继承
//就是说有A,B,C三个类 不能class A extends B,C 但是如果B继承A C继承B 则C中也继承了A中的公有部分




//老师和学生
//class person{
//    private String name;
//    private int age;
//
//    public person() {
//    }
//
//    public person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//}
//
//class teacher extends person{
//    public teacher(){
//
//    }
//    public teacher(String name,int age){
//        super(name,age);//调用父类的有参构造函数
//    }
//    public void tech(){
//        System.out.println("用爱成就每一个梦想");
//    }
//}
//
//public class Test {
//    public static void main(String[] args) {
//        teacher t=new teacher();
//        t.setName("li");
//        t.setAge(18);
//        System.out.println(t.getName()+" "+t.getAge());//li 18
//        teacher t2=new teacher("liu",19);
//        System.out.println(t2.getName()+" "+t2.getAge());//liu 19
//    }
//}

//import javatest1.teacher;//不在同一个包中的类 使用需要导包
//
//public class Test {
//    public static void main(String[] args) {
//        teacher t=new teacher();
//        t.show();//用爱成就每一个梦想
//    }
//}

//final关键字  表示最终的
/*
final修饰类 如 public final class A{} 则A为最终类  不可被继承
final修饰变量 如 public final int a=10; 则 a为常变量 不可被修改
final修饰方法 如 public final void show(){} 则show()方法不可被重写
final修饰引用类型 即地址值 则地址值不可改变  但地址里面的内容可以改变
 */


//static关键字
//class abc{
//    public static int a;
//}
//public class Test {
//    public static void main(String[] args) {
//        abc.a=10;
//        abc aa=new abc();
//        System.out.println(aa.a);//10
//        abc bb=new abc();
//        System.out.println(bb.a);//10
//    }
//}

/*
static:静态 可以修饰成员变量和成员方法
特点：
可以被类的所有对象共享
可以通过类名或对象名调用
而且静态的成员方法只能访问（指外部成员 方法内部可以是非静态）静态的成员（包括成员方法和成员变量）
所以在main函数中调用的方法必须为静态方法
 */


//多态：同一个对象在不同时刻表现出来的不同形态
//class animal{
//    public void show(){
//        System.out.println("动物在捕猎");
//    }
//}
//class cat extends animal{
//    @Override
//    public void show() {//直接打show并回车就可以了
//        System.out.println("猫捉鱼");
//    }
//}
//
//public class Test {
//    public static void main(String[] args) {
//        animal a=new cat();//多态的表现
//        a.show();//猫捉鱼
//    }
//}

//多态中成员变量的访问特点
/*
成员变量：编译看左边 执行看左边  在 animal a=new cat();中 左边是指animal 类 右边是指cat类
成员方法：编译看左边 执行看右边
因为方法有重写而变量没有
 */

//class animal{
//    public int age=10;
//    public void show(){
//        System.out.println("动物在捕猎");
//    }
//}
//class cat extends animal{
//    public int age=20;
//    public int weight=50;
//    @Override
//    public void show() {//直接打show并回车就可以了
//        System.out.println("猫捉鱼");
//    }
//}
//
//public class Test {
//    public static void main(String[] args) {
//        animal a=new cat();//多态的表现
//        System.out.println(a.age);//10 而不是20
//       // System.out.println(a.weight);//报错  因为aninal中没有weight
//        a.show();//猫捉鱼 方法被重写
//    }
//}



//多态的好处和弊端
/*
好处：提高了程序的扩展性
弊端：不能使用子类的特有功能
 */

//class animal{
//    public void eat(){
//
//    }
//}
//class cat extends animal{
//    @Override
//    public void eat() {
//        System.out.println("猫吃鱼");
//    }
//}
//
//class dog extends animal{
//    @Override
//    public void eat() {
//        System.out.println("狗吃骨头");
//    }
//    public void show(){
//        System.out.println("狗狗会跳舞");
//    }
//}
//
//class animaloption{
//   public void useanimal(animal a){
//       a.eat();
//   }
//
//}
//
//public class Test {
//    public static void main(String[] args) {
//        animaloption aa=new animaloption();
//        dog d=new dog();
//        cat c=new cat();
//        aa.useanimal(d);//狗吃骨头
//        aa.useanimal(c);//猫吃鱼
//        //但不能用aa调用show函数
//    }
//}


//多态中转型(包括向上转型和向下转型)
//class animal{
//    public void eat(){
//
//    }
//}
//class dog extends animal{
//    @Override
//    public void eat() {
//        System.out.println("狗吃骨头");
//    }
//    public void show(){
//        System.out.println("狗狗会跳舞");
//    }
//}
//public class Test {
//    public static void main(String[] args) {
//      animal a=new dog();//向上转型
//      a.eat();
//      //a.show();//报错
//        dog d=(dog)a;//向下转型 强制类型转换
//        d.eat();//狗吃骨头
//        d.show();//狗狗会跳舞
//    }
//}


//抽象类（abstruct）
/*
抽象类的特点：
1。抽象类和抽象方法都必须用abstruct修饰
public abstruct class xxx{}
public abstruct void xxx(){}
2,抽象类中不一定有抽象方法  但有抽象方法的一定是抽象类
3。抽象类不i能直接定义对象 只能通过子类完成对象实例化  这叫抽象多态
4，抽象类的子类 要么子类重写抽象类中的所有方法  要么把子类定义为抽象类
 */
//abstract class animal{
//    public abstract void eat();
//    public void show() {
//        System.out.println("动物爱跳舞");
//    }
//}
//
//class cat extends animal{
//    @Override
//    public void eat() {
//        System.out.println("猫吃鱼");//将抽象方法实例化
//    }
//}
//
//abstract class dog extends animal{//将dog定义为抽象类
//
//}
//public class Test {
//    public static void main(String[] args) {
//        animal a=new cat();//通过子类将抽象类实例化
//        a.eat();
//        a.show();
//
//    }
//}



//接口
/*
特点：
接口用关键字interface 修饰
public interface xxx(){}
类实现接口用implements表示
public class xxx implements xxx{}  （implements:工具 器具 手段）
接口如同抽象类 不能直接定义对象 必须通过子类来完成实例化 这叫接口多态
多态的形式：具体类多态 抽象类多态 接口多态
多态的前提：有继承或实现关系
接口的实现类： 要么重写接口中的所有抽象方法
要么子类为抽象类
 */

//已经创建了一个接口（如同创建了一个类）
//class cat implements jumpping{//使用的是implements 而不是extends
//    @Override
//    public void jump() {
//        System.out.println("猫猫可以跳高了");//实现接口中的抽象方法
//    }
//}
//abstract class dog implements jumpping{
//    //将dog定义为抽象类
//}
//
//public class Test {
//    public static void main(String[] args) {
//        jumpping j=new cat();
//        j.jump();//猫猫可以跳高了
//    }
//}

//接口的成员特点
/*
1，成员变量只能是常变量 接口中int a=10;和public static final int a=10;是等效的
2，接口中没有构造方法 因为接口是对行为的抽象 没有具体的存在
补充：一个类如果没有父类 默认是继承自Object类  （object:实物 目标 对象），如果一个类有父类 则间接继承自Object类 总之
所有类都继承自Object类
3,接口中的成员方法只能是抽象方法 （默认修饰符 public abstract） 且不可有方法体
 */



//class demo implements jumpping{
//    @Override
//    public void eat() {
//        System.out.println("吃饭");
//    }
//
//    @Override
//    public void show() {
//        System.out.println("跳舞");
//    }
//}
//
//public class Test {
//    public static void main(String[] args) {
//        jumpping j=new demo();
//        System.out.println(j.a);//10
//        System.out.println(j.b);//20
//        j.eat();//吃饭
//        j.show();//跳舞
//       // j.a=30;//报错  提示a为final修饰的常变量
//    }
//}

//猫狗案例接口抽像类版
//abstract class animal{
//    public abstract void eat();
//}
//class cat extends animal implements jumpping{//同时继承抽象类和实现接口
//    @Override
//    public void eat() {
//        System.out.println("猫吃鱼");
//    }
//
//    @Override
//    public void jump() {
//        System.out.println("小猫跳高");
//    }
//}
//
//public class Test {
//    public static void main(String[] args) {
//        jumpping a=new cat();
//        a.jump();
//        animal b=new cat();
//        b.eat();
//        ((cat) b).jump();//这样经过强转也可以使b调用jump
//        //但实际中我们不会这样整 一般直接创建一个cat对象
//        cat c=new cat();
//        c.eat();
//        c.jump();
//    }
//}


//类和接口的关系
/*
类和类的关系
继承关系 只能单继承 但可以多层继承
 类和接口的关系
 实现关系 可以单实现 也可以多实现  还可以在继承一个类的同时实现多个接口
 */


//abstract class animal{
//
//}
//interface inte1{
//
//        }
//interface inte2{
//
//}
//interface inte3{
//
//}
//interface inte4 extends inte1,inte2,inte3 {//接口和接口可以多继承  类之间只能单继承 但可以多层继承
//
//}
//class cat extends animal implements inte1,inte2,inte3{//类和接口可以单实现和多实现
//
//}


//抽象类和接口的区别
/*
比如有两种门 一种有报警功能 一种没有  如果单独向类或者接口中放入alarm方法 则以后定义的所有子类或实现中都必须实现他
为了解决这种问题 我们可以只在接口中放入报警功能 类中放入门的一些基本功能 如开关  以后只要是报警门 就实现这个接口
没有报警功能就不实现
 */
//abstract class door{
//        public abstract void openandclose();//门的开关
//}
//interface ala{
//        void alarm();
//}
//class aladoor extends door implements ala{//报警门 实现ala接口
//        @Override
//        public void openandclose() {
//
//        }
//
//        @Override
//        public void alarm() {
//
//        }
//}
//
//class noaladoor extends door{//非报警门  不实现ala接口
//        @Override
//        public void openandclose() {
//
//        }
//}

/*
注：类作为形参和类名作为返回类型
类作为形参：调用时以类作为实参
类作为返回类型：返回类

接口作为返回类型和接口作为返回类型
接口作为形参：以接口的实现类作为实参
接口作为返回类型：返回接口的实现类
 */

//内部类（即在类中的类）

//public class Test {
//        private int a=10;
//        class inner{
//                public void show(){
//                        System.out.println(a);
//                }
//        }
//        public void testt(){
//                //show();//报错  不能直接使用内部类中的方法 必须借助对象
//        inner i=new inner();
//        i.show();//不报错
//        }
//}


//成员内部类
/*
根据内部类的位置的不同 可以分为如下几种形式
内部类在类的成员位置：成员内部类
内部类在类的局部位置（即方法内）：局部内部类
对于成员内部类外界如何使用呢
假设有一个外部类Outer 里面有一个内部类inner
在外界创建对象 Outew.inner oi=new Outer().new inner();
 */
//class Outer{
//        private int a=10;
//        class inner{
//                public void show(){
//                        System.out.println(a);
//                }
//        }
//        private class innerr{
//                public void show(){
//                        System.out.println(a);
//                }
//        }
//        public void method(){
//                innerr i=new innerr();
//                i.show();
//        }
//}
//
//public class Test {
//        public static void main(String[] args) {
//                Outer.inner oi=new Outer().new inner();
//               oi.show();//10
////                Outer.innerr oi=new Outer().new innerr();//报错 innerr访问权限为private 一般不这样
//                Outer o=new Outer();
//                o.method();//10  一般这样
//        }
//}

//局部内部类
















