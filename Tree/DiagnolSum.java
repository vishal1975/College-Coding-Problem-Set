package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DiagnolSum {
	 public static ArrayList <Integer> diagonalSum(Node root) 
	    {
	        // code here.
		 ArrayList<Integer> pk=new ArrayList<>();
			
		 Queue<Node> right=new LinkedList<>();
		right.add(root);
		
		while(!right.isEmpty()) {
			
			int t=right.size();
			int sum=0;
			for(int i=0;i<t;i++) {
				
				Node temp=right.poll();
				 sum=sum+temp.data;
				while(temp.right!=null||temp.left!=null) {
					if(temp.left!=null) {
						right.add(temp.left);
						if(temp.right==null){
						    break;
						}
					}
					if(temp.right!=null){
					temp=temp.right;
					sum=sum+temp.data;
					}
					
				}
				
				
			}
			
			pk.add(sum);
			
		}
		return pk;
		
		 
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	class Node{
	    int data;
	    Node left,right;
	    Node(int d){
	        data=d;
	        left=right=null;
	    }
	}
}
