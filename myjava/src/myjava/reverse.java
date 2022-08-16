package myjava;

import java.util.Scanner;
 class reverse {
 public static void main(String args[])
 {
	 int a,r=0;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter numbers:");
	 a=sc.nextInt();
	 while
	 (a>0)
	 {
	  r=r*10+a%10;
		 a=a/10;
	 }
	 System.out.print("reversed number:"+r);
		 
	 
 }
}

