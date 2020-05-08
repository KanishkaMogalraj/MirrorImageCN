import java.util.*;
public class Solution {


	public static void main(String[] args) {
		
		int i=1;
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n>=0 && n<=50)
        {
        while(i<=n)
        {
      int   j=1,spaces=1;
            
            while(spaces<=n-i)
            {
                System.out.print(" ");
                spaces++;
            }
            while(j<=i)
            {
                System.out.print(j);
                j++;
            }
            
            
            
            i++;
            System.out.println();
        }
        }
		
	}

}
