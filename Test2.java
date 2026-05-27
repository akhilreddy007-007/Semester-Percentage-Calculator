package com.neo.vinny.testt;

import java.util.Scanner;

public class Test2 extends Test1 
{
	Scanner sc = new Scanner(System.in);
	float result;
	int total2 = 0;
	public void disp() {
		super.disp();
		
//		System.out.println("enter grades for 2nd sem");
		
				Scanner sc = new Scanner(System.in);
				String t[] = new String[10];
//				int total2 = 0;
				//int []a = new int[2];
//				float average1,average2;
				System.out.println("enter grades for 2nd sem");

				for(int i=0;i<t.length;i++)
				{
					t[i]=sc.next();
				}
				
//				int total_score=1000;
//				 int a1=total_score-total1;
//				int total_subjects=10;
//				 average1=a1/total_subjects;
				
				//float result =average[0]+average[1]/2;
				
				
//			System.out.println(total);
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
				
				
			result = (super.b+b)/2;
				
//			System.out.println("your total marks for 1000 in 1 is "+a1);
				
			
			System.out.println("your total marks for 1000 in 2nd sem is "+a1);
			System.out.println("2nd sem percentage is "+b+"%");
			System.out.println("percentage of 1st & 2nd sem is "+result+"%");
			
			}

		}
	

