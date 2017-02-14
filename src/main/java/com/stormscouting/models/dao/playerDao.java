package com.stormscouting.models.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.stormscouting.models.Team;
import com.stormscouting.models.player;

@Transactional
@Repository
public interface playerDao extends CrudRepository<player, Integer> {
    
    
    List<player> findAll();
    // TODO - add method signatures as needed
	Team findByTeam(Team team);
}