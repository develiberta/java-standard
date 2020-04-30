import java.util.Scanner;








/**
 * <pre>
 * Date		: 2020. 3. 20.
 * Author	: pureboyz
 * 
 * 사용자가 입력한 값이 변환될 수 있는 타입을 알려주는 프로그램.
 * </pre>
 */
public class Casting
{
	// 사용자에게 값을 입력받기 위한 Scanner 객체.
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		boolean isRun = true;	// isRun이 false가 되면 프로그램 종료.
		while(isRun)
		{
			System.out.println("------------------------------------------");
			System.out.println("|			입력할 기본형 타입을 선택하세요.        |");
			System.out.println("------------------------------------------");
			System.out.println("| 1.문자형 | 2.정수형 | 3.실수형 | 4.논리형 | 5.종료 |");
			System.out.println("------------------------------------------");
			System.out.print("> ");
			
			String selectedNumber = scanner.next();	// 사용자가 선택한 번호.

			switch(selectedNumber)
			{
				// 1번 선택 시
				case "1":
					System.out.println(castToChar());
					System.out.println("\n");
					break;
					
				// 2번 선택 시
				case "2":
					System.out.println(castToInteger());
					System.out.println("\n");
					break;
					
				// 3번 선택 시
				case "3":
					System.out.println(castToRealNumber());
					System.out.println("\n");
					break;
					
				// 4번 선택 시
				case "4":
					System.out.println(castToBoolean());
					System.out.println("\n");
					break;
					
				// 5번 선택 시
				case "5":
					System.out.println("프로그램을 종료합니다.");
					isRun = false;
					break;
					
				// 1~5번이 아닌 다른 입력값을 받았을 때
				default:
					System.out.println("1~5 사이의 번호를 입력하세요.");
					break;
			}
		}
	}
	
	
	/**
	 * <pre>
	 * MethodName	: castToChar
	 * Date 		: 2020. 3. 20.
	 * Author		: pureboyz
	 * 
	 * Params		: 
	 * ReturnType	: String
	 * 
	 * 사용자에게 값을 입력받아 해당 값이 문자형으로 형변환이 가능한지 여부를 알려준다.
	 * 변환이 가능하다면 변환이 가능한 타입을 알려준다.
	 * 
	 * char 타입이 저장할 수 있는 값은 한 자리의 문자 또는 0 ~ 65535의 정수
	 * </pre>
	 */
	public static String castToChar()
	{
		return "값을 입력 받고, 그 값이 문자형(char) 타입으로 변환이 가능 여부를 출력하는 코드를 작성하세요.";
	}
	
	
	/**
	 * <pre>
	 * MethodName	: castToInteger
	 * Date 		: 2020. 3. 20.
	 * Author		: pureboyz
	 * 
	 * Params		: 
	 * ReturnType	: String
	 * 
	 * 사용자에게 값을 입력받아 해당 값이 정수형으로 형변환이 가능한지 여부를 알려준다.
	 * 변환이 가능하다면 변환이 가능한 타입을 알려준다.
	 * 
	 * long 	타입이 저장할 수 있는 값의 범위는 -2^63 ~ 2^63-1
	 * int  	타입이 저장할 수 있는 값의 범위는 -2,147,483,648 ~ 2,147,483,647
	 * short 	타입이 저장할 수 있는 값의 범위는 -32,768 ~ 32,767
	 * byte  	타입이 저장할 수 있는 값의 범위는 -128 ~ 127
	 * char  	타입이 저장할 수 있는 값의 범위는 0 ~ 65535
	 * </pre>
	 */
	public static String castToInteger()
	{
		return "값을 입력 받고, 그 값이 정수형(byte, short, int, long, char) 중 어떤 타입으로 변환이 가능한지를 출력하는 코드를 작성하세요.";
	}
	
	
	/**
	 * <pre>
	 * MethodName	: castToRealNumber
	 * Date 		: 2020. 3. 20.
	 * Author		: pureboyz
	 * 
	 * Params		: 
	 * ReturnType	: String
	 * 
	 * 사용자에게 값을 입력받아 해당 값이 실수형으로 형변환이 가능한지 여부를 알려준다.
	 * 변환이 가능하다면 변환이 가능한 타입을 알려준다.
	 * 
	 * double 	타입이 저장할 수 있는 값의 범위는 +-4.9e-324 ~ +-1.7e308
	 * float  	타입이 저장할 수 있는 값의 범위는 +-1.4e-45 ~ +-3.4e38
	 * </pre>
	 */
	public static String castToRealNumber()
	{
		return "값을 입력 받고, 그 값이 실수형(float, double) 중 어떤 타입으로 변환이 가능한지를 출력하는 코드를 작성하세요.";
	}
	
	
	/**
	 * <pre>
	 * MethodName	: castToBoolean
	 * Date 		: 2020. 3. 20.
	 * Author		: pureboyz
	 * 
	 * Params		: 
	 * ReturnType	: String
	 * 
	 * 사용자에게 값을 입력받아 해당 값이 논리형으로 형변환이 가능한지 여부를 알려준다.
	 * 변환이 가능하다면 변환이 가능한 타입을 알려준다.
	 * 
	 * boolean 타입이 저장할 수 있는 값은 true 또는 false
	 * </pre>
	 */
	public static String castToBoolean()
	{
		return "값을 입력 받고, 그 값이 논리형(boolean) 타입으로 변환이 가능 여부를 출력하는 코드를 작성하세요.";
	}
}
