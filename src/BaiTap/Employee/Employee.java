package BaiTap.Employee;

import java.util.Scanner;

public class Employee {
    private int employeeId;
    private String employeeName;
    private int age;
    private String gender;
    private double rate;
    private double salary;

    static int count = 1;

    public Employee() {
        this.employeeId = count++;
    }

    public Employee(String employeeName, int age, String gender, double rate, double salary) {
        this.employeeId = count++;
        this.employeeName = employeeName;
        this.age = age;
        this.gender = gender;
        this.rate = rate;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mã nhân viên :" + employeeId);
        System.out.print("Nhập tên nhân viên: ");
        employeeName = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        age = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập giới tính: ");
        gender = scanner.nextLine();
        System.out.print("Nhập hệ số lương: ");
        rate = scanner.nextDouble();
    }

    // Phương thức hiển thị thông tin nhân viên
    public void displayData() {
        System.out.println("Mã nhân viên: " + employeeId);
        System.out.println("Tên nhân viên: " + employeeName);
        System.out.println("Tuổi: " + age);
        System.out.println("Giới tính: " + gender);
        System.out.println("Hệ số lương: " + rate);
        System.out.println("Lương: " + calSalary());
    }

    // Phương thức tính lương nhân viên
    public double calSalary() {
        return salary = rate * 1300000;
    }
}
