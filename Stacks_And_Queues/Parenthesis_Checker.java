package Stacks_And_Queues;
import java.util.*;
public class Parenthesis_Checker {
	
	 static boolean ispar(String x)
	    {
	        // add your code here
	        Stack<Character> pk=new Stack<>();
	        for(int i=0;i<x.length();i++){
	            char t=x.charAt(i);
	            
	            if(t=='['||t=='{'||t=='('){
	                pk.add(t);
	            }
	            else{
	                if(pk.isEmpty()){
	                    return false;
	                }
	                else if(reverse(pk.peek())==t){
	                    pk.pop();
	                }
	                else{
	                    return false;
	                }
	                
	            }
	            
	            
	        }
	        if(pk.isEmpty())
	        return true;
	        return false;
	    }
	    
	    public static char reverse(char c){
	        switch(c){
	            
	            case '[':return ']';
	            case '{':return '}';
	            case '(':return ')';
	            default:return '0';
	        }
	    }
	    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		

	}

}
