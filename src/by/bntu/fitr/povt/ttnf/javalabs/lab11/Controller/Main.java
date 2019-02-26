// 1 and 15 task

package by.bntu.fitr.povt.ttnf.javalabs.lab11.Controller;

import by.bntu.fitr.povt.ttnf.javalabs.lab11.Model.Logic;
import by.bntu.fitr.povt.ttnf.javalabs.lab11.View.Print;
import by.bntu.fitr.povt.ttnf.javalabs.lab11.View.UsersInput;

public class Main {
    public static void main(String[] args) {

        Print.print("How do you want to fill the array?\n" +
                "1. Manually\n" +
                "2.Random");
        int answer = UsersInput.intInput("Your answer: ");

        int countElem = UsersInput.intInput("How much elements in your array?");

        float array[] = new float[countElem];

        if (((answer != 1) & (answer != 2)) || (answer == 1)) {

            Print.print("Fill your array:");
            for (int i = 0; i < array.length; i++) {
                array[i] = UsersInput.floatInput();
            }
        }
        else {
            int minRandomNum = UsersInput.intInput("Input min your random range");
            if (!UsersInput.checkInt())
            {
                Print.print("It's not number! Default value min = -10");
                minRandomNum = -10;
            }
            int maxRandomNum = UsersInput.intInput("Input max your random range");
            if (!UsersInput.checkInt())
            {
                Print.print("It's not number! Default value max = 10");
                minRandomNum = 10;
            }
            array = Logic.InitArra(array, minRandomNum, maxRandomNum);
        }

        float negativeSum = Logic.sumNegativElement(array);
        Print.print("Summary negative element: " + negativeSum);

        int min = Logic.foundMin(array);
        int max = Logic.foundMax(array);

        float mult = Logic.multiplicationElem(min, max, array);

        Print.print("Multiplication elements between min and max: " + mult);

        int countNull = Logic.foundNull(array);
        Print.print("Count null in the array: " + countNull);

        float sumElemBeforeMin = Logic.sumElemBeforeMin(array);
        Print.print("Summary before min: " + sumElemBeforeMin);


    }
}
