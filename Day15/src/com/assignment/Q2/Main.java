package com.assignment.Q2;

public class Main {

	public static void main(String[] args) {

        PlayList pl=new PlayList();
        pl.addSong(new Song("Keshri","Keshri"));
        pl.addSong(new Song("Dangal","Gilhari"));
        pl.addSong(new Song("Vatan","Vande Mataram"));
        pl.addSong(new Song("Keshri","Keshri"));
        
       for(int i=0;i<pl.songs.size();i++)
       {
    	  Song s=pl.songs.get(i);
    	  s.play();
       }
      
	}

}
