package com.DSA1.Soft;


public class quickSoft extends SortBase {
    public static void main(String[] args) {
        int[] num = new int[] { 5, 4, 8, 6, 3, 9, 0, 1, 7, 2 };
        quickSort(num, 0, num.length - 1);
        print(num);
    }

    public static void quickSort(int[] list, int start, int end) {
        if (end <= start) {
            return;
        }
        int low = start;
        int high = end;
        //low high定前後
        int pivot = list[low];
        //上面定低位住標所在的值
        while (low < high) {
            while (low < high && list[high] >= pivot) {    //當低位座標未超過高位且低位值小於高位值時-----由高向低
                high--;
            }
            list[low] = list[high]; // 將小於 pivot 的值放在低位，這裡會形成交叉
            while (low < high && list[low] <= pivot) {     //-----由低向高
                low++;
            }
            list[high] = list[low]; // 將大於 pivot 的值放在高位
        }
        list[low] = pivot;
        quickSort(list, start, low - 1); // 遞迴左半
        quickSort(list, low + 1, end);  // 遞迴右半
    }

    public static void print(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }



}
