package Stacks_And_Queues;
import java.util.*;
public class Next_Greatest {
	 public int[] nextGreaterElement(int[] nums1, int[] nums2) {
	        
	        HashMap<Integer,Integer> pk=new   HashMap<Integer,Integer>();
	        Stack<Integer> ll=new Stack<>();
	        int n=nums2.length;
	        for(int i=n-1;i>=0;i--){
	            pk.put(nums2[i], great(ll,nums2[i]));
	        }
	        for(int i=0;i<nums1.length;i++){
	            nums1[i]=pk.get(nums1[i]);
	        }
	        return nums1;
	        
	    }
	    
	    public int great(Stack<Integer> ll,int k){
	        while(!ll.isEmpty()){
	            int t=ll.peek();
	            if(t>k){
	                ll.add(k);
	                return t;
	            }
	            else{
	                ll.pop();
	            }
	        }
	        ll.add(k);
	        return -1;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
