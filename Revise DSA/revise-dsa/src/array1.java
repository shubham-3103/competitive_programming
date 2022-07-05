import java.util.ArrayList;

public class array1 { 
	static int [] newarr;
	static int[] insertion(int [] arr, int value) {
		newarr = new int [arr.length+1];
		int n = arr.length;
		for(int i=0;i<n;i++) {
			newarr[i]=arr[i];
		}
		newarr[n]=value;
		
		return newarr;
	}
	
	static void deletion(int [] arr) {
		int n = arr.length;
		for(int i=0;i<n-1;i++) {
		System.out.print(newarr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("After insertion: ");
		int [] arr = {2,4,6,7,2,5,9};
		insertion(arr, 10);
		for(int i =0; i<newarr.length;i++) {
			System.out.print(newarr[i]+" ");
		}
		System.out.println();
		System.out.print("After deletion: ");
		deletion(arr);
		
	}

}
