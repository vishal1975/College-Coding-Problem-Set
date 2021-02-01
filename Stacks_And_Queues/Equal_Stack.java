package Stacks_And_Queues;
import java.util.*;
public class Equal_Stack {
	public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
	    // Write your code here

	      int sum1=0;
	      int sum2=0;
	      int sum3=0;
	      ArrayList<Integer> on=( ArrayList<Integer>)h1;
	      ArrayList<Integer> tw=( ArrayList<Integer>)h2;
	      ArrayList<Integer> th=( ArrayList<Integer>)h3;
	      
	      Stack<Integer> pk=new Stack<>();
	      Stack<Integer> ll=new Stack<>();
	      Stack<Integer> pp=new Stack<>();
	   
	    for(int i=on.size()-1;i>=0;i--){
	        sum1+=on.get(i);
	        pk.add(on.get(i));
	    }
	    for(int i=tw.size()-1;i>=0;i--){
	        sum2+=tw.get(i);
	        ll.add(tw.get(i));
	    }
	     for(int i=th.size()-1;i>=0;i--){
	        sum3+=th.get(i);
	        pp.add(th.get(i));
	    }
	     
	      if(check(sum1,sum2,sum3)){
	          return sum1;
	      }
	      while(!check(sum1,sum2,sum3)){
	          int t=max(sum1,sum2,sum3);
	          if(t==1){
	              sum1=sum1-pk.pop();
	          }
	         else if(t==2){
	              sum2=sum2-ll.pop();
	          }
	         else if(t==3){
	              sum3=sum3-pp.pop();
	          }
	           if(check(sum1,sum2,sum3)){
	          break;
	      }
	      }
	      return sum3;
	      
	    }
	    
	    public static boolean check(int sum1,int sum2,int sum3){
	        if(sum1==sum2&&sum2==sum3){
	            return true;
	        }
	        return false;
	    }
	    public static int max(int sum1,int sum2,int sum3){
	        int max=Math.max(sum1,sum2);
	        max=Math.max(max,sum3);
	        if(max==sum1){
	            return 1;
	            
	        }
	        if(max==sum2){
	            return 2;
	        }
	        else
	            return 3;
	        
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
