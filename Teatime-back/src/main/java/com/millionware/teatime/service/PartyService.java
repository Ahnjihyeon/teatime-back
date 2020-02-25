package com.millionware.teatime.service;

import java.util.List;

import com.millionware.teatime.vo.Party;

public interface PartyService {
	List<Party> findAll();
	
	void deleteById(String id);
	
	void save(Party party);
	
	
}
