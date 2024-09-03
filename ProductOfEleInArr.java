import java.util.*;
class ProductOfEleInArr
{
	public static void main(String[] args) {
		int [] arr = {2,2,4,4,6,6};
		int  product = 1;
		for(int i : arr){
			product*=i;
		}
		System.out.println("Product Of arr is  : "+product);
	}
}