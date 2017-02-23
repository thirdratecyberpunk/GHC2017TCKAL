package uk.teamcoolkidsandlewis;

public class EndPointCacheConnection {
	private EndPoint endpoint;
	private int latency;
	
	public EndPointCacheConnection(EndPoint endpoint, int latency){
		this.latency = latency;
		this.endpoint = endpoint;
	}
	
	public int getLatency(){
		return latency;
	}
	
	public EndPoint getEndpoint(){
		return endpoint;
	}

	public void setEndpoint(EndPoint endpoint) {
		this.endpoint = endpoint;
	}

	public void setLatency(int latency) {
		this.latency = latency;
	}
}
