package Algorithem;

public class ArmStrongNo {

	public static void main(String[] args) {
		int n = 371;
		int temp = n;
		int r, sum=0 ;

		
		while(n > 0) {
			r=n%10;
			n=n/10;
			sum=sum + r*r*r;
			
		}
		if(temp==sum) {
			System.out.println
			 ("this is arm strong no.");
		}
		else {
			System.out.println("This is not ArmStrong no.");
		}
	}

}
