package weeklyassignment;

public class Week2Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Question 1 - Fibonacci Series
		int n = 15;
		int first = 0;
		int second = 1;
		System.out.print("Fibonacci series: " + first + " " + second);
		for(int i=3;i<=n;i++) {
			int count = first + second;
			if(count>100) {
				break;
			}
			System.out.print(" " + count);
			first = second;
			second = count;
		}
		
		// Question 2 - Unique Prime factors of a number
		int num = 60;
		System.out.print("\nUnique Prime Factors of number " + num + ":");
		for(int i=2;i<=num;i++) {
			if(num%i==0) {
				int Prime = 0;
				for(int j=2;j<=i/2;j++) {
					if(i%j==0) {
						Prime = 1;
						break;
					}
				}
				if(Prime==0) {
					System.out.print(" " + i);
					while(num%i==0) {
						num = num/i;
					}
				}
			}
		}
		
		// Question 3 - Digit Transformation Logic
		int n1 = 57243;
		int result = 0;
		int placevalue = 1;
		int position = 1;
		while(n1>0) {
			int digit = n1%10;
			if(position%2==1) {
				if(digit<=4) {
					digit = digit*2;
				}
			}
			else {
				digit = 1;
			}
			result = digit*placevalue+result;
			n1 = n1/10;
			position++;
			placevalue = placevalue*10;
		}
		System.out.print("\nOutput:" + result);			
	}

}
