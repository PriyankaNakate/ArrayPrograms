class EvenEleInArr{
	public static void main(String[] args) {
		int [] arr = {2,8,5,7,4,9};
		for(int i : arr){
			if(i%2==0){
				System.out.print(i+" ");
			}
		}
	}
}