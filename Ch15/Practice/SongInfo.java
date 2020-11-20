package practice.week12;

import java.io.Serializable;

public class SongInfo implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3921262486786003370L;
	
	String singer;	// 가수
	String title;	// 제목
	String lirics;	// 가사
	
	public SongInfo(String singer, String title, String lirics)
	{
		this.singer = singer;
		this.title 	= title;
		this.lirics = lirics;
	}
	
	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLirics() {
		return lirics;
	}

	public void setLirics(String lirics) {
		this.lirics = lirics;
	}

	@Override
	public String toString() {
		return "Song [singer=" + singer + ", title=" + title + ", lirics=" + lirics + "]";
	}
	
	
}
