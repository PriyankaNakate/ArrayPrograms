import java.util.*;
class Print1DArray
{
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		System.out.println("Using for loop : ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Using foreach loop : ");
		for(int i : arr){
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Using while loop : ");
		int i=0;
		while(i<arr.length){
			System.out.print(arr[i]+" ");
			i++;
		}
		System.out.println();
		System.out.println("Using do while loop : ");
		i=0;
		do{
			System.out.print(arr[i]+" ");
			i++;
		}while(i<arr.length);
		System.out.println();
		System.out.println("Using toString() : ");
		System.out.println(Arrays.toString(arr));
	}
}