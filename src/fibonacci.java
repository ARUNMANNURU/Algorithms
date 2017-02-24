/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fibonacci f = new fibonacci();
		f.fibonacci(5);
	}
	public int fibonacci(int n){
		int a=1,b=1;
			for(int i=3;i<=n;i++){
				 int c = a+b;
				 a=b;
				 b=c;
				 System.out.println(c);
			}
			return b;
	}


}
