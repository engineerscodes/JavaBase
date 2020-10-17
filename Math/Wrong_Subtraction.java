// odeforces.com/problemset/problem/977/A
// Little girl Tanya is learning how to decrease a number by one, but she does it wrong with a number consisting of two or more digits. Tanya subtracts one from a number by the following algorithm:

// if the last digit of the number is non-zero, she decreases the number by one;
// if the last digit of the number is zero, she divides the number by 10 (i.e. removes the last digit).
// You are given an integer number n. Tanya will subtract one from it k times. Your task is to print the result after all k subtractions.

// It is guaranteed that the result will be positive integer number.
import java.util.*;
public class Wrong_Subtraction
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int n = in.nextInt();

        for(int i = 0; i < n; i++)
        {
            if(num % 10 != 0)
                num -= 1;
            else
                num /= 10;
        }
        System.out.println(num);
}
}