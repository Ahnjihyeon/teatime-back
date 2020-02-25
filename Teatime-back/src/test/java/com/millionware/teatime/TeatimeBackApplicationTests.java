package com.millionware.teatime;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.millionware.teatime.repository.PartyRepository;
import com.millionware.teatime.vo.Attender;
import com.millionware.teatime.vo.Party;

@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@ExtendWith(SpringExtension.class)
@SpringBootTest
class TeatimeBackApplicationTests {
//	
//	@Autowired()
//	private PartyRepository partyRepository;
//	
//	
//	@Test
//	public void insertPartyData(){
//		Party party = null;
//		Attender attender = null;
//		Attender attender2 = null;
//		List<Attender> list = null; 
//		
//		party.setId("a01");
//		party.setSubject("티타임");
//		party.setPlace("카누");
//		
//		attender.setWhat("아메리카노");
//		attender.setWho("안지현");
//		
//		attender2.setWhat("카페라떼");
//		attender2.setWho("안지현2");
//		
//		list.add(attender);
//		list.add(attender2);
//		
//		party.setAttenders(list);
//		
//		}
		
	}

