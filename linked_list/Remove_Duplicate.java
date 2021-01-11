package linked_list;

//{ Driver Code Starts
/* package whatever; // don't place package name! */
import java.util.*;
class Node
{
 int data;
 Node next;
 Node(int d) {
     data = d; 
     next = null;
 }
}

class Remove_Duplicate_From_LL
{
 Node head;  
 Node temp;
	public void addToTheLast(Node node) 
	{

	  if (head == null) 
	  {
	    head = node;
	    temp = node;
	  }
	  else{
	      temp.next = node;
	      temp = node;
	  }
	}

   void printList()
 {
     Node temp = head;
     while (temp != null)
     {
        System.out.print(temp.data+" ");
        temp = temp.next;
     }  
     System.out.println();
 }
	
	/* Drier program to test above functions */
	public static void main(String args[])
 {
    
     
     /* Constructed Linked List is 1->2->3->4->5->6->
        7->8->8->9->null */
      Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		  
		 while(t>0)
      {
			int n = sc.nextInt();
			Remove_Duplicate_From_LL llist = new Remove_Duplicate_From_LL();
			int a1=sc.nextInt();
			Node head= new Node(a1);
         llist.addToTheLast(head);
         for (int i = 1; i < n; i++) 
			{
				int a = sc.nextInt(); 
				llist.addToTheLast(new Node(a));
			}
		//llist.printList();	
     GfG g = new GfG();
		llist.head = g.removeDuplicates(llist.head);
		llist.printList();
		
     t--;		
     }
 }
}
//} Driver Code Ends


/* The structure of linked list is the following
class Node
{
 int data;
 Node next;
 Node(int d) {
     data = d; 
     next = null;
 }
}
*/

class GfG
{
 // Function to remove duplicates from the given linked list
 public Node removeDuplicates(Node head) 
 {
      // Your code here
      
      Node temp=head;
      Queue<Integer> pk=(Queue<Integer>)new LinkedList();
      
      while(temp!=null){
          pk.add(temp.data);
          temp=temp.next;
          
      }
      
      temp=head;
      Set<Integer> ll=new HashSet<Integer>();
      int s=pk.poll();
      temp.data=s;
      ll.add(s);
      while(!pk.isEmpty()){
          int t=pk.poll();
          if(!ll.contains(t)){
              temp.next.data=t;
              temp=temp.next;
              ll.add(t);
              
          }
          
      }
     // temp=null;
      if(temp!=null){
          temp.next=null;
      }
      return head;
      
 }
}
