package test;

import java.util.Scanner;

public class Test1 
{
	Scanner sc = new Scanner(System.in);
	String s[] = new String[10];
	int total=0;
	int total_score;
	float a,b;
public void disp() {
		
		System.out.println("enter grades of 1st sem");
		for (int i=0;i<s.length;i++)
		{
			s[i]=sc.next();
		}
									
		for (String k : s)
		{
		if (k.equals("a"))
		{
		total = total + 10;
		continue;
		}
		else if (k.equals("b"))
		{
		total = total + 20;
		continue;
		}
		else if (k.equals("c"))
		{
		total = total + 30;
		continue;
		}
		else if (k.equals("d"))
		{
		total = total + 40;
		continue;
		}
		else if (k.equals("e"))
		{
		total = total + 50;
		continue;
		}
		}
	}

	public void setData()
	{
	//	int total=tot;
		 total_score=1000;
		 a=total_score-total;
		int total_subjects=10;
		 b=a/total_subjects;
//System.out.println(total);
		System.out.println("your total marks for 1000 in 1st sem is "+a);
		System.out.println("1st sem percentage is "+b+"%");
}

}
	

