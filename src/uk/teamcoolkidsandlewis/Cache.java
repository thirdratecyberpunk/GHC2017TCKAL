package uk.teamcoolkidsandlewis;

import java.util.ArrayList;

public class Cache {
	
	private ArrayList<EndPointCacheConnection> endpoints;
	private int size; 
	
	public Cache(ArrayList<EndPointCacheConnection> endpoints){
		this.endpoints = endpoints;
	}
	
	public ArrayList<EndPointCacheConnection> getEndPointCacheConnections(){
		return endpoints;
	}

	public ArrayList<EndPointCacheConnection> getEndpoints() {
		return endpoints;
	}

	public void setEndpoints(ArrayList<EndPointCacheConnection> endpoints) {
		this.endpoints = endpoints;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
}
