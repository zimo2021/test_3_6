package javatest;

//public class ZI extends FU{
//    public void showzi(){
//        System.out.println("showzi被调用");
//    }
//    public int age=20;
//    int height=20;//如果子类中有 则用子类的
//    public void showheight(){
//        int height=30;//如果方法内有 优先使用方法内的
//        System.out.println(" height:"+height);
//        System.out.println("this.height:"+this.height);
//        System.out.println("super.height"+super.height);
//    }
//}


public class ZI extends FU{
    public ZI(){
        super(10);//加了super() 则构造子类时调用FU类中有参
        System.out.println("ZI中无参构造方法被调用");
    }
    public ZI(int a){
        super(10);
        System.out.println("ZI中带参构造方法被调用");
    }
    int addd(int x,int y){
        return x+y;
    }
}



