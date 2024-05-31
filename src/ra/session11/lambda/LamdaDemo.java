package ra.session11.lambda;

public class LamdaDemo {
    public static void main(String[] args) {
        IFunctionInterface if1 = new IFunctionInterface() {
            @Override
            public int addTwoNumber(int firstNumber, int secondNumber) {
                return firstNumber + secondNumber;
            }
        };
        System.out.println("Tổng 2 số 5 và 10 là: " + if1.addTwoNumber(5, 10));
        //Sử dụng biểu thức lamda
        IFunctionInterface if2 = (int a, int b) -> {
            return a + b;
        };
        System.out.println("Tổng 2 số 3 và 6 là: " + if2.addTwoNumber(3, 6));
        IFunctionInterface if3 = (a, b) -> a + b;
        System.out.println("Tổng 2 số 10 và 20 là: " + if3.addTwoNumber(10, 20));
    }
}
