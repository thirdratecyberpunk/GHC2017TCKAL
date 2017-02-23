package uk.teamcoolkidsandlewis;

import java.util.ArrayList;

public class EndPoint {
	
	private ArrayList<VideoRequest> videoRequests;
	private int latency;
	
	public EndPoint(int latency, ArrayList<VideoRequest> videoRequests){
		videoRequests = new ArrayList<VideoRequest>();
		this.latency = latency;
	}

	public ArrayList<VideoRequest> getVideoRequests() {
		return videoRequests;
	}

	public void setVideoRequests(ArrayList<VideoRequest> videoRequests) {
		this.videoRequests = videoRequests;
	}

	public int getLatency() {
		return latency;
	}

	public void setLatency(int latency) {
		this.latency = latency;
	}
}
