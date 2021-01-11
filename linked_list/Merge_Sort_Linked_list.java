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
		   
		      head = new LinkedList().mergeSort(head);
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
 Node(int key)
 {
     this.data = key;
     next = null;
 }
} */

class LinkedList
{
 static Node mergeSort(Node head)
 {
     // add your code here
     if(head==null){
        
     }
     
     Node tail=getlast(head);
     
     return mergesort_util(head,tail);
     
 }
 
 
 static Node mergesort_util(Node head,Node tail){
     
     if(head==tail){
        Node node=new Node(head.data);
         return node;
     }
     Node mid=getmid(head,tail);
    Node left= mergesort_util(head,mid);
    Node right=mergesort_util(mid.next,tail);
    Node sort= merge(left,right);
     return sort;
     
 }
 
 static Node merge(Node head1,Node head2){
     
     Node newhead=null;
     Node temp3=null;
     Node temp1=head1;
    
    Node temp2=head2;
  
    
    
     while(temp1!=null&&temp2!=null){
         
         if(temp1.data<=temp2.data){
             
             if(newhead==null){
                 newhead=temp1;
                 temp3=temp1;
             }
             else{
                 temp3.next=temp1;
                 temp3=temp3.next;
             }
             temp1=temp1.next;
         }
         
         else{
             
             if(newhead==null){
                 newhead=temp2;
                 temp3=temp2;
             }
             else{
                 temp3.next=temp2;
                 temp3=temp3.next;
             }
             temp2=temp2.next;
             
             
             
             
         }
         
     }
     
     
     while(temp1!=null){
          temp3.next=temp1;
                 temp3=temp3.next;
             temp1=temp1.next;
         
         
     }
     
      while(temp2!=null){
          temp3.next=temp2;
                 temp3=temp3.next;
             temp2=temp2.next;
         
         
     }
     
     return newhead;
     
 }
 
 
 static Node getlast(Node head){
     
     Node temp=head;
     while(temp.next!=null){
         
         temp=temp.next;
         
     }
     return temp;
 }
 
 static Node getmid(Node head,Node tail){
     
     // if(head.next==null){
     //     return head;
     // }
     
     Node temp1=head;
     Node temp2=head;
     while(temp2!=tail&&temp2.next!=tail){
         temp2=temp2.next.next;
         temp1=temp1.next;
         
     }
     return temp1;
     
     
 }
}


