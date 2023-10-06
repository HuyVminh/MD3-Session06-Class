package ThucHanh.LopHocSinh;

public class StudentClass {
    //Fields
    int studentId;
    String studentName;
    boolean gender;
    String className;
    int age;
    String address;

    //Constructors
    public StudentClass() {

    }

    public StudentClass(int studentId, String studentName, boolean gender, String className, int age, String address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.gender = gender;
        this.className = className;
        this.age = age;
        this.address = address;
    }

    public void displayStudent() {
        System.out.println("Mã học sinh : " + studentId);
        System.out.println("Tên học sinh : " + studentName);
        System.out.println("Tuổi : " + age);
        System.out.println("Giới tính : " + (gender ? "Nam" : "Nữ"));
        System.out.println("Lớp : " + className);
        System.out.println("Địa chỉ : " + address);
    }
}
