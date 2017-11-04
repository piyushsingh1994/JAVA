import java.util.Scanner;

public class singh {
	public static void main(String [] args) {
		int marks;
		char grade;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("enter the marks");
		
		marks=input.nextInt();
		if(marks>=80)
		{
			grade='A';
		}
		else if(marks>=70)
		{
			grade='B';
		}
		else if(marks>=60)
		{
			grade='C';
		}
		else if(marks>=40)
		{
			grade='D';
		}
		else
		{
			grade='f';
		}
		System.out.println("grade="+grade);
	}
}