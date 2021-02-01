package Stacks_And_Queues;
import java.util.*;
public class Valid_Parethesis {
	 public int minAddToMakeValid(String s) {
	        
	        int count=0;
	        Stack<Character> pk=new  Stack<Character>();
	        
	        for(int i=0;i<s.length();i++){
	            char t=s.charAt(i);
	            if(t=='('){
	                pk.add(t);
	            }
	            else if(t==')'){
	                if(!pk.isEmpty()){
	                if(pk.peek()=='('){
	                    
	                }
	                }
	            }
	        }
	        
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
