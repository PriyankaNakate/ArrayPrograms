class OddEleInArr
{
	public static void main(String[] args) {
		int [] arr = {2,8,5,4,7,9};
		for(int i : arr){
			if(i%2==1){
				System.out.print(i+" ");
			}
		}
	}
}