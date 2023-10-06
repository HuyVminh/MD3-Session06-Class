public class Student {
    // Fields - Thuộc tính
    String studentName;
    int age;
    boolean gender;
    String phoneNumber;
    String address;


    // Constructors - Khởi tạo
    Student(String studentName, int age, boolean gender) {
        this.studentName = studentName;
        this.age = age;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    void setAddress(String address) {
        this.address = address;
    }

    public String getStudentName() {
        return studentName;
    }

    void displayBasicInfo() {
        System.out.println(this.studentName);
        System.out.println(this.age);
        System.out.println(this.gender);
        System.out.println(this.address);
    }

    @Override
    public String toString() {
        return "Tên: " + this.studentName + ", tuổi : " + this.age + ", giới tính : " + (this.gender ? "Nam" : "Nữ");
    }
}
