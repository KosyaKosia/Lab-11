package by.bntu.fitr.povt.ttnf.javalabs.lab11.View;

import java.util.Scanner;

public class UsersInput {

    private static Scanner in = new Scanner(System.in);

    public static float floatInput()
    {
        return in.nextFloat();
    }

    public static int intInput(String msg)
    {
        System.out.println(msg);
        return in.nextInt();
    }

    public static boolean checkInt()
    {
        return in.hasNextInt();
    }
}
