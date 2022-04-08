package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] intList = new int[100];
        Random rand = new Random();
        for (int i = 0; i < intList.length; i++) {
            intList[i] = rand.nextInt(1000) + 1;
        }
        mergeSort(intList, 0, intList.length);
    }

    public void merge(int[] list, int lowIndex, int highIndex, int midIndex) {
        int[] temp = new int[list.length];
        int pos1 = lowIndex;
        int pos2 = midIndex + 1;
        int spot = lowIndex;
        while (!(pos1 > midIndex && pos2 > highIndex)) {
            if (!(pos1 > mid) || (!(pos2 > highIndex) && (pos1 < pos2))) {
                temp[spot] = pos2;
                spot++;
            } else {
                temp[spot] = pos1;
                spot++;
            }
        }
    }

    public void mergeSort(int[] list, int lowIndex, int highIndex) {
        if (!(lowIndex == highIndex)) {
            int midIndex = (lowIndex + highIndex) / 2;
            mergeSort(list, lowIndex, midIndex);
            mergeSort(list, midIndex + 1, highIndex);
            merge(list, lowIndex, highIndex, midIndex);
        }
    }
}
