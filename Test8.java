package com.neo.vinny.testt;

import java.util.Scanner;

public class Test8 extends Test7{
	Scanner sc = new Scanner(System.in);
	int total2 = 0;
	float result;
	public void disp() {
		super.disp();
				Scanner sc = new Scanner(System.in);
				String t[] = new String[10];

				System.out.println("enter grades for 8th sem");

				for(int i=0;i<t.length;i++)
				{
					t[i]=sc.next();
				}

				for (String l : t)
				{
				if (l.equals("a"))
				{
				total2 = total2 + 10;
				continue;
				}
				else if (l.equals("b"))
				{
				total2= total2+ 20;
				continue;
				}
				else if (l.equals("c"))
				{
				total2= total2 + 30;
				continue;
				}
				else if (l.equals("d"))
				{
				total2= total2+ 40;
				continue;
				}
				else if (l.equals("e"))
				{
				total2= total2+ 50;
				continue;
				}
				}
	}

				public void setData() {
					super.setData();
					int total_score=1000;
					float a1=total_score-total2;
					int total_subjects=10;
					float b=a1/total_subjects;
				
				
			 result = (super.result+b)/2;
				
//			System.out.println("your total marks for 1000 in 1 is "+a1);
				
			
			System.out.println("your total marks for 1000 in 8th sem is "+a1);
			System.out.println("3rd sem percentage is "+b+"%");
			System.out.println("percentage of 1st & 2nd & 3rd & 4th & 5th & 6th & 7th & 8th sem is "+result+"%");
			
			}

		
}
