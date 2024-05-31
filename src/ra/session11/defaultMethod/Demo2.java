package ra.session11.defaultMethod;

public class Demo2 implements IDefaultMethod {
    //Ghi đè phương thức default
    @Override
    public void hello() {
        System.out.println("Xin chào Rikkei Academy");
    }
}
