package ra.session11.methodReference;

import ra.session11.Student;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Student student1 = new Student("SV001", "Nguyễn Văn A", 20);
        Student student2 = new Student("SV002", "Nguyễn Văn C", 18);
        Student student3 = new Student("SV003", "Nguyễn Văn B", 23);
        List<Student> listStudents = new ArrayList<>();
        listStudents.add(student1);
        listStudents.add(student2);
        listStudents.add(student3);
        //In ra thông tin các sinh viên
        //C1. Dùng foreach để duyệt và in thông tin
        System.out.println("SỬ DỤNG FOREACH DUYỆT VÀ IN THÔNG TIN: ");
        for (Student student : listStudents) {
            System.out.println(student);
        }
        //C2. Sử dụng foreach của list để duyệt và in thông tin
        System.out.println("SỬ DỤNG FOREACH CỦA LIST DUYỆT VÀ IN THÔNG TIN: ");
        listStudents.forEach(student -> System.out.println(student));

        //In ra thông tin sinh viên có tuổi lớn 20
        System.out.println("THÔNG TIN SINH VIÊN CÓ TUỔI LỚN HƠN 20: ");
        listStudents.stream().filter(student -> student.getAge()>20).forEach(System.out::println);

    }
}
