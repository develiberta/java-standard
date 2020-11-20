package practice.week12;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import reference.encryption.AES_Encryption;

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
public class FileInOutExample_seungha_200621
{
	private static final String SONGINFO_SER = "src/practice/week12/songinfo.ser";
	
	// SongInfo를 담을 수 있는 ArrayList
	static ArrayList<SongInfo> songInfoList = new ArrayList<>();

	public static void main(String[] args)
	{
		conductDeserializing();
	}
	
	private static void conductDeserializing() {
		try {
			AES_Encryption aes = AES_Encryption.getInstance();
			
			FileInputStream fis = new FileInputStream(SONGINFO_SER);
			BufferedInputStream bis = new BufferedInputStream(fis);
			ObjectInputStream in = new ObjectInputStream(bis);
			
			SongInfo s1 = (SongInfo) in.readObject();
			SongInfo s2 = (SongInfo) in.readObject();
			SongInfo s3 = (SongInfo) in.readObject();

			songInfoList.add(new SongInfo(aes.decode(s1.singer), aes.decode(s1.title), aes.decode(s1.lirics)));
			songInfoList.add(new SongInfo(aes.decode(s2.singer), aes.decode(s2.title), aes.decode(s2.lirics)));
			songInfoList.add(new SongInfo(aes.decode(s3.singer), aes.decode(s3.title), aes.decode(s3.lirics)));

			for(int i=0; i<songInfoList.size(); i++) {
				SongInfo songInfo = songInfoList.get(i);
				FileWriter 		fw = new FileWriter("src/practice/week12/seungha/#"+songInfo.title + " - #" + songInfo.singer + ".txt");
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(songInfo.lirics);
				bw.flush();
				bw.close();
			}

			in.close();
		} catch(IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
