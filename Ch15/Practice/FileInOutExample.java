package practice.week12;

import java.util.ArrayList;

/**
 * <pre>
 * Date 	: 2020. 6. 20.
 * Author	: pureboyz
 *
 * ## 파일 입출력 연습
 * 3개의 SongInfo 객체를 암호화 후 직렬화하여 만든 파일 songInfo.ser를 읽어서
 * 역직렬화, 복호화 작업을 하여 songInfoList에 담은 후
 * 내용으로 가사를 담은 '#{가수명} - #{노래제목}.txt' 파일을 생성하세요.
 * 
 * ## SongInfo 정보
 * singer(가수명), title(노래제목), lirics(노래가사)를 담을 수 있는 직렬화가 가능한 클래스
 * 
 * ## songInfo.ser 정보
 * SongInfo 객체의 각 멤버변수를 AES128암호화를 적용 후 직렬화하여 출력한 파일.
 * 
 * </pre>
 */
public class FileInOutExample
{
	// SongInfo를 담을 수 있는 ArrayList
	static ArrayList<SongInfo> songInfoList = new ArrayList<>();

	public static void main(String[] args)
	{
		// Code Start..
	}

}
