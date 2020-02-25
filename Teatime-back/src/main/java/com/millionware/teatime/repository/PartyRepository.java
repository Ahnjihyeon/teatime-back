package com.millionware.teatime.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.millionware.teatime.vo.Party;

public interface PartyRepository extends MongoRepository<Party, String> {
	List<Party> findAllList();
}
