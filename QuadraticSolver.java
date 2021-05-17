import java.util.Scanner; // importing Scanner    Julio C. Prudencio ,07/05/2020
public class QuadraticSolver {
	
	public static double discriminant(double a, double b , double c) { 
		// New Method discriminant
		return Math.pow(b, 2)-(4 * a * c); 
		// Return statement 
	}
	
	public static double PlusQuadraticFormula (double a ,double b, double c) {
		// New Method
		return (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
		// The return statement for The plus statement of the quadratic formula
	}
	public static double MinusQuadraticFormula (double a ,double b, double c) {
		return  (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
		// Return statement for the minus part of the quadratic formula
	}

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	// inserting scanner to main method
	
	double a,b,c; 
	// declaring variables
	
	System.out.println("This program solves a quadratic equation in standard form" + " \n" + "a*x^2 + b*x + c = 0"); 
	// Printing out layout
	System.out.println("Please enter the following: " );
	// Layout
	System.out.print("Quadratic coefficient a: ");
	//Layout
	
	a = input.nextDouble(); 
	// scanning for a
	
	System.out.print("linear coefficient b: "); 
	b = input.nextDouble(); 
	// scanning for b
	
	System.out.print("Constant c: "); 
	// printing out 
	c = input.nextDouble(); 
	// scanning for c
	
	if(a==0) { 
		// Ending program if a = 0
	
		System.out.println("Terminating program, Invalid Input."); 
		// explaining why i terminated program
		
		System.exit(0);
		// Terminating Program
	
	} else if (discriminant(a,b,c)>0){ 
		// Conditional statment, checking through the discriminant
		
		System.out.printf("The quadratic equation has two real Solutions: \n");
		// Printing 
		
		System.out.printf("%s%.4f","x= ",PlusQuadraticFormula(a,b,c ));
		// Returning the plus solution
		
		System.out.println();
		// Space, need to pratcice printf
		
		System.out.printf("%s%.4f", "x= " ,MinusQuadraticFormula(a,b,c));
		// printing the Negative solution
		
	}else if(discriminant(a,b,c)==0) {
		// Running through the discriminant
		
		System.out.printf("The quadratcic equation has one real solution: \n");
		// Printing for the Real solution
		
		System.out.printf("%s%.4f" ,"x= ", PlusQuadraticFormula(a, b ,c ));
		//Using the plus for this one 
		
		
	} else if(discriminant(a,b,c)<0) {
		// checking through discriminat
		
		System.out.printf("The quadratic equation has two complex solutions: \n");
		// printing layout

		System.out.printf("%s%.4f","x= ", PlusQuadraticFormula(a,b,c));
		// I dont know how to do imaginary :/
		System.out.println();
		
		System.out.printf("%s%.4f","x= ", MinusQuadraticFormula(a,b,c));
		
	}
	
	
	
	
	
	
	

	}

}
