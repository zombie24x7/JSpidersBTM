import java.util.Scanner;
public class ArrayFind {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = s.nextInt();
		int k = 0,l=0;
		int a[]=new int[n];
		System.out.println("Enter "+n+" elements");
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++){
			k=0;
			for(int j=i+1;j<n;j++){
				if(a[i]==a[j]){
					l=a[i];
					k++;
				}
				if(k>0)
					break;
					
			}
		}
		System.out.println("The repeated number is "+l);
		s.close();
	}
}