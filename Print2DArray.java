import java.util.*;
class Print2DArray
{
	public static void main(String[] args) {
		int arr[][] = {{1,2,3},{4,5,6}};
		System.out.println("Using for loop : ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
		}

		System.out.println();
		System.out.println("Using foreach loop : ");
		for(int i[] : arr){
			for(int j : i)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("Using while loop : ");
		int i=0;
		while(i<arr.length){
			int j=0;
			while(j<arr[i].length){
				System.out.print(arr[i][j]+" ");
				j++;
			}
			i++;
			System.out.println();
		}

		System.out.println();
		System.out.println("Using do while loop : ");
		i=0;
		do{
			int j=0;
			do{
				System.out.print(arr[i][j]);
				j++;
			}while(j<arr[i].length);
			i++;
			System.out.println();
		}while(i<arr.length);

		System.out.println();
		System.out.println("Using toString() : ");
		System.out.println(Arrays.deepToString(arr));
	}
}