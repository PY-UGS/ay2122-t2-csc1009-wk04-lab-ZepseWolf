package week4;

public class BmiCalculator {
	private static final double POUND_RATIO = 0.45359237;
	private static final double INCH_RATIO = 0.0254 ;
	
	public static double calculateBmi(Person person) {
		return (person.getWeight()*POUND_RATIO) / Math.pow((person.getHeight()*INCH_RATIO ), 2);
	}
	public static String interpret(double bmi) {
		if(bmi < 18.5) 
			return "Underweight";
		
		else if (bmi < 25.0) 
			return "Normal";
		
		else if (bmi < 30.0) 
			return "Overweight";
		
		else 
			return "Obese";
		
	}
	
	
}
