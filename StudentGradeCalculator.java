package codsoft;

import java.util.Scanner;

public class StudentGradeCalculator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int eng,math,physics;
		System.out.println("Enter marks obtained in English: ");
		while(true)
		{
		    eng=s.nextInt();
		    if(eng>=0 && eng<=100)
		    	break;
		    else
		    	System.out.println("Entered marks are invalid,Please enter again");
		}
		System.out.println("Enter marks obtained in Mathematics: ");
		while(true)
		{
			math=s.nextInt();
			if(math>=0 && math<=100)
				break;
			else
				System.out.println("Entered marks are invalid,Please enter again");
		}
		System.out.println("Enter marks obtained in Physics: ");
		while(true)
		{
			physics=s.nextInt();
			if(physics>=0 && physics<=100)
				break;
			else
				System.out.println("Entered marks are invalid,Please enter again");
		}
		int sum=eng+math+physics;
		double avgPercentage=sum/3;
		String grade;
		if(avgPercentage>=91)
			grade="O";
		else if(avgPercentage>=81 && avgPercentage<=90)
			grade="A+";
		else if(avgPercentage>=71 && avgPercentage<=80)
			grade="A";
		else if(avgPercentage>=61 && avgPercentage<=70)
			grade="B+";
		else if(avgPercentage>=51 && avgPercentage<=60)
			grade="B";
		else if(avgPercentage>=41 && avgPercentage<=50)
			grade="C+";
		else if(avgPercentage>=26 && avgPercentage<=40)
			grade="C";
		else
			grade="F";
		
		System.out.println("Student total marks: "+sum);
		System.out.println("Student average percentage: "+avgPercentage);
		System.out.println("Student grade: "+grade);
			
	}

}
