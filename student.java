package javatest;
//public class student {
//    private  String name;
//    private  int age;
//    public student(String n,int a){
//        this.name=n;
//        this.age=a;
//    }
//    public student(){;}
//    public void setAge(int age) {
//        this.age = age;
//    }
//    public void setName(String name){
//        this.name=name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//}//一个包里的类可以互相引用



//public class student {
//    private String name;
//    private String age;
//    public student(String name,String age){
//        this.name=name;
//        this.age=age;
//    }
//    public student(){;}
//
//    public void setAge(String age) {
//        this.age = age;
//    }
//    public void setName(String name){
//        this.name=name;
//    }
//    public String getName(){
//        return name;
//    }
//    public String getAge(){
//        return age;
//    }
//}

public class student {
    private String name;
    private String age;
    private String id;
    private String addr;
//按下ALT+insert键 会弹出一个窗口可以根据自己的选择功能
    public student() {
    }

    public student(String name, String age, String id, String addr) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.addr = addr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}











