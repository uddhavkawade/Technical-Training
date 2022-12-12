package com.yash.jaba8_2;

public class StateStream {
   
    private int stated;
	private String statename;
	public int getStated() {
		return stated;
	}
	public void setStated(int stated) {
		this.stated = stated;
	}
	public String getStatename() {
		return statename;
	}
	public void setStatename(String statename) {
		this.statename = statename;
	}
	public StateStream(int stated, String statename) {
		super();
		this.stated = stated;
		this.statename = statename;
	}
	public StateStream() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "StateStream [stated=" + stated + ", statename=" + statename + "]";
	}
	
	
	
}
