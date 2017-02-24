/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class Stack {

	/**
	 * @param args
	 */
		
			int top;
			int maxSize;
			long[] stackArray;
			public Stack(int s){
				top=-1;
				maxSize=s;
				stackArray = new long[maxSize];
			}
			public void push(int data){
				stackArray[++top] = data;
			}
			public long pop(){
				return stackArray[top--];
			}
			public long peek(){
				return stackArray[top];
			}
			public boolean isEmpty(){
				return (top == -1);
			}
			public boolean isFull(){
				
				return (top == maxSize-1);
				
			}
			public static void main(String[] args) {
				// TODO Auto-generated method stub
			
				Stack stack = new Stack(10);
				stack.push(20);
				stack.push(30);
				stack.push(50);
				stack.push(40);
				while(!stack.isEmpty()){
					long value = stack.pop();
					System.out.println(value+" ");
				}
				System.out.println(" ");
			}

	}
