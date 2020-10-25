package com.skilldistillery.enginecrud.data;

import java.util.List;

import com.skilldistillery.jpacrud.entities.Engine;


public interface EngineDAO {
Engine findById(int id);
	List<Engine> findAll();
	Engine create(Engine engine);
	Engine update(int engineId, Engine engine);
	boolean delete(int engineId);
	
}
