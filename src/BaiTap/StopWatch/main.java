package BaiTap.StopWatch;

import java.util.Random;

public class main {
    public static void main(String[] args) {
        int[] arr = new int[100000];
        Random rand = new Random();

        // Khởi tạo mảng với các số ngẫu nhiên
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100000);
        }

        StopWatch stopwatch = new StopWatch();

        // Sắp xếp mảng bằng thuật toán selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        stopwatch.stop();

        System.out.println("Thời gian thực thi của thuật toán sắp xếp chọn cho 100,000 số là: " + stopwatch.getElapsedTime() + " milisecond");
    }
}
