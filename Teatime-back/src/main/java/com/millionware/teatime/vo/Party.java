package com.millionware.teatime.vo;


import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
@Document(collection = "party")
public class Party {
	
	public Party(String id, String subject, String place, List<Attender> attenders) {
		super();
		this.id = id;
		this.subject = subject;
		this.place = place;
		this.attenders = attenders;
	}

	public Party(String id, String subject, String place) {
		super();
		this.id = id;
		this.subject = subject;
		this.place = place;
	}

	@Id
	private String id;
	
	private String subject;
	
	private String place;
	
	private List<Attender> attenders;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public List<Attender> getAttenders() {
		return attenders;
	}

	public void setAttenders(List<Attender> list) {
		this.attenders = list;
	}
	
	
}
