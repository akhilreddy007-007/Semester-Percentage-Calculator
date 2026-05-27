package com.neo.vinny.testt;

import java.util.Scanner;


public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of sems");
		int sem=sc.nextInt();
		if(sem==1)
		{
		Test1 t1 = new Test1();
		t1.disp();
		t1.setData();
		System.exit(0);
		}
		
		if(sem==2)
		{
		Test2 t2 = new Test2();
		t2.disp();
		t2.setData();
		System.exit(0);
		}
		
		if(sem==3)
		{
		Test3 t3 = new Test3();
		t3.disp();
		t3.setData();
		System.exit(0);
		}
		if(sem==4)
		{
		Test4 t4 = new Test4();
		t4.disp();
		t4.setData();
		System.exit(0);
		}
		if(sem==5)
		{
		Test5 t5 = new Test5();
		t5.disp();
		t5.setData();
		System.exit(0);
		}
		if(sem==6)
		{
		Test6 t6 = new Test6();
		t6.disp();
		t6.setData();
		System.exit(0);
		}
		if(sem==7)
		{
		Test7 t7 = new Test7();
		t7.disp();
		t7.setData();
		System.exit(0);
		}
		if(sem==8)
		{
		Test8 t8 = new Test8();
		t8.disp();
		t8.setData();
		System.exit(0);
		}
	}
}
