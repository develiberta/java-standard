package practice.week11;

import java.util.LinkedList;
import java.util.List;

/**
 * <pre>
 * Date		: 2020. 6. 13.
 * Author 	: pureboyz
 * 
 * 3개의 쓰레드를 실행시킨 후 main 쓰레드에서 각 쓰레드의 종료를 감지하여 callback()을 실행시키도록 만들어봐요! 
 * </pre>
 */
public class ThreadCallbackTest
{

	public static void main(String[] args)
	{
		List<Thread> threadList = new LinkedList<>();
		threadList.add(new Thread(new TestRunnable(3, "Thread-1")));
		threadList.add(new Thread(new TestRunnable(5, "Thread-2")));
		threadList.add(new Thread(new TestRunnable(10, "Thread-3")));
		
		for(Thread thread : threadList)
		{
			thread.start();
		}
		
		
		// Code start..
		
		
	}
	
	// thread의 이름을 매개변수로 받아 해당 thread가 종료되었음을 알린다.
	static void callback(String threadName)
	{
		System.out.println(threadName + " is dead!!");
	}

}

class TestRunnable implements Runnable
{
	int 	during 		= 0;		// thread가 실행되는 시간
	String 	threadName 	= null;		// thread의 이름
	
	TestRunnable(int during, String threadName)
	{
		this.during 	= during;
		this.threadName = threadName;
	}
	
	// during(초)동안 매 초 thread가 실행 중임을 알린다.
	public void run()
	{
		try
		{
			Thread.currentThread().setName(this.threadName);
			
			for(int i=0; i<this.during; i++)
    		{
    			Thread.sleep(1000);
    			System.out.println(this.threadName + " is run..");
    		}
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
