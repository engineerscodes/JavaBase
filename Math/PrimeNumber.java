import java.util.*;
public class PrimeNumber 
{
	public static void main(String[] args) 
	{
        Scanner in = new  Scanner(System.in);
		int n = in.nextInt();
		for(int i = 1;  i <= n;  i++)
		{
			int flag = 0;
		    for (int j = 2; j <= i/2; j++)
		    {
		    	if( i % j == 0)
		    	{
		    		flag++;
		    		break;
		    	}
		    }
		    if(flag == 0 && i != 1 )
		    	System.out.println(i);
		}
	}
}