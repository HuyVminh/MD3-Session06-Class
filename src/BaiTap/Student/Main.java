package BaiTap.Student;

import java.util.Scanner;

public class Main {
    private static final int MAX_STUDENTS = 100;
    private static final Student[] students = new Student[MAX_STUDENTS];
    private static int numStudents = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice != 5) {
            System.out.println("===== QUẢN LÝ SINH VIÊN =====");
            System.out.println("1. Hiển thị danh sách tất cả sinh viên");
            System.out.println("2. Thêm sinh viên mới");
            System.out.println("3. Sửa thông tin sinh viên");
            System.out.println("4. Xóa sinh viên");
            System.out.println("5. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            switch (choice) {
                case 1:
                    displayAllStudents();
                    break;
                case 2:
                    addNewStudent();
                    break;
                case 3:
                    updateStudentInformation();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    System.out.println("Đang thoát chương trình...");
                    break;
                default:
                    System.out.println("Không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        }
    }

    private static void displayAllStudents() {
        if (numStudents == 0) {
            System.out.println("Không có sinh viên nào");
        } else {
            System.out.println("===== Danh sách sinh viên =====");
            for (int i = 0; i < numStudents; i++) {
                students[i].displayData();
                System.out.println("-----------------------------");
            }
        }
    }

    private static void addNewStudent() {
        if (numStudents == MAX_STUDENTS) {
            System.out.println("Không thể thêm sinh viên mới. Số lượng sinh viên đã tối đa");
        } else {
            Student newStudent = new Student();
            newStudent.inputData();
            students[numStudents] = newStudent;
            numStudents++;
            System.out.println("Đã thêm sinh viên thành công");
        }
    }

    private static void updateStudentInformation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ID sinh viên cần cập nhật: ");
        String id = scanner.nextLine();
        boolean found = false;
        for (int i = 0; i < numStudents; i++) {
            if (students[i].getId().equals(id)) {
                students[i].inputData();
                System.out.println("Thông tin sinh viên đã được cập nhật thành công.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy thông tin sinh viên.");
        }
    }

    private static void deleteStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ID sinh viên muốn xóa: ");
        String id = scanner.nextLine();
        boolean found = false;
        for (int i = 0; i < numStudents; i++) {
            if (students[i].getId().equals(id)) {
                for (int j = i; j < numStudents - 1; j++) {
                    students[j] = students[j + 1];
                }
                numStudents--;
                System.out.println("Xóa sinh viên thành công.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sinh viên.");
        }
    }
}

