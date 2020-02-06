import java.util.*;
class Biny1{
	static void binarysearch(int arr[], int start, int end, int key)
	{
    	int mid;
	    while(start <= end)
   		{
       		mid = (start+end)/2;
       		if(arr[mid] == key)
       		{
           		int left = mid;
           		int right = mid;
           		while(arr[left] == key)
           		{
               		left--;
           		}
           		left++;
           		while(arr[right] == key)
           		{
               		right++;
           		}
           		right--;
           		System.out.println("The key is found from index "+left+" to index "+right);
           		System.out.println("The count of the key is "+(right-left+1));
           		return;
       		}
       		else if(arr[mid] > key)
           		binarysearch(arr, start, mid - 1, key);
       		else    
           		binarysearch(arr, mid + 1, end, key);
   		}
   		if(start > end)
   		{
       		System.out.println("Key not found!");
       		return;
   		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements:   ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter "+n+" elements");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the elemen to search");
		int ele = sc.nextInt();
		binarysearch(arr, 0, n-1,ele);
	}
}
