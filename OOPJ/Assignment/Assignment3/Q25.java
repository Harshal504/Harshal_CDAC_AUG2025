//Media Player
//Scenario: A media player can play both Audio and Video files.
//Problem Statement:
//● Interface AudioPlayer → method playAudio(String song)
//● Interface VideoPlayer → method playVideo(String movie)
//● Class MediaPlayer implements both → provides implementation for both methods
//Sample Input: Audio → song="Shape of You" Video → movie="Inception"
//Sample Output: Playing Audio: Shape of You Playing Video: Inception


import java.util.*;

interface AudioPlayer{
	public void playAudio(String song);
 
}

interface VideoPlayer{
	public void playVideo(String movie);
}

class MediaPlayer implements AudioPlayer, VideoPlayer{
	public void playAudio(String song){
		System.out.println("Playing Audio: "+ song);
	}
	public void playVideo(String movie){
		System.out.println("Playing Video: "+ movie);
	}
	
}

class Q25{
	public static void main(String[] args){

		AudioPlayer ap = new MediaPlayer();
		VideoPlayer vp = new MediaPlayer();
		
		ap.playAudio("Shape of you");
		vp.playVideo(" Inception");

	}
}