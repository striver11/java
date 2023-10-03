package Collection1;


interface I1{
	void compute(int a, int b);
}

public class LambdaExpression_calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		I1 additon=(a,b)->{
			System.out.println("addition "+(a+b));
		};
		additon.compute(10, 20);
		
		I1 substraction=(a,b)->{
			System.out.println("substraction "+(a-b));
		};
		substraction.compute(10, 20);
		I1 Multiplication=(a,b)->{
			System.out.println("multiplication "+(a*b));
		};
		Multiplication.compute(10, 20);
		I1 division=(a,b)->{
			System.out.println("division "+(a/b));
		};
		division.compute(10, 20);
		
	}

}

// output:
// addition 30
// substraction -10
// multiplication 200
// division 0
