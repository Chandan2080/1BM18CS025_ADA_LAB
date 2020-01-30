import java.util.*;
class search1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of Test Cases:   ");
		int t = sc.nextInt();
		int i=0;
		int n, ele, res;
		int arr[];
		while(i<t){
			System.out.print("TEST CASE "+(i+1)+":\n");
			System.out.print("Enter the number of elements and the element to find:");
			n = sc.nextInt();
			ele = sc.nextInt();
			arr = new int[n];
			System.out.print("Enter the elements in the array:\t");
			for(int j=0; j<n; j++){
				arr[j] = sc.nextInt();
			}
			res = search(arr,ele);
			System.out.print("\n"+res+"\n");
			i++; 
		}
	}
	static int search(int arr[], int ele){
		int l = 0, r = arr.length - 1; 
        while (l <= r){ 
            int m = l + (r - l) / 2; 
  			if (arr[m] == ele) 
                return 1; 
  			if (arr[m] < ele) 
                l = m + 1; 
  			else
                r = m - 1; 
        }
        return -1;
   	}
}
