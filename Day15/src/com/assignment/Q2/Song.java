package com.assignment.Q2;

import java.util.Objects;

public class Song {

	private String movieName;
	private String songName;
	
	public Song()
	{
		
	}
	
	public Song(String movieName,String songName)
	{
		this.movieName=movieName;
		this.songName=songName;
	}
	
	
	
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	
	public void play()
	{
		Song s1= this;
		System.out.println(s1.getSongName()+ " of "+s1.getMovieName()+" is playing...!");
	}
	

	@Override
	public boolean equals(Object obj) {
	
		Song s1= this;
		Song s2=  (Song)obj;
		
		if((s1.getMovieName() == s2.getMovieName() ) && s1.getSongName().equals(s2.getSongName()) )
			return true;
		else
			return false;
	}
	
	@Override
	public int hashCode() {
	
		return Objects.hash(movieName,songName);
	
	}


}
