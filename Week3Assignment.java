package weeklyassignment;

public class Week3Assignment {
	
	static boolean isSorted(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				return false;
			}	
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Question 1 - Second Smallest Element in an array
		int[] arr = {4,2,7,2,9,1};
		int small = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<small) {
				small = arr[i];
			}
		}
		int secondsmallest = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=small && arr[i]<secondsmallest) {
				secondsmallest = arr[i];
			}
		}
		if(secondsmallest==Integer.MAX_VALUE) {
			System.out.println("No second smallest element(all are same)");
		}
		else {
			System.out.println("Second smallest element:" + secondsmallest);
		}	
		
		// Question 2 - Array is sorted or not
		int[] a = {1,3,4,2};
		System.out.println(isSorted(a));
		
		// Question 3 - Move all zeros to end without an extra array
		int[] b = {1,0,3,0,5};
		int position = 0;
		for(int i=0;i<b.length;i++) {
			if(b[i]!=0) {
				int temp = b[i];
				b[i] = b[position];
				b[position] = temp;
				position++;
			}
		}
		for(int num:b) {
			System.out.print(num + " ");
		}

	}

}
