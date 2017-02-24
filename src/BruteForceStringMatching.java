import java.util.Scanner;

/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class BruteForceStringMatching {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
	    
	   	 String T, P, cand;
	   	 int pos, i;
	    
	   	 System.out.print("Enter a text string T: ");
	   	 T = in.nextLine();
	   	 System.out.print("Enter a pattern string P: ");
	   	 P = in.next();
	    
	   //	 System.out.println();
	    
	   	 for ( pos = 0; pos <= T.length() - P.length(); pos++ )
	   	 {
	   	    cand = T.substring( pos, pos+P.length() );  // Try to match this...
	    
	   	    if ( P.equals(cand) )
	   	    {
	   	       System.out.println(T);        // Print the text
	    
	   	       for ( i = 0 ; i < pos; i++ )  // Indent to found position
	   		   System.out.print(" ");

	   	       System.out.println(P);        // Print the pattern below
	   	       System.out.println();
	   	    }
	   	 }
	}

}
