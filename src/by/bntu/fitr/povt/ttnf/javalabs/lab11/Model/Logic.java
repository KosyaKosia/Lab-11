package by.bntu.fitr.povt.ttnf.javalabs.lab11.Model;

import java.util.Random;

public class Logic {

    //1 task
    public static float sumNegativElement(float[] arr) {
        float sum = 0f;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

    public static float[] InitArra(float[] arr, int min , int max)
    {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = rand.nextFloat()* (max - min)+min;
        }
        return arr;
    }


    public static int foundMin(float[] arr) {
        int indexMin = 0;
        float min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                indexMin = i;
            }
        }
        return indexMin;
    }


    public static int foundMax(float[] arr) {
        int indexMax = 0;
        float max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                indexMax = i;
            }
        }
        return indexMax;
    }

    public static float multiplicationElem(int min, int max, float[] arr) {
        float mul = 1;
        if (max < min) {
            for (int i = max - 1; i < min; i++) {
                mul *= arr[i];
            }
        } else if (max == min) {
            mul = 0;
        } else {
            for (int i = min + 1; i < max; i++) {
                mul *= arr[i];
            }
        }
        return mul;
    }

    //15
    public static int foundNull(float[] arr)
    {
        int countNull = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == 0)
                countNull++;
        }
        return countNull;
    }

    public static float sumElemBeforeMin(float[] arr)
    {
        float sum = 0;
        for (int i = Logic.foundMin(arr) + 1;i < arr.length; i++ )
        {
            sum += arr[i];
        }
        return sum;
    }
}
