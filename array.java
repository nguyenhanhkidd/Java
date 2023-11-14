import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int[] score = {1,2,3,4,5};
    

        for (int i = 0; i < score.length; i++){
            System.out.println(score[i]);
        }
    }
}

/*
 * 1. Cộng các phần tử trong mảng
 * 2. Kiểm tra mảng đối xứng
 * ví dụ. mảng a = {1,2,3,2,1} => mảng đối xứng
 *        mảng b = {1,2,3,2,5} => mảng b không đối xứng
 * 3. in ra phần tử có số lần xuất hiện nhiều nhất trong mảng
 * ví dụ. mảng a = {1,1,5,2,4,2,1} => phần tử 1 có số lần xuất hiện nhiều nhất: 3 lần
 * 4. Sắp xếp mảng theo thứ tự tăng dần.
 * ví dụ. input: mảng a = {1,3,2,8,4}
 *        output: mảng a = {1,2,3,4,8}
 */