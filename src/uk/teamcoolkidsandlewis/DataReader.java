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
	}
}
