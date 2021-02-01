package Stacks_And_Queues;
import java.util.*;
public class Maximun_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int max=0;
		Stack<Integer> pk=new Stack<>();
		
		for(int i=0;i<n;i++) {
			
			int a=sc.nextInt();
			if(a==1) {
				int no=sc.nextInt();
				pk.add(no);
				if(no>max) {
					max=no;
				}
			}
			else if(a==2) {
				
				int t=pk.pop();
				if(max==t) {
					max=find_max(pk);
				}
			}
			
			else {
				System.out.println(max);
			}
			
		}
		
	}
	public static int find_max(Stack<Integer> pk) {
		Iterator<Integer> iterator=pk.iterator();
		int max=0;
		while(iterator.hasNext()){
			int t=iterator.next();
			if(t>max) {
				max=t;
			}
		}
		return max;
	}

}
