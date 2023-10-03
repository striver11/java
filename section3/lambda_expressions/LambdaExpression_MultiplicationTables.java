package Collection1;

interface Table{
	void table(int a,int b);
}

public class LambdaExpression_MultiplicationTables {

	public static void main(String[] args) {
		
		Table t=(a,b)->{  
			
			while(a<=b)
			{
				for(int i=1;i<=10;i++)
				{
					System.out.println(a+"X"+i+"="+(a*i));
				}
				a++;
				System.out.println();
				
			}
			
		};
		t.table(1, 3);

	}

}


// output
// 1X1=1
// 1X2=2
// 1X3=3
// 1X4=4
// 1X5=5
// 1X6=6
// 1X7=7
// 1X8=8
// 1X9=9
// 1X10=10

// 2X1=2
// 2X2=4
// 2X3=6
// 2X4=8
// 2X5=10
// 2X6=12
// 2X7=14
// 2X8=16
// 2X9=18
// 2X10=20

// 3X1=3
// 3X2=6
// 3X3=9
// 3X4=12
// 3X5=15
// 3X6=18
// 3X7=21
// 3X8=24
// 3X9=27
// 3X10=30

