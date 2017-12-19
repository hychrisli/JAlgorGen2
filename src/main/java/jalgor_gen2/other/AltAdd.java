package jalgor_gen2.other;

import java.io.IOException;
import java.util.Scanner;

public class AltAdd {

    
    public static boolean isPossible(int x1, int y1, int x2, int y2) {
	if (x1 > x2 || y1 > y2)
	    return false;
	
	if (x1 == x2 && y1 == y2)
	    return true;
	
	if(isPossible(x1 + y1, y1, x2, y2))
	    return true;
	
	if(isPossible(x1, x1 + y1, x2, y2))
	    return true;
	
	return false;
    }
    
    
    public static void main (String[] args) throws IOException {
	
	Scanner scan = new Scanner(System.in);
	int x1 = scan.nextInt();
	int y1 = scan.nextInt();
	int x2 = scan.nextInt();
	int y2 = scan.nextInt();
	scan.close();
	
	System.out.println(AltAdd.isPossible(x1, y1, x2, y2));

    }
    
}
