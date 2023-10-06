package ThucHanh.LopHocSinh;

public class main {
    public static void main(String[] args) {
        StudentClass student1 = new StudentClass(1, "Nguyễn Văn A", true, "JV-01", 19, "Hà Nội");
        StudentClass student2 = new StudentClass(2, "Nguyễn Văn B", false, "JV-02", 26, "Bắc Giang");
        StudentClass student3 = new StudentClass(3, "Nguyễn Văn C", true, "JV-01", 28, "Lào Cai");
        System.out.println("===========Thông tin của student 1================");
        student1.displayStudent();
        System.out.println("===========Thông tin của student 2================");
        student2.displayStudent();
        System.out.println("===========Thông tin của student 3================");
        student3.displayStudent();
    }
}
