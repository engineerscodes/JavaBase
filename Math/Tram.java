// codeforces.com/problemset/problem/116/A
// Linear Kingdom has exactly one tram line. It has n stops, numbered from 1 to n in the order of tram's movement. At the i-th stop a i passengers exit the tram, while b i passengers enter it. The tram is empty before it arrives at the first stop. Also, when the tram arrives at the last stop, all passengers exit so that it becomes empty.

// Your task is to calculate the tram's minimum capacity such that the number of people inside the tram at any time never exceeds this capacity. Note that at each stop all exiting passengers exit before any entering passenger enters the tram.

// input:
// 4
// 0 3
// 2 5
// 4 2
// 4 0

// output:
// 6
import java.util.*;
public class Tram
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = 0, count = 0;
        for(int i = 0 ; i < n; i++)
        {
            int l = p;
            int a = in.nextInt();
            int b = in.nextInt();
            p = (l - a) + b;
            if(count < p)
            {
                count = p;
            }
        }
        System.out.println(count);
}
}