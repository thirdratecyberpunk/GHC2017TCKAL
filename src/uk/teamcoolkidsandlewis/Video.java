package uk.teamcoolkidsandlewis;

public class Video {
	private int id;
	private int size;
	
	public Video(int id, int size){
		this.id = id;
		this.size = size;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	
}
