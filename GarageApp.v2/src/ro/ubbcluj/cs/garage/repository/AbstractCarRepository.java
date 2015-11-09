package ro.ubbcluj.cs.garage.repository;

import java.util.ArrayList;
import java.util.List;

import utilities.Repository;

public abstract class AbstractCarRepository<E> implements Repository<E> {

	protected int size;
	protected List<E> elemtsList = new ArrayList<>();
	
	@Override
	public void add(E obj){
		elemtsList.add(obj);
	}
		
	@Override
	public void delete(E obj){
		for(E element:elemtsList)
			if(element.equals(obj))
				elemtsList.remove(element);
	}
	
	@Override
	public abstract void update(E obj);
	
	@Override
	public ArrayList<E> returnAll(){
		return (ArrayList<E>) elemtsList;
	}
	
	public abstract ArrayList<E> readFromFile(String filename);
	
	public abstract void writeToFile(String filename);
	
	public void printElements(List<E> elements){
		elements.forEach(c -> System.out.println(c));
	}
	

	
}
