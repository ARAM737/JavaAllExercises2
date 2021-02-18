package all.exercise1;

import java.io.IOError;
import java.util.Scanner;
import java.util.function.Predicate;

public class Main1 {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        boolean t = true;
        Scanner in = new Scanner(System.in);
        int a = 0;
        try{
            a = in.nextInt();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                in.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        Predicate<Integer> test = (x) -> {
            if((x > 0) && ((x & (x - 1)) == 0))
                //               System.out.println("YES");
                return true;
            else
//                System.out.println("NO");
                return false;
        };
        System.out.println(test.test(a));
    }
}

