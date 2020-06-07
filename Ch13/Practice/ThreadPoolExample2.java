import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
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
 * ex)
 * 훈이가 손님2의 계산을시작.
 * 유리가 손님3의 계산을시작.
 * 맹구가 손님1의 계산을시작.
 * 					유리가 손님3의 계산을종료.
 * 유리가 손님4의 계산을시작.
 * 					훈이가 손님2의 계산을종료.
 * 훈이가 손님5의 계산을시작.
 * 					맹구가 손님1의 계산을종료.
 * 맹구가 손님6의 계산을시작.
 * 					유리가 손님4의 계산을종료.
 * 유리가 손님7의 계산을시작.
 * 					유리가 손님7의 계산을종료.
 * 					훈이가 손님5의 계산을종료.
 * 유리가 손님8의 계산을시작.
 * 훈이가 손님9의 계산을시작.
 * 					맹구가 손님6의 계산을종료.
 * 맹구가 손님10의 계산을시작.
 * </pre>
 */
public class ThreadPoolExample2
{
	public static Cashier yuri 	= new Cashier("유리", 2);
	public static Cashier hoon 	= new Cashier("훈이", 3);
	public static Cashier goo 	= new Cashier("맹구", 4);
	
	static ExecutorService 		executorService 	= Executors.newFixedThreadPool(3);
	static ThreadPoolExecutor 	threadPoolExecutor 	= (ThreadPoolExecutor) executorService;
	
	public static void main(String[] args)
	{
		// 손님 30명이 담겨있는 Queue
		Queue<String> customerQueue = new LinkedList<>();
		for(int i=0; i<30; i++)
		{
			customerQueue.add("손님" + (i+1));
		}
		
		// 손님이 1명도 남지 않을 때까지 반복
		while(customerQueue.size() != 0)
		{
			Calculate_ Calculate_ = null;
			
			// 맹구가 계산중이 아닐 때
			if(!goo.isCalculate)
			{
				Calculate_ = new Calculate_(goo, customerQueue.poll());
			}
			// 훈이가 계산중이 아닐 때
			else if(!hoon.isCalculate)
			{
				Calculate_ = new Calculate_(hoon, customerQueue.poll());
			}
			// 유리가 계산중이 아닐 때
			else if(!yuri.isCalculate)
			{
				Calculate_ = new Calculate_(yuri, customerQueue.poll());
			}
			else
			{
				continue;
			}
			
			// 쓰레드 실행
			executorService.execute(Calculate_);
		}
		
		threadPoolExecutor.shutdown();
	}

}


// 계산원과 손님을 매개변수로 받아서 계산원의 interval만큼 Thread가 sleep한 후 종료.
class Calculate_ implements Runnable
{
	Cashier cashier 	= null;		// 계산원
	String 	customer 	= null;		// 손님
	
	Calculate_(Cashier cashier, String customer)
	{
		this.cashier 				= cashier;
		this.customer 				= customer;
		this.cashier.isCalculate 	= true;		// 계산 중이므로 true로 변경
	}
	
	public void run()
	{
		try
		{
			System.out.println(this.cashier.name + "가 " + this.customer + "의 계산을시작.");
			Thread.sleep(this.cashier.interval * 1000);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			// 계산이 종료되었으므로 false로 변경
			this.cashier.isCalculate = false;
			System.out.println("\t\t\t\t\t" + this.cashier.name + "가 " + this.customer + "의 계산을종료.");
		}
	}
}

class Cashier
{
	String 	name 		= null;		// 계산원 이름
	int 	interval 	= 0;		// 계산하는데 걸리는 시간(초)
	boolean	isCalculate = false; 	// 계산중인지 아닌지
	
	Cashier(String name, int interval)
	{
		this.name 		= name;
		this.interval 	= interval;
	}
	
}
