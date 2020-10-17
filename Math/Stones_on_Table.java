// Stones on the Table
// codeforces.com/problemset/problem/266/A
// There are n stones on the table in a row, each of them can be red, green or blue. Count the minimum number of stones to take from the table so that any two neighboring stones had different colors. Stones in a row are considered neighboring if there are no other stones between them.
// input:
// 3
// RRG
// output:
// 1

// input:
// 5
// RRRRR
// output:
// 4

// input:
// 4
// BRBG
// output:
// 0

import java.util.Scanner;
public class Stones_on_Table 
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str = in.next();
        int count = 0;
        for(int i = 1; i < n; i++)
            if(str.charAt(i) == str.charAt(i-1))
                count++;
        System.out.println(count);
    }
}