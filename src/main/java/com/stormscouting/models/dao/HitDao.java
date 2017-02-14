package com.stormscouting.models.dao;

import java.util.List;

import javax.transaction.Transactional;

import com.stormscouting.models.Hit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.stormscouting.models.Hit;

@Transactional
@Repository
public interface HitDao extends CrudRepository<Hit, Integer> {
    
    List<Hit> findByOwner(int ownerId);
    List<Hit> findAll();
    // TODO - add method signatures as needed
	Hit findByAuthor_Uid(int id);
	Hit findByUid(int uid);
}
