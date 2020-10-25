package com.skilldistillery.enginecrud.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.jpacrud.entities.Engine;

@Transactional
@Service

public class EngineDAOJpaImpl implements EngineDAO {

	@PersistenceContext
	private EntityManager em;

	@Override
	public Engine findById(int id) {
		// TODO Auto-generated method stub
		return em.find(Engine.class, id);
	}

	@Override
	public List<Engine> findAll() {
String jpql = "SELECT e FROM Engine e";
		return em.createQuery(jpql, Engine.class).getResultList();
	}

	@Override
	public Engine create(Engine engine) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Engine update(int engineId, Engine engine) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(int engineId) {
		// TODO Auto-generated method stub
		return false;
	}	
}
