package baaarkingDog.P0x03;

public class ArrayList {

    public int[] arr;
    public int len;

    void insert(int idx, int num) {
        if (idx == 0) {
            for (int i = 0; i < len; i++) {
                arr[i + 1] = arr[i];
            }
        }

        for (int i = 0; i < len; i++) {

        }
    }

    void erase(int idx, int num) {

    }
}
