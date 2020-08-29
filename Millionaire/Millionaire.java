
/*
'Who Wants to Be a Millionaire?' is a commercial TV game show where all the participants can win some money. One of its level is to get the maximum amount from the given three random numbers. You are a 'phone a friend' participant to help your friend in this level.
Develop a java program to find maximum possible amount to help your friend.
Example

If num1 = 45, num2 = 34 and num3 = 7, then the maximum amount possible is 74534

 

Input Format

First input is any valid integer between 1 and 10000 specifying the number1
Second input is any valid integer between 1 and 10000 specifying the number2
Third input is any valid integer between 1 and 10000 specifying the number3
Output Format

Integer value specifying the maximum amount that can be formed by all inputs
Sample Input

23

5

98

Sample output

98523
*/
import java.util.*;
public class Millionaire
{   static  Scanner in=new Scanner(System.in);
    public static void main(String args[])
    {
    
int[] num = new int[3];
int temp = 0;
int temp1 = 0;
int n = 0;

for(int i = 0; i < 3 ; i++)
    num[i]=in.nextInt();
    
int[] s = new int[3];

for(int i = 0 ; i < 3 ; i++)
{
    if(num[i] >= 0 && num[i] < 10)
        s[i] = num[i];

    else if(num[i] >= 10 && num[i] < 100)
        s[i] = num[i]/10;

    else if(num[i] >= 100 && num[i] < 1000)
        s[i] = num[i]/100;
    else
        s[i] = num[i]/1000;
}

for(int j = 2; j > 0 ; j--)
{
    for(int i = 0 ; i < j; i++)
    {
        if(s[i]>s[i+1])
        {
            temp = s[i];
            s[i] = s[i+1];
            s[i+1] = temp;
            
            temp1 = num[i];
            num[i] = num[i+1];
            num[i+1] = temp1;
        }
    }
}
for(int i = 2 ; i >= 0; i--)
{
    System.out.print(num[i]);
}
}
}
    
