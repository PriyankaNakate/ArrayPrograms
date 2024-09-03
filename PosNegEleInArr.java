class PosNegEleInArr
{
	public static void main(String[] args) {
		int [] arr = {7, -6, 4, -1, 5};
		int positive = 0;
		int negative = 0;
		int zero = 0;
		for(int i : arr){
			if(i<0)
				negative++;
			else if(i>0)
				positive++;
			else
				zero++;
		}
		System.out.println("No of positive ele : "+positive);
		System.out.println("No of negative ele : "+negative);
		System.out.println("No of zero : "+zero);
	}
}