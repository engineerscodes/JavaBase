// Soldier and Bananas
// codeforces.com/problemset/problem/546/A
// A soldier wants to buy w bananas in the shop. He has to pay k dollars for the first banana, 2k dollars for the second one and so on (in other words, he has to pay i·k dollars for the i-th banana).

// He has n dollars. How many dollars does he have to borrow from his friend soldier to buy w bananas?
// The first line contains three positive integers k, n, w 

import java.util.Scanner;
public class Soldier_and_Bananas
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int n = in.nextInt();
        int w = in.nextInt();
        int sum = 0;
        for(int i = 1; i <= w; i++)
            sum += i * k;
        System.out.println(sum - n < 0 ? 0 : sum - n);
    }
}