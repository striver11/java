package MUltiThreading;

public class MainThread_LambdaExpreassion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable r1= ()->
		{
			for(int i=1;i<=5;i++)
			{
				System.out.print(i);
			}
		};
		
		
		new Thread(()->{System.out.println("praveen");}).start();
		
		//Thread t1=new Thread();
		Thread t1=new Thread(r1);
		t1.start();
		
		for(char c='a';c<='f';c++)
		{
			System.out.print(c);
		}

	}

}

//output:
//	abcdef12345praveen
