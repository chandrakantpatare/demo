package chandrakant;
//Write a program to find sum of all integers greater 
//than 100 and less than 200 that are divisible by 7.
public class Divisibleby7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int sum=0;

for(int a=101;a<200;a++)
	{if (a%7==0)
		
sum=sum+a;

	}
System.out.println("sum"+sum);
	
	}
}
