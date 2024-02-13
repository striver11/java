

public class StringBuffer_StringBuilder_ThreadSafe_explanation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sharedStringBuilder =new StringBuilder();
		
		Thread thread1=new Thread(()->{
			for(int i=0;i<1000;i++)
			{
				sharedStringBuilder.append("A");
			}
		});
		Thread thread2=new Thread(()->{
			for(int i=0;i<1000;i++)
			{
				sharedStringBuilder.append("B");
			}
		});
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("result :"+sharedStringBuilder.toString().length());
		
StringBuffer sharedStringBuffer =new StringBuffer();
		
		Thread thread3=new Thread(()->{
			for(int i=0;i<1000;i++)
			{
				sharedStringBuffer.append("A");
			}
		});
		Thread thread4=new Thread(()->{
			for(int i=0;i<1000;i++)
			{
				sharedStringBuffer.append("B");
			}
		});
		
		thread3.start();
		thread4.start();
		
		try {
			thread3.join();
			thread4.join();
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("result :"+sharedStringBuffer.toString().length());
		
		
		
		
	}

}


// output:
// result :1916
// result :2000
