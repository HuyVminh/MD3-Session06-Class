package QuanLyThuVien;

import java.util.Scanner;

public class Main {

    static final Book[] books = new Book[100];
    static int numBook = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice != 9) {
            System.out.println("===== QUẢN LÝ SÁCH =====");
            System.out.println("1. Hiển thị danh sách tất cả sách");
            System.out.println("2. Thêm sách mới");
            System.out.println("3. Sửa thông tin sách");
            System.out.println("4. Xóa sách");
            System.out.println("5. Sắp xếp sách theo lợi nhuận tăng dần");
            System.out.println("6. Tìm kiếm tương đối sách theo tên hoặc mô tả");
            System.out.println("7. Nhập sản phẩm :");
            System.out.println("8. Bán sản phẩm :");
            System.out.println("9. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    displayAllBooks(scanner);
                    break;
                case 2:
                    addNewBook(scanner);
                    break;
                case 3:
                    updateBook(scanner);
                    break;
                case 4:
                    deleteBook(scanner);
                    break;
                case 5:
                    sortList(scanner);
                    break;
                case 6:
                    searchBook(scanner);
                    break;
                case 7:
                    importProduct(scanner);
                    break;
                case 8:
                    sellProduct(scanner);
                    break;
                case 9:
                    System.out.println("Đang thoát chương trình...");
                    break;
                default:
                    System.out.println("Không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        }
    }

    private static void displayAllBooks(Scanner scanner) {
        if (numBook == 0) {
            System.out.println("Không có sách");
            return;
        }
        System.out.println("=========Danh sách==============");
        for (int i = 0; i < numBook; i++) {
            books[i].displayData();
            System.out.println("-------------------------");
        }
    }

    private static void addNewBook(Scanner scanner) {
        System.out.print("Nhập số lượng sách muốn thêm mới : ");
        int numToAdd = scanner.nextInt();
        if (numBook + numToAdd > 100) {
            System.out.println("Không thể thêm hơn " + 100 + " cuốn sách.");
            return;
        }
        for (int i = 0; i < numToAdd; i++) {
            System.out.println("Nhập thông tin của cuốn sách #" + (i + 1) + ":");
            Book book = new Book();
            book.inputData();
            books[numBook++] = book;
        }
    }

    private static void updateBook(Scanner scanner) {
        System.out.println("Nhập ID sách cần cập nhật :");
        int idUpdate = scanner.nextInt();
        boolean check = false;
        for (int i = 0; i < numBook; i++) {
            if (books[i].getBookId() == idUpdate) {
                books[i].inputData();
                System.out.println("Thông tin sách đã được cập nhật thành công");
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy sách cần cập nhật");
        }
    }

    private static void deleteBook(Scanner scanner) {
        System.out.println("Nhập ID sách cần xóa :");
        int idDel = scanner.nextInt();
        boolean check = false;
        for (int i = 0; i < numBook; i++) {
            if (books[i].getBookId() == idDel) {
                for (int j = i; j < numBook - 1; j++) {
                    books[j] = books[j + 1];
                }
                numBook--;
                System.out.println("Xóa sách thành công");
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy sách cần xóa");
        }
    }

    private static void sortList(Scanner scanner) {
        if (numBook == 0) {
            System.out.println("Thư viện chưa có sách nào.");
        } else {
            for (int i = 0; i < numBook - 1; i++) {
                for (int j = i + 1; j < numBook; j++) {
                    if (books[i].getInterest() > books[j].getInterest()) {
                        Book temp = books[i];
                        books[i] = books[j];
                        books[j] = temp;
                    }
                }
            }
            System.out.println("Đã sắp xếp sách theo lợi nhuận tăng dần.");
        }
    }

    private static void searchBook(Scanner scanner) {
        System.out.print("Nhập từ khóa tìm kiếm: ");
        String keyword = scanner.nextLine().trim().toLowerCase();

        boolean found = false;
        for (int i = 0; i < numBook; i++) {
            Book book = books[i];
            if (book.getBookName().toLowerCase().contains(keyword) || book.getDescriptions().toLowerCase().contains(keyword)) {
                if (!found) {
                    System.out.println("Kết quả tìm kiếm:");
                    found = true;
                }
                System.out.println(book);
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sách nào phù hợp với từ khóa tìm kiếm.");
        }
    }

    public static void importProduct(Scanner scanner) {
        System.out.print("Nhập mã sản phẩm cần nhập: ");
        int bookId = scanner.nextInt();
        scanner.nextLine(); // consume the newline character

        int bookIndex = findBookIndexById(bookId);
        if (bookIndex == -1) {
            System.out.println("Không tìm thấy sách có mã " + bookId);
        } else {
            Book book = books[bookIndex];
            System.out.print("Nhập số lượng sách cần nhập: ");
            int quantity = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            book.setQuantity(book.getQuantity() + quantity);
            System.out.println("Đã nhập " + quantity + " sách có mã " + bookId + " vào kho.");
        }
    }

    public static void sellProduct(Scanner scanner) {
        System.out.print("Nhập tên sách cần bán: ");
        String nameBook = scanner.nextLine().trim();

        int bookIndex = findBookIndexByName(nameBook);
        if (bookIndex == -1) {
            System.out.println("Không tìm thấy sách có tên " + nameBook);
        } else {
            Book book = books[bookIndex];
            System.out.print("Nhập số lượng sách cần bán: ");
            int quantity = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            if (book.getQuantity() < quantity) {
                System.out.println("Số lượng sách trong kho không đủ để bán.");
            } else {
                book.setQuantity(book.getQuantity() - quantity);
                System.out.println("Đã bán " + quantity + " sách có tên " + nameBook + ".");
            }
        }
    }

    public static int findBookIndexById(int bookId) {
        for (int i = 0; i < numBook; i++) {
            if (books[i].getBookId() == bookId) {
                return i;
            }
        }
        return -1;
    }

    public static int findBookIndexByName(String bookName) {
        for (int i = 0; i < numBook; i++) {
            if (books[i].getBookName().equalsIgnoreCase(bookName)) {
                return i;
            }
        }
        return -1;
    }
}


