package BaiTap.Employee;

import java.util.Scanner;

public class Main {
    private static final int MAX_EMPLOYEE = 100;
    private static final Employee[] employees = new Employee[MAX_EMPLOYEE];
    private static int numEmployees = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice != 5) {
            System.out.println("===== QUẢN LÝ NHÂN VIÊN =====");
            System.out.println("1. Hiển thị danh sách tất cả nhân viên");
            System.out.println("2. Thêm nhân viên mới");
            System.out.println("3. Sửa thông tin nhân viên");
            System.out.println("4. Xóa nhân viên");
            System.out.println("5. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    displayAllEmployees();
                    break;
                case 2:
                    addNewEmployee();
                    break;
                case 3:
                    updateEmployeeInformation();
                    break;
                case 4:
                    deleteEmployee();
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

    public static void displayAllEmployees() {
        if (numEmployees == 0) {
            System.out.println("Không có nhân viên nào trong danh sách");
        } else {
            System.out.println("DANH SÁCH NHÂN VIÊN");
            for (int i = 0; i < numEmployees; i++) {
                employees[i].displayData();
                System.out.println("---------------------------------------------------");
            }
        }
    }

    public static void addNewEmployee() {
        if (numEmployees == MAX_EMPLOYEE) {
            System.out.println("Không thể thêm mới nhân viên vì đã đạt giới hạn 100 nhân viên.");
        } else {
            Employee newEmployee = new Employee();
            newEmployee.inputData();
            employees[numEmployees] = newEmployee;
            numEmployees++;
            System.out.println("Đã thêm nhân viên thành công");
        }
    }

    public static void updateEmployeeInformation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ID nhân viên cần cập nhật :");
        int id = scanner.nextInt();
        boolean check = false;
        for (int i = 0; i < numEmployees; i++) {
            if (employees[i].getEmployeeId() == id) {
                employees[i].inputData();
                System.out.println("Thông tin nhân viên cập nhật thành công");
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy thông tin nhân viên.");
        }
    }

    public static void deleteEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ID nhân viên muốn xóa: ");
        int id = scanner.nextInt();
        boolean check = false;
        for (int i = 0; i < numEmployees; i++) {
            if (employees[i].getEmployeeId() == id) {
                for (int j = i; j < numEmployees - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                numEmployees--;
                System.out.println("Xóa nhân viên thành công");
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy thông tin nhân viên");
        }
    }
}
