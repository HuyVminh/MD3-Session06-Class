package BaiTap.Student;

import java.util.Scanner;

public class Student {
    private String id;
    private String name;
    private int age;
    private String gender;
    private String address;
    private String phoneNumber;

    public Student() {
    }

    public Student(String id, String name, int age, String gender, String address, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student ID: ");
        id = scanner.nextLine();
        System.out.print("Enter student name: ");
        name = scanner.nextLine();
        System.out.print("Enter student age: ");
        age = scanner.nextInt();
        scanner.nextLine(); // consume the newline character
        System.out.print("Enter student gender: ");
        gender = scanner.nextLine();
        System.out.print("Enter student address: ");
        address = scanner.nextLine();
        System.out.print("Enter student phone number: ");
        phoneNumber = scanner.nextLine();
    }

    public void displayData() {
        System.out.println("Student ID: " + id);
        System.out.println("Student name: " + name);
        System.out.println("Student age: " + age);
        System.out.println("Student gender: " + gender);
        System.out.println("Student address: " + address);
        System.out.println("Student phone number: " + phoneNumber);
        System.out.println("=======================================");
    }
}
