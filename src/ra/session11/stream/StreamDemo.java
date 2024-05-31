package ra.session11.stream;

import ra.session11.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        Student student1 = new Student("SV001", "Nguyễn Văn A", 20);
        Student student2 = new Student("SV002", "Nguyễn Văn C", 18);
        Student student3 = new Student("SV003", "Nguyễn Văn B", 23);
        Student student4 = new Student("SV004", "Nguyễn Văn F", 20);
        Student student5 = new Student("SV005", "Nguyễn Văn E", 20);
        Student student6 = new Student("SV006", "Nguyễn Văn G", 25);

        List<Student> listStudents = new ArrayList<>();
        listStudents.add(student1);
        listStudents.add(student2);
        listStudents.add(student3);
        listStudents.add(student4);
        listStudents.add(student5);
        listStudents.add(student6);
        //1. In ra các sinh viên có tuổi ớn hơn 20
        System.out.println("CÁC SINH VIÊN CÓ TUỔI LỚN HƠN 20");
        listStudents.stream().filter(student -> student.getAge() > 20).forEach(System.out::println);
        //2. In ra các sinh viên từ thứ 2 đến thứ 5
        System.out.println("Các sinh viên từ thứ 2 đến thứ 5:");
        listStudents.stream().skip(1).limit(4).forEach(System.out::println);
        //3. In ra tên các sinh viên
        System.out.println("TÊN CÁC SINH VIÊN:");
        listStudents.stream().map(student -> student.getStudentName()).forEach(System.out::println);
        //4. Sắp xếp các sinh viên theo tuổi tăng dần
        System.out.println("SẮP XẾP SINH VIÊN THEO TUỔI TĂNG DẦN:");
        listStudents.stream().sorted(Comparator.comparing(Student::getAge)).forEach(System.out::println);
        //5. Sắp xếp các sinh viên theo tên giảm dần
        System.out.println("SẮP XẾP SINH VIÊN THEO TÊN GIẢM DẦN:");
        listStudents.stream().sorted(Comparator.comparing(Student::getStudentName).reversed()).forEach(System.out::println);
        //6. Sắp xếp các sinh viên theo tuổi giảm dần, những sinh viên có tuổi bằng nhau thì sắp xếp theo tên tăng dần
        System.out.println("DANH SÁCH SINH VIÊN SAU KHI SẮP XẾP THEO TUỔI VÀ TÊN:");
        listStudents.stream().sorted(Comparator.comparing(Student::getAge).reversed()
                .thenComparing(Student::getStudentName)).forEach(System.out::println);
        //7. Tạo danh sách sinh viên gồm những sinh viên có độ tuổi từ 20-23
        List<Student> listStudentNew = listStudents.stream().filter(student -> student.getAge() >= 20 && student.getAge() <= 23)
                .collect(Collectors.toList());
        System.out.println("DANH SÁCH SINH VIÊN MỚI: ");
        listStudentNew.stream().forEach(System.out::println);
        //8. Kiểm tra trong danh sách sinh viên có sinh viên có tuổi trong khoảng 23 đến 26 không
        boolean check = listStudents.stream().anyMatch(student -> student.getAge() >= 23 && student.getAge() <= 26);
        System.out.println("Kết quả kiểm tra: " + check);
        //9. Đếm số sinh viên có tuổi từ 18 đến 22
        long cntStudent = listStudents.stream().filter(student -> student.getAge() >= 18 && student.getAge() <= 22).count();
        System.out.println("Số sinh viên có tuổi từ 18-22 là: " + cntStudent);
        //10. In ra thông tin sinh viên có tuổi nhỏ nhất
        System.out.println("THÔNG TIN SINH VIÊN CÓ TUỔI NHỎ NHẤT:");
        System.out.println(listStudents.stream().min(Comparator.comparing(Student::getAge)).get());
        //11. Thống kê danh sách sinh viên theo tuổi
        IntSummaryStatistics result = listStudents.stream().mapToInt(student -> student.getAge()).summaryStatistics();
        System.out.println("Tuổi lớn nhất: " + result.getMax());
        System.out.println("Tuổi nhỏ nhất: " + result.getMin());
        System.out.println("Tổng số sinh viên: " + result.getCount());
        System.out.println("Tổng tuổi các sinh viên: " + result.getSum());
        System.out.println("Tuổi trung bình sinh viên: " + result.getAverage());
        //12. Tính tổng tuổi của các sinh viên
        int total = listStudents.stream().map(student -> student.getAge()).reduce(0, (sum, element) -> sum + element);
        System.out.println("Tổng tuổi: " + total);


    }
}
