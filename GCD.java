import java.util.*;
class GCD{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 'm' and 'n' values:   ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		System.out.print("The GCD of "+m+" and "+n+" is:  "+euclid(m,n));
	}
	public static int euclid(int m, int n){
		int rem;
		while(n!=0){
			rem = m%n;
			m=n;
			n=rem;
		}
		return m;
	}
}

