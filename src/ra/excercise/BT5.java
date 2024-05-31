package ra.excercise;

import java.util.Scanner;

public class BT5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi: ");
        String str = scanner.nextLine();
        System.out.println("Chuỗi đảo ngược:");
        //C1: Duyệt và in các ký tự từ cuối lên
        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.printf("%c",str.charAt(i));
        }
        System.out.printf("\n");
        //C2: Sử dụng StringBuilder
        StringBuilder strBuilder = new StringBuilder(str);
        strBuilder.reverse();
        System.out.println("Chuỗi đảo ngược là: "+strBuilder);
    }
}
