package com.millionware.teatime.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.millionware.teatime.repository.PartyRepository;
import com.millionware.teatime.vo.Party;

@Service
public class PartyServiceImpl implements PartyService {

	@Autowired
	private PartyRepository partyRepository;
	
	@Override
	public List<Party> findAll() {
		List<Party> parties = new ArrayList<>();
		partyRepository.findAll().forEach(e->parties.add(e));
		return parties;
	}

	@Override
	public void deleteById(String id) {
		partyRepository.deleteById(id);
	}

	@Override
	public void save(Party party) {
		partyRepository.save(party);
	}

}
