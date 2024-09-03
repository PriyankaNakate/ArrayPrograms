class PrimeEleInArr
{
	public static void main(String[] args) {
		int [] arr = {2,8,5,4,7,9};
		for(int i : arr){
			isPrime(i);
		}
	}

	public static void isPrime(int i){
		boolean flag = true;
			for(int j=2;j<=i/2;j++){
				if(i%j==0){
					flag = false;
					break;
				}
			}
		if(flag==true){
			System.out.print(i+" ");
		}
	}
}