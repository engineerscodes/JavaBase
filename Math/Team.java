// One day three best friends Petya, Vasya and Tonya decided to form a team and take part in programming contests. Participants are usually offered several problems during programming contests. Long before the start the friends decided that they will implement a problem if at least two of them are sure about the solution. Otherwise, the friends won't write the problem's solution.

// This contest offers n problems to the participants. For each problem we know, which friend is sure about the solution. Help the friends find the number of problems for which they will write a solution.

// input:
// 3        --> no of inputs
// 1 1 0
// 1 1 1
// 1 0 0
// output:
// 2

// input:
// 2       --> no of inputs
// 1 0 0
// 0 1 1
// output:
// 1

import java.util.*;
public class Team
{
    public static void main(String... args)
    {
        Scanner in= new Scanner(System.in);

        int n = in.nextInt(), sum = 0;
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i< n; i++)
        {
        stack.push(in.nextInt());
        stack.push(in.nextInt());
        stack.push(in.nextInt());

        if(stack.elementAt(0)+ stack.elementAt(1)+stack.elementAt(2) >= 2)
        
        sum++;
        stack.clear();    
        }
        System.out.print(sum);
    }
}