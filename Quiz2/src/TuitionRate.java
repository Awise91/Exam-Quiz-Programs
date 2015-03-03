import java.util.Scanner; 

public class TuitionRate {
	public static void main(String[] args){
		
		Scanner initialCost = new Scanner(System.in);
		System.out.println("What is your initial tuition cost?");
		double cost = initialCost.nextDouble();
		
		Scanner percentIntake = new Scanner(System.in);
		System.out.println("What is your increase in tuition?");
		double percentage = percentIntake.nextDouble();
		percentIntake.close();
		
		double total = cost;
	
		for (int i = 0; i < 4; i++) {
			total += (cost * percentage);
			String.format("%.2f", total);
		}
		System.out.println("Your total cost of tuition is " + String.format("%.2f", total));
		}
}
