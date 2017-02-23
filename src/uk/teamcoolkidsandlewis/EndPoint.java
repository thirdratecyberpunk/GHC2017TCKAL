package uk.teamcoolkidsandlewis;

import java.util.ArrayList;

public class EndPoint {
	
	private ArrayList<VideoRequest> videoRequests;
	private int latency;
	
	public EndPoint(int latency, ArrayList<VideoRequest> videoRequests){
		videoRequests = new ArrayList<VideoRequest>();
		this.latency = latency;
	}
}
