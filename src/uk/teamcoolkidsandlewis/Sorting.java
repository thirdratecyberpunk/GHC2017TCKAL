package uk.teamcoolkidsandlewis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Sorting {
	

	public Sorting(){
		
	}
	/*
	 * Get cache
	 * for each cache
	 *   for each end point
	 *     sum video views
	 * choose most popular video
	 */
	
	public Video epicSort(ArrayList<Cache> cacheList){
		ArrayList<Cache> sortedList = new ArrayList<Cache>();
		HashMap<Video, Integer> videoRequestMap = new HashMap<Video, Integer>();
		VideoRequest mostWantedVideo = VideoRequest(null, null, 0);
		for(Cache cache : cacheList){
			for(EndPointCacheConnection epcc : cache.getEndPointCacheConnections()){
				for(VideoRequest vr : epcc.getEndpoint().getVideoRequests()){
					if(videoRequestMap.containsKey(vr.getVideo())){
						videoRequestMap.put(vr.getVideo(), 
								(videoRequestMap.get(vr.getVideo()) + vr.getRequests()));
					}
				}
			}
		}
		Set videoSet = videoRequestMap.entrySet();
		for(Map.Entry<Video, Integer> entry : videoRequestMap.entrySet()){

		}
		return null;
	}
}
