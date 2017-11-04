import java.util.Scanner;
public class month {

	
	public static void main(String[] args) {
		int choice;
		float a,b,c;
		Scanner input = new Scanner(System.in);
		System.out.println("enter two numbers: ");
		a=input.nextFloat();
		b=input.nextFloat();
		while(true){
		
		System.out.println("what do you want to do?\n1.add\n2.sub\n3.mul\n4.div\n5.Enter new numbers\nPress 0 to EXIT");
		choice=input.nextInt();
		switch(choice){
		case 5:System.out.println("enter two numbers: ");
		a=input.nextFloat();
		b=input.nextFloat();break;
		case 1:c=a+b;
				System.out.println("Sum="+c);
				break;
		case 2: if(a>b)
				c=a-b;
				else
					c=b-a;
		System.out.println("Diff="+c);break;
		case 3:c=a*b;
				System.out.println("product="+c);break;
		case 4: if(a>b)
			c=a/b;
		else
			c=b/a;
System.out.println("quotient="+c);break;
		case 0: System.out.flush();
		default: System.out.println("wrong choice");break;
		}
		}
	}

}
