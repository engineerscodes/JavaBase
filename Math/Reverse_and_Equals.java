// codeforces.com/contest/41/problem/A
// Check string 1 is reverse of string2
import java.util.Scanner;
public class Reverse_and_Equals
{
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.println( in.next().contentEquals(new StringBuilder(in.next()).reverse().toString()) ? "YES" : "NO");
    }
}