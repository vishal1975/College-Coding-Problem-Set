package Stacks_And_Queues;
import java.util.*;
public class Evaluate_Postfix {
	public static int evaluatePostFix(String S){
		Stack<Integer> pk=new Stack<>();
		int sum=0;
        for(int i=0;i<S.length();i++) {
       // if(Character.isDigit(S.charAt(i))) {
        	if(type(S.charAt(i))==5) {
        	pk.add(S.charAt(i)-'0');
        }
        else if(type(S.charAt(i))==1) {
        	sum=pk.pop()+pk.pop();
        	pk.add(sum);
        }
        else if(type(S.charAt(i))==2) {
        	int a=pk.pop();
        	int b=pk.pop();
        	
        	sum=b-a;
        	pk.add(sum);
        }
        else if(type(S.charAt(i))==3) {
        	int a=pk.pop();
        	int b=pk.pop();
        	
        	sum=b*a;
        	pk.add(sum);
        }
        else if(type(S.charAt(i))==4) {
        	int a=pk.pop();
        	int b=pk.pop();
        	
        	sum=b/a;
        	pk.add(sum);
        }
        	
        }
		return pk.pop();
    }
	
	public static int type(char c) {
		
		switch(c) {
		
		case '+':return 1;
		case '-':return 2;
		case '*':return 3;
		case '/':return 4;
		default:return 5;
		
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          System.out.println(evaluatePostFix("231*+9-"));
	}

}
