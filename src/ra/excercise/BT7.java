package ra.excercise;

import java.util.Scanner;

public class BT7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi:");
        String str = scanner.nextLine();
        int number;
        try {
            number = Integer.parseInt(str);
            System.out.println("Số vừa nhập là: " + number);
        } catch (NumberFormatException ex) {
            //Chuyển đổi các ký tự trong chuỗi ko phải là số sang 0
            String replaceStr = "";
            for (int i = 0; i < str.length(); i++) {
                try {
                    int numberOfStr = Integer.parseInt("" + str.charAt(i));
                    replaceStr += numberOfStr;
                } catch (NumberFormatException nfe) {
                    replaceStr += 0;
                }
            }
            System.out.println("Số vừa nhập là: " + Integer.parseInt(replaceStr));
        }
    }
}
