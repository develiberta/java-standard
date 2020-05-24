import java.util.Scanner;
import java.util.regex.Pattern;

public class Chapter09_seungha_200517
{

	public static void main(String[] args)
	{
		Example1();
		Example2();
		Example3();
		Example4();
		Example5();
	}
	
	// 주어진 byte배열을 문자열로 변환하세요.
	public static void Example1()
	{
		byte[] bytes 	= {73, 32, 108, 111, 118, 101, 32, 121, 111, 117, 46};
		String str 		= "";
		
		str = new String(bytes);
		/* [참고]
		 * String()
		 * Initializes a newly created String object so that it represents an empty character sequence.
		 * String(byte[] bytes)
		 * Constructs a new String by decoding the specified array of bytes using the platform's default charset.
		 * String(byte[] bytes, Charset charset)
		 * Constructs a new String by decoding the specified array of bytes using the specified charset.
		 * String(byte[] ascii, int hibyte)
		 * Deprecated. 
		 * This method does not properly convert bytes into characters. As of JDK 1.1, the preferred way to do this is via the String constructors that take a Charset, charset name, or that use the platform's default charset.
		 * String(byte[] bytes, int offset, int length)
		 * Constructs a new String by decoding the specified subarray of bytes using the platform's default charset.
		 * String(byte[] bytes, int offset, int length, Charset charset)
		 * Constructs a new String by decoding the specified subarray of bytes using the specified charset.
		 * String(byte[] ascii, int hibyte, int offset, int count)
		 * Deprecated. 
		 * This method does not properly convert bytes into characters. As of JDK 1.1, the preferred way to do this is via the String constructors that take a Charset, charset name, or that use the platform's default charset.
		 * String(byte[] bytes, int offset, int length, String charsetName)
		 * Constructs a new String by decoding the specified subarray of bytes using the specified charset.
		 * String(byte[] bytes, String charsetName)
		 * Constructs a new String by decoding the specified array of bytes using the specified charset.
		 * String(char[] value)
		 * Allocates a new String so that it represents the sequence of characters currently contained in the character array argument.
		 * String(char[] value, int offset, int count)
		 * Allocates a new String that contains characters from a subarray of the character array argument.
		 * String(int[] codePoints, int offset, int count)
		 * Allocates a new String that contains characters from a subarray of the Unicode code point array argument.
		 * String(String original)
		 * Initializes a newly created String object so that it represents the same sequence of characters as the argument; in other words, the newly created string is a copy of the argument string.
		 * String(StringBuffer buffer)
		 * Allocates a new string that contains the sequence of characters currently contained in the string buffer argument.
		 * String(StringBuilder builder)
		 * Allocates a new string that contains the sequence of characters currently contained in the string builder argument.
		 */
		
		System.out.println(str);
	}
	
	// 주어진 문자열에서 "자바" 문자열이 포함되어 있는지 확인하고, "자바"를 "Java"로 변경한 새로운 문자를 출력하세요.
	public static void Example2()
	{
		String src = "모든 프로그램은 자바로 개발할 수 있다. 자바 짱!";
		String str = "";
		
		str = src.replace("자바", "Java");

		System.out.println(str);
	}
	
	// 문자열 src가 첫 번째는 알파벳으로 시작하고, 두 번째부터 숫자와 알파벳으로 구성된 8~12자 사이의 값인지를
	// 정규 표현식(regExp)을 이용하여 유효성검사를 하세요.
	public static void Example3()
	{
		String src 		= "5Angel1004";
		String regExp 	= "(^[a-zA-Z][a-zA-Z0-9]{7,11}$)";
		
		// 코드작성.
		boolean b = Pattern.matches(regExp, src);
		if(b) System.out.println("유효합니다.");
		else System.out.println("유효하지 않습니다.");
	}
	
//	Scanner를 이용하여 한 라인을 읽고, 공백으로 분리된 어절이 몇 개 들어 있는지 "그만"을 입력할 때까지 반복하는 프로그램을 작성하라.
//	
//	예시)
//	>>I love Java.
//	어절 개수는 3
//	>>자바는 객체 지향 언어로서 매우 좋은 언어이다.
//	어절 개수는 7
//	>>그만
//	종료합니다...
	public static void Example4()
	{
		Scanner scanner = new Scanner(System.in);
		
		while(true)
		{
			System.out.print(">> ");
			
			String input = scanner.nextLine();
			
			// 코드작성.
			if(input.equals("그만")) { break; }
			String[] strArr = input.split(" ");
			System.out.println("어절 개수는 " + strArr.length);
		}
	}
	
//	문자열을 입력받아 한 글자씩 회전시켜 모두 출력하는 프로그램을 작성하라.
//	
//	예시)
//	문자열을 입력하세요. 빈칸이나 있어도 되고 영어 한글 모두 됩니다.
//	I Love you
//	 Love youI
//	Love youI 
//	ove youI L
//	ve youI Lo
//	e youI Lov
//	 youI Love
//	youI Love 
//	ouI Love y
//	uI Love yo
//	I Love you
	public static void Example5()
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요. 빈칸이나 있어도 되고 영어 한글 모두 됩니다.");
		System.out.print(">> ");

		String str = scanner.nextLine();
		
		// 코드작성.
		for (int i=0; i<=str.length(); i++) {
				System.out.println(str.substring(i) + str.substring(0,i));
		}
	}
	
}
