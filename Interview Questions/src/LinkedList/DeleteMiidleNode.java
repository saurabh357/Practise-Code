package LinkedList;

public class DeleteMiidleNode {
	
//	 Node deleteMid(Node head)
//	    {
//	        if (head == null) return null;
//	        
//	        if (head.next == null)
//	            return null;
//	        
//	        Node prev = null;
//	        Node slow_ptr = head;
//	        Node fast_ptr = head;
//	        
//	        while (fast_ptr != null && fast_ptr.next != null)
//	        {
//	            fast_ptr = fast_ptr.next.next;
//	            // fast pointer moves 2 nodes ahead everytime loop is run 
//	            
//	            prev = slow_ptr;
//	            // updating prev, prev holds previous value of slow pointer
//	            
//	            slow_ptr = slow_ptr.next;
//	            // slow pointer moves 1 node ahead everytime loop is run
//	        }
//	        
//	        // since slow pointer was moving at half speed, it points at
//	        // mid node when fast pointer reaches the end
//	        prev.next = slow_ptr.next; // bypassing mid node
//	        
//	        return head;
//	    }
	public static void main(String[] args) {
	System.out.println();	
	}

}
