import java.util.Scanner;
public class Problem2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//System.out.println("Enter the size");
		int n = 7;
		int a[]=new int[n];
		System.out.println("Enter "+n+" numbers");
		
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		
		System.out.println("Enter the number you want to search");
		int se=s.nextInt();
		
		s.close();
		
		repeat(a,se);
	}

	public static void repeat(int[] a,int se) {
		int c=0;
		for(int i=0;i<a.length;i++){
			if(se==a[i])
				c++;
		}
		
		System.out.println(se+" occured "+c+" times");
	}
		
	

}
