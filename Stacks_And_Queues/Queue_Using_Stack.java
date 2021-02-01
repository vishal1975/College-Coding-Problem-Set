package Stacks_And_Queues;
import java.util.*;
public class Queue_Using_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            Stack<Long> a=new Stack<>();
            Stack<Long> b=new Stack<>();
            long x=-1;
            for(int i=0;i<t;i++) {
            	int n=sc.nextInt();
            	
            	if(n==1) {
            		long no=sc.nextLong();
            		a.add(no);
            		
            	}
            	if(b.isEmpty()) {
            		exchange(a,b);
            	}
            	if(!b.isEmpty()) {
            	if(n==2) {
            		b.pop();
            	}
            	if(n==3) {
            	System.out.println(b.peek());
            	}
            	}
            }
	}
	
	public static void exchange(Stack<Long> a,Stack<Long> b) {
		while(!a.isEmpty()) {
			b.add(a.pop());
		}
		

	}

}
