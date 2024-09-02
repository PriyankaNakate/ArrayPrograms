class LengthOfArray
{
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6};
		int length = 0;
		for(int i: arr){
			length++;
		}
		System.out.println("Length of array : "+length);

		System.out.print("Using length method : ");
		System.out.println(arr.length);
	}
}