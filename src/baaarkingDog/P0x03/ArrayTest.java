package baaarkingDog.P0x03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Test test = new Test(sc.nextInt());

        test.insert(0, 1);
        test.insert(1, 2);
        test.insert(1, 100);
        test.insert(2, 3);
        test.insert(3, 4);
        System.out.println(Arrays.toString(test.arr));

        test.erase(0);
        System.out.println(Arrays.toString(test.arr));
        System.out.println(test.size);

        test.erase(1);
        System.out.println(Arrays.toString(test.arr));
        System.out.println(test.size);


        test.erase(2);
        System.out.println(Arrays.toString(test.arr));
        System.out.println(test.size);


        test.erase(3);
        System.out.println(Arrays.toString(test.arr));
        System.out.println(test.size);


    }

    static class Test {
        private Object[] arr;
        private int size;
        private int capacity;

        Test(int capacity) {
            arr = new Object[capacity];
            size = 0;
            this.capacity = capacity;
        }

        void insert(int idx, int num) {
            if (size == capacity) {
                throw new RuntimeException("용량 초과");
            }

            if (idx == (arr.length - 1)) {
                arr[idx] = num;
                size++;
            } else {
                for (int i = size; i > idx; i--) {
                    arr[i] = arr[i - 1];
                }
                arr[idx] = num;
                size++;
            }
        }

        void erase(int idx) {
            if (size == 0) {
                throw new RuntimeException("배열이 비어있습니다.");
            }

            if (idx == (arr.length - 1)) {
                arr[idx] = null;
                size--;
            } else {
                for (int i = idx + 1; i < size; i++) {
                    arr[i - 1] = arr[i];
                }
                arr[size - 1] = null;
                size--;
            }
        }
    }
}
