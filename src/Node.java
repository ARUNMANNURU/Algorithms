/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class Node {
	
		Node link;
		int data;
		public Node(){
			link=null;
			data=0;
		}
		public Node(int d,Node n){
			data=d;
			link=n;
		}
		public void setData(int d){
			data=d;
		}
		public void setLink(Node n){
			link=n;
		}
		public int getData(){
			return data;
		}
		public Node getLink(){
			return link;
		}
	
}