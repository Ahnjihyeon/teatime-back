package com.millionware.teatime.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.millionware.teatime.service.PartyService;
import com.millionware.teatime.vo.Party;


@RestController
public class PartyController {
	
	private Logger logger = LoggerFactory.getLogger(PartyController.class);
	
	@Autowired
	private PartyService partyService;
	
	@GetMapping("/")
	public List<Party> getAllParties(){
		List<Party> orders = partyService.findAll();
		return orders;
	}
	
	@DeleteMapping("/party/{id}")
	public void deleteParty(@PathVariable("id") String id){
		partyService.deleteById(id);		
	}
	
	@PostMapping("/party")
	public void save(@RequestBody Party party){
		
		logger.debug("들어온 party : "+party);
		partyService.save(party);
	}
}
