package com.stormscouting.models.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.stormscouting.models.Team;

@Transactional
@Repository
public interface TeamDao extends CrudRepository<Team, Integer> {
    
    
    List<Team> findAll();
    // TODO - add method signatures as needed
	
}