package uk.teamcoolkidsandlewis;

import java.util.HashMap;

public class Main {
	
	public static void main(String[] args){
		new Main();
	}
	
	public Main(){
		HashMap<Cache, Video> results = new HashMap<Cache, Video>();
		//Load all the data into objects
		//Provide each cache to Sorting
		//    Store each result in hashmap as cache -> video
		
		results = fakeData();
		new Output(results);
	}
	
	private HashMap<Cache, Video> fakeData(){
		HashMap<Cache, Video> results = new HashMap<Cache, Video>();
		
		results.put(new Cache(null, 0), new Video(0, 100));
		results.put(new Cache(null, 1), new Video(0, 100));
		
		return results;
	}
	
}
