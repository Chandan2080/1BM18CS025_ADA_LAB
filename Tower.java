import java.util.*;
public class Tower{
	public void solve(int n, String t1, String t2, String t3) {
		if(n==1){
			System.out.println(t1 + " -> " + t3);
		}
		else{
			solve(n-1, t1, t3, t2);
			System.out.println(t1 + " -> " + t3);
			solve(n-1, t2, t1, t3);
		}
	}
	public static void main(String[] args) {
		Tower t = new Tower();
		System.out.print("Enter number of discs:  ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		t.solve(n, "A", "B", "C");
	}
}
