package com.millionware.teatime.vo;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Attender {
	
	private String who;
	private String what;
	
	public Attender(String who, String what) {
		super();
		this.who = who;
		this.what = what;
	}	
	
	public String getWho() {
		return who;
	}
	public void setWho(String who) {
		this.who = who;
	}
	public String getWhat() {
		return what;
	}
	public void setWhat(String what) {
		this.what = what;
	}
	
}
