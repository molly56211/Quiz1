
import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		
		Scanner enter = new Scanner(System.in);
		
		System.out.println("How many touchdowns did the quarterback collect?");
		double TD = enter.nextDouble();
		
		System.out.println("How many total yards did the quarterback collect?");
		double Yards = enter.nextDouble();
		
		System.out.println("How many total interceptions did the quarterback collect?");
		double Int = enter.nextDouble();
		
		System.out.println("How many total completitions did the quarterback collect?");
		double Comp = enter.nextDouble();
		
		System.out.println("How many total attempts did the quarterback collect?");
		double Att = enter.nextDouble();
		
		enter.close();
		
		
		double a = (TD/Att)*20;
		
		if (a > 2.375)
		{
			a = 2.375; 
		}
		
		else if (a <0)
		{
			a=0;
		}
		
		
		double b = (Yards/Att-3)*.25;
		
		if (b > 2.375)
		{
			b = 2.375; 
		}
		
		else if (b <0)
		{
			b=0;
		}
		
		
		double c = 2.375-(Int/Att)*25;
				
		if (c > 2.375)
		{
			c = 2.375; 
		}
				
		else if (c <0)
		{
			c=0;
		}
		
		
		double d = (Comp/Att-.3)*5;
		
		if (d > 2.375)
		{
			d = 2.375; 
		}
		
		else if (d <0)
		{
			d=0;
		}
		
		
		double PasserRating = ((a+b+c+d)/6)*100;
		System.out.print("Your passer rating is:");
		System.out.printf("%.2f", PasserRating);
		System.out.print("!");
		
		
		
		
		
		
		
		
		

	}

}
