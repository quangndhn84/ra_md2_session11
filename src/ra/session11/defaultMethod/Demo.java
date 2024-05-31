package ra.session11.defaultMethod;

public class Demo {
    public static void main(String[] args) {
        IDefaultMethod demo01 = new Demo1();
        demo01.hello();
        IDefaultMethod demo02 = new Demo2();
        demo02.hello();
    }
}
