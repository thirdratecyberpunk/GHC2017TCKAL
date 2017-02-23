package uk.teamcoolkidsandlewis;

public class VideoRequest {
	private Video video;
	private EndPoint endpoint;
	private int numOfRequests;
	
	public VideoRequest(Video video, EndPoint endpoint, int requests){
		this.video = video;
		this.endpoint = endpoint;
		this.numOfRequests = requests;
	}
	
	public Video getVideo() {
		return video;
	}

	public EndPoint getEndpoint() {
		return endpoint;
	}

	public int getRequests() {
		return numOfRequests;
	}

	public int getNumOfRequests() {
		return numOfRequests;
	}

	public void setNumOfRequests(int numOfRequests) {
		this.numOfRequests = numOfRequests;
	}

	public void setVideo(Video video) {
		this.video = video;
	}

	public void setEndpoint(EndPoint endpoint) {
		this.endpoint = endpoint;
	}
}
