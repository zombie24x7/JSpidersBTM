
import java.util.Scanner;
public class Problem3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//System.out.println("Enter the size");
		int n = 6;
		int a[]=new int[n];
		int b[]=new int[n];
		System.out.println("Enter "+n+" numbers for 1st array");
		
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		
		System.out.println("Enter "+n+" numbers for 2st array");
		
		for(int i=0;i<n;i++){
			b[i]=s.nextInt();
		}
		
		s.close();
		
		repeatNumber(a,b);
	}

	public static void repeatNumber(int[] a,int[] b) {
		int d;
		for(int i=0;i<a.length;i++){
			d=0;
			for(int j=0;j<b.length;j++){
				if(a[i]==b[j])
					d=1;
			}
			if(d==1)
				System.out.println(a[i]);
			
		}
		
		
	}
		
	

}
