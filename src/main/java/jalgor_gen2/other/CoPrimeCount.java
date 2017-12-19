package jalgor_gen2.other;

import java.io.IOException;
import java.util.Scanner;

public class CoPrimeCount {

    public static void countCoPrime(int[] a) {

	for ( int i = 0; i < a.length; i++)
	    System.out.println(eular(a[i]));
    }

    public static int eular(int num) {
	int inNum = num;
	int resA = 1, resB = inNum;
	

	for (int i = 2; i <= num; i++) {
	    if (num % i == 0) {

		while (num % i == 0)
		    num /= i;
		
		resA *= i - 1 ;
		resB /= i;
	    }
	}

	return resA * resB;
    }

    public static void main(String[] args) throws IOException {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	int[] a = new int[n];
	for (int i = 0; i < n; i++)
	    a[i] = scan.nextInt();
	scan.close();
	
	System.out.println("===== Results =====");
	
	CoPrimeCount.countCoPrime(a);

    }
}
