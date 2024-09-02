import java.util.*;
class Print3DArray
{
	public static void main(String[] args) {
		int [][][] arr = {{{1,2},{2,3}},{{4,5},{5,6}}};
		System.out.println("Using for loop: ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				for(int k=0;k<arr[i][j].length;k++)
				{
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}

		System.out.println("Using foreach loop : ");
		for(int i[][] : arr){
			for(int j[] : i){
				for(int k : j){
					System.out.print(k+" ");
				}
				System.out.println();
			}
			System.out.println();
		}

		System.out.println("Using while loop : ");
		int i=0;
		while(i<arr.length){
			int j=0;
			while(j<arr[i].length){
				int k=0;
				while(k<arr[i][j].length){
					System.out.print(arr[i][j][k]+" ");
					k++;
				}
				j++;
			}System.out.println();
			i++;
		}System.out.println();

		System.out.println("Using do while loop : ");
		i=0;
		do{
			int j=0;
			do{
				int k = 0;
				do{
					System.out.print(arr[i][j][k]+" ");
					k++;
				}while(k<arr[i][j].length);
				j++;System.out.println();

			}while(j<arr[i].length);
			i++;System.out.println();
		}while(i<arr.length);

		System.out.println();
		System.out.println("Using deeepToString() : ");
		System.out.println(Arrays.deepToString(arr));
	}
}