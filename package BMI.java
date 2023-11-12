package BMI;
import java.util.Scanner;
public class BMI_CALCULATOR {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Weight in Kilograms: ");
		double weight = sc.nextDouble();
		System.out.println("Height in Meters: ");
		double height = sc.nextDouble();
		// calculate BMI
		double BMI = weight/(height*height);
		System.out.println(String.format("%.3f", BMI));
		// check range 
		if (BMI < 18.5)
			System.out.println ("Underweight");
		else if (BMI < 25 )
			System.out.println("Normal");
		else if (BMI < 30)
			System.out.println("Overweight");
		else 
			System.out.println("Obese");
		
		

	}

}