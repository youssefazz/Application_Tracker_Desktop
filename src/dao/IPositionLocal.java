package dao;

import java.util.List;

import javax.ejb.Local;

import entity.Position;

@Local
public interface IPositionLocal {
	
	void create(Position position);
	
	List<Position>findAll();
	
	void deleteById(long id);
	
	void update(Position position);
	
	Position findById(long id);
}
