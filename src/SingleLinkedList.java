/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class SingleLinkedList {


		/*
			insert();
			remove();
			insertAt();
			removeAt();
			size();
			isEmpty();
		*/
	
		protected Node start;
		protected Node end;
		protected int size;
		public SingleLinkedList(){
			start =null;
			end=null;
			size=0;
		}
		public boolean isEmpty(){
			return	start == null;
		}
		public int getSize(){
			return size;
		}
		public void insert(int data){
			Node ptr = new Node(data,null);
			size++;
			if(start == null){
				start = ptr;
				end=start;
			}else{
				ptr.setLink(start);
				start=ptr;
				}
		}
		
		public void display()
	    {
	        System.out.print("\nSingly Linked List = ");
	        if (size == 0) 
	        {
	            System.out.print("empty\n");
	            return;
	        }    
	        if (start.getLink() == null) 
	        {
	            System.out.println(start.getData() );
	            return;
	        }
	        Node ptr = start;
	        System.out.print(start.getData()+ "->");
	        ptr = start.getLink();
	        while (ptr.getLink() != null)
	        {
	            System.out.print(ptr.getData()+ "->");
	            ptr = ptr.getLink();
	        }
	        System.out.print(ptr.getData()+ "\n");
	    }
		
}

		