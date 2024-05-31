package ra.excercise;

import java.util.Scanner;

public class BT9 {
    public static void main(String[] args) {
        //15 và 9-->6 và 9-->6 và 3-->3 và 3
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số thứ nhất:");
        int firstNumber = inputNumber(scanner);
        System.out.println("Nhập vào số thứ hai:");
        int secondNumber = inputNumber(scanner);
        if (firstNumber == 0 && secondNumber == 0) {
            System.err.println("Không tìm được ước chung lớn nhất của 2 số");
        } else {
            while (firstNumber != secondNumber) {
                if (firstNumber > secondNumber) {
                    firstNumber = firstNumber - secondNumber;
                } else {
                    secondNumber = secondNumber - firstNumber;
                }
            }
            System.out.println("Ước chung lớn nhất của 2 số là: " + firstNumber);
        }
    }

    public static int inputNumber(Scanner scanner) {
        do {
            try {
                int number = Integer.parseInt(scanner.nextLine());
                return number;
            } catch (NumberFormatException nfe) {
                System.err.println("Dữ liệu nhập phải là số nguyên, vui lòng nhập lại");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } while (true);
    }
}
