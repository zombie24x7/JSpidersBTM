import java.util.Scanner;
public class DiamondDiagonalNumberStar
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int n = sc.nextInt();
		int sp = n/2, st=1,i; 
		for(i=1;i<=n;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print("  ");
			}
			int k = 1;
			
			for(int j=1;j<=st;j++)
			{	
				
				if(j%2==0)
					System.out.print("* ");
				else 
					System.out.print(k++ +" ");
			}
			System.out.println();
			if(i<=n/2)
			{
				sp=sp-1;
				st=st+2;
			}
			else
			{
				sp=sp+1;
				st=st-2;
			}
		}
	}
}
		