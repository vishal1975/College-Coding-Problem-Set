package linked_list;

import java.util.*;

public class Segregate_even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++) {
			
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int j=0;j<n;j++) {
				a[j]=sc.nextInt();
			}
			int even=0;
			

			
			int b[]=new int[n];
			
			//Queue<Integer> pk= (Queue<Integer>) new LinkedList();
			Queue<Integer> pk=new java.util.LinkedList<>();
			for(int j=0;j<n;j++) {
				if(a[j]%2==0) {
					b[even]=a[j];
					even++;
				}
				else {
					pk.add(a[j]);
				}
				
			}
			for(int j=even;j<n;j++) {
				a[j]=pk.poll();
			}
			for(int j=0;j<n;j++) {
				System.out.print(a[j]+" ");
			}
			System.out.println();
		}
		
		

	}
	
	

}
