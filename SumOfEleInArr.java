class SumOfEleInArr{
	public static void main(String[] args) {
		int [] arr = {2,2,4,4,6,6};
		int sum=0;
		for(int i : arr){
			sum+=i;
		}
		System.out.println("Sum of an array : "+sum);
	}
}