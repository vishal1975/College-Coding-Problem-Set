package linked_list;

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Node
{
 int data;
 Node next;
 Node(int key)
 {
     data = key;
     next = null;
 }
}

class Driverclass
{
 public static void main (String[] args) 
 {
     Scanner sc= new Scanner(System.in);
     int t = sc.nextInt();
     
     while(t-- > 0)
     {
         int n = sc.nextInt();
         Node head = new Node(sc.nextInt());
         Node tail = head;
         while(n-- > 1){
		        tail.next = new Node(sc.nextInt());
		        tail = tail.next;
		    }
		   
		      head = new LinkedList().segregate(head);
		     printList(head);
		    System.out.println();
     }
 }
 
 public static void printList(Node head)
 {
     if(head == null)
        return;
        
     Node temp = head;
     while(temp != null)
     {
         System.out.print(temp.data + " ");
         temp = temp.next;
     }
 }
 
 
}



//} Driver Code Ends


//User function Template for Java

/*
class Node
{
 int data;
 Node next;
 Node(int data)
 {
     this.data = data;
     next = null;
 }
}
*/
class LinkedList
{
 static Node segregate(Node head)
 {
     
     // 1st Approach
     // add your code here
     // Node head1=null;
     // Node head2=null;
     // Node head3=null;
     // Node temp1=null;
     // Node temp2=null;
     // Node temp3=null;
     // while(head!=null){
     //     if(head.data==0){
     //         if(head1==null){
     //             head1=head;
     //             temp1=head;
     //         }
     //         else{
     //             temp1.next=head;
     //             temp1=temp1.next;
     //         }
             
     //     }
         
         
     //     else if(head.data==1){
     //         if(head2==null){
     //             head2=head;
     //             temp2=head;
     //         }
     //         else{
     //             temp2.next=head;
     //             temp2=temp2.next;
     //         }
             
     //     }
         
         
         
     //     else{
     //         if(head3==null){
     //             head3=head;
     //             temp3=head;
     //         }
     //         else{
     //             temp3.next=head;
     //             temp3=temp3.next;
     //         }
             
     //     }
         
     //     head=head.next;
     // }
     
     // if(temp1!=null){
     //     if(head2!=null){
         
     //     temp1.next=head2;
         
     //     if(head3!=null){
     //         temp2.next=head3;
             
     //     }
         
     //     }
         
     //     else{
     //          if(head3!=null){
     //         temp1.next=head3;
             
     //     }
             
             
     //     }
     //     return head1;
         
     // }
     
     // else if(temp2!=null){
         
     //     if(head3!=null){
     //         temp2.next=head3;
             
     //     }
     //     return head2;
         
     // }
     
     // else{
     //     return head3;
     // }
     
     // 2nd approach
     
     
     int count[]=new int[3];
     Node ptr=head;
     while(ptr!=null){
         count[ptr.data]+=1;
         ptr=ptr.next;
         
     }
     
     ptr=head;
     int i=0;
     while(ptr!=null){
         if(count[i]==0){
            
            i++;
         }
         else{
             ptr.data=i;
             count[i]-=1;
             ptr=ptr.next;
         }
         
     }
     
     //Set<Integer> ll=new HashSet<>();
     //ll.
     Queue<Integer> pk= (Queue<Integer>) new LinkedList();
     //pk.p
//     Queue<Integer> q 
//     = new LinkedList<>();
     Set<Integer> ll=new HashSet<Integer>();
//     ll.contains(o);
     return head;
     
 }
 
 
 
}


