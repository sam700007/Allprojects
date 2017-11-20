package com.stairs;

public class PrintStairs {
	
	private static void StairCase(int n) {
	    int k=n;
	    for(int j=0;j<n;j++)
	        {
			       for(int i=n-j;i>0;i--){
			        System.out.print(" ");
			        }
			       for(int l=0;l<=j;l++){
			        System.out.print("*");
			        }
	    System.out.print("\n");
	    }
}
	
	 @SuppressWarnings("unused")
	private static int sum(int[] numbers) {
		 int length=numbers.length;
		 System.out.println("length :"+length);
		 int sum=0;
		 for(int i=1;i<=numbers[0];i++)
		 {
			 sum=sum+numbers[i];
		 }

return sum;
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StairCase(15);
		int[] myArray={5,1,2,3,4,5};
		System.out.println(sum(myArray));

	}

}
