package week4;

import java.util.Scanner;

public class BmiProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("---BMI calculator ---");
		System.out.print("Enter weight (pound): ");
		double weight = input.nextDouble();
		System.out.print("Enter height (inch): ");
		double height = input.nextDouble();
		Person person = new Person( height, weight);
		double bmi = BmiCalculator.calculateBmi(person);
		String interpretation = BmiCalculator.interpret(bmi);
		System.out.println("BMI: " + bmi + " - " + interpretation);

	}

}
