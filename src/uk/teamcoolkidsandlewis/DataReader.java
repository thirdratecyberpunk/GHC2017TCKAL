package uk.teamcoolkidsandlewis;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * class responsible for taking the input as .in
 * @author Lewis Blackburn
 *
 */
public class DataReader{

	static Scanner s = null;

	static ArrayList<String> contents;

	public static void main(String[] args) throws FileNotFoundException{
		try{
			// import contents of .in file
			contents = new ArrayList<String>();
			s = new Scanner(new BufferedReader(new FileReader("data/kittens.in")));
			// add contents to arraylist
			while (s.hasNext()){
				String value = s.next();
				contents.add(value);
			}// outputs the contents of the arraylist
			for (String str: contents){
				System.out.println(str);
			}
		}
		finally{
		}
	int[] intContents = new int[contents.size()];
	for (int i = 0; i < contents.size(); i++){
		intContents[i] = Integer.parseInt(contents.get(i));
	}
	int numberOfVideos = intContents[0];
	Video[] videos = new Video[numberOfVideos];
	while(contents.size() < (4 + numberOfVideos)){
		int i = 0;
		int videoSize = 5;
		videos.add(new Video(i, contents.get(videoSize)));
		i++;
		videoSize ++;

	}
}

}
