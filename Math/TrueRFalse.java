// codeforces.com/problemset/problem/61/A
// input:
// 1010100
// 0100101
// output:
// 1110001

// input:
// 000
// 111
// output:
// 111

import java.util.*;
public class TrueRFalse 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        String a = in.next(); String b = in.next();
        for(int i = 0; i < a.length(); i++)
            System.out.print(a.charAt(i) != b.charAt(i) ? 1 : 0);
            // or
            // System.out.print((a.charAt(i))^(b.charAt(i)));
    	}
}