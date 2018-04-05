import java.util.Scanner;

public class Sorting {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++){
			arr[i]=s.nextInt();
		}
		
		int[] array = frequecySortArray(arr);
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
	}

	private static int[] frequecySortArray(int[] arr) {
		int[] a = new int[arr.length];
		int b=0;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length-1;j++){
				if(arr[i]==arr[j]){
					b=arr[i];
				}
			}
		}
		a[0]=a[1]=b;
		System.out.println(b);
	    int n = arr.length;
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
		int z=2;
		for(int i=0;i<arr.length;i++){
			if(b!=arr[i]){
				a[z]=arr[i];
				z++;
			}
		}
		
		return a;
	}
}
