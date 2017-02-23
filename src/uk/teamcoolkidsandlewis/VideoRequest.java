package uk.teamcoolkidsandlewis;

public class VideoRequest {
	private Video video;
	private EndPoint endpoint;
	private int requests;
	
	public VideoRequest(Video video, EndPoint endpoint, int requests){
		this.video = video;
		this.endpoint = endpoint;
		this.requests = requests;
	}
}
