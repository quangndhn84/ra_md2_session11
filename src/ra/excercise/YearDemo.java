package ra.excercise;

import java.util.Date;

public class YearDemo {
    public static void main(String[] args) {
        Date now = new Date();
        int year = now.getYear();//Số năm tính từ 1/1/1900
        System.out.println("Số năm: "+year);
        System.out.println("Năm hiện tại: "+(year+1900));
    }
}
