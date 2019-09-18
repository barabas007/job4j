package ru.job4j.array;

public class FindLoop {

    public int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    public int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.

        for (int index = start; index != finish; index++) {
            if (data[index] == el) {

                rst = index;

                break;
            }

        }
        return rst;
    }

    public int[]sort(int[] data) {

        for (int left = 0; left < data.length; left++) {
            int minIndex = left;
            for (int right = left + 1; right < data.length; right++) {
                if (data[right] < data[minIndex]) {
                    minIndex = right;
                }
            }
            if (minIndex != left) {
                int temp = data[left];
                data[left] = data[minIndex];
                data[minIndex] = temp;
            }
        }
        return data;
    }
}