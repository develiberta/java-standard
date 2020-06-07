import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * <pre>
 * Date		: 2020. 6. 6.
 * Author 	: pureboyz
 * 
 * 장사가 아주 잘되는 빵집을 운영하는 철수는 계산원을 맹구, 훈이, 유리 3명을 고용해서 쓰고있다.
 * 그런데 지금 계산하려는 손님이 30명이나 대기중이다.
 * 쓰레드를 사용해서 손님 3명씩 계산하되, 1명의 계산이 끝나면 다음 차례의 손님이 계산할 수 있도록 프로그램을 완성하세요.
 * 
 * 
 * 
 * ex)
 * pool-1-thread-1 : 손님1의 계산을 시작.
 * pool-1-thread-3 : 손님3의 계산을 시작.
 * pool-1-thread-2 : 손님2의 계산을 시작.
 * 									pool-1-thread-2 : 손님2의 계산을 종료.
 * pool-1-thread-2 : 손님4의 계산을 시작.
 * 									pool-1-thread-2 : 손님4의 계산을 종료.
 * pool-1-thread-2 : 손님5의 계산을 시작.
 * 									pool-1-thread-1 : 손님1의 계산을 종료.
 * pool-1-thread-1 : 손님6의 계산을 시작.
 * 									pool-1-thread-3 : 손님3의 계산을 종료.
 * pool-1-thread-3 : 손님7의 계산을 시작.
 * 									pool-1-thread-2 : 손님5의 계산을 종료.
 * pool-1-thread-2 : 손님8의 계산을 시작.
 * 									pool-1-thread-3 : 손님7의 계산을 종료.
 * pool-1-thread-3 : 손님9의 계산을 시작.
 * 									pool-1-thread-1 : 손님6의 계산을 종료.
 * pool-1-thread-1 : 손님10의 계산을 시작.
 * </pre>
 */
public class ThreadPoolExample
{
	public static void main(String[] args)
	{
		List<String> customerList = new LinkedList<>();
		for(int i=0; i<30; i++)
		{
			customerList.add("손님" + (i+1));
		}
		
		// 작성시작
		
		
	}
}

class Calculate implements Runnable
{
	String 	customer 	= null;
	
	Calculate(String customer)
	{
		this.customer 	= customer;
	}
	
	public void run()
	{
		try
		{
			System.out.println(Thread.currentThread().getName() + " : " + this.customer + "의 계산을 시작.");
			
			Thread.sleep(((int) (Math.random() * 3) + 1) * 1000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("\t\t\t\t\t\t\t\t" + Thread.currentThread().getName() + " : " + this.customer + "의 계산을 종료.");
		}
	}
}
