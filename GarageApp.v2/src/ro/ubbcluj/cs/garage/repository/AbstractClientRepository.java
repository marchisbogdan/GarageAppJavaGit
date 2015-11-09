package ro.ubbcluj.cs.garage.repository;

import java.util.ArrayList;
import java.util.List;

import utilities.Repository;

public abstract class AbstractClientRepository<E> implements Repository<E> {

	//Attributes
	protected int size;
	protected List<E> elementsList = new ArrayList<>();
	
	//Methods
	@Override
	public void add(E obj){
		elementsList.add(obj);
	}
	
	public E searchElement(E element){
		
		return null;
		
	}
		
	@Override
	public void delete(E obj){
		for(E element:elementsList)
			if(element.equals(obj))
				elementsList.remove(element);
	}
	
	@Override
	public abstract void update(E obj);
	
	@Override
	public ArrayList<E> returnAll(){
		return (ArrayList<E>) elementsList;
	}
	
	public abstract ArrayList<E> readFromFile(String filename);
	
	public abstract void writeToFile(String filename);
	
	public void printElements(List<E> elements){
		elements.forEach(e -> System.out.println(e));
	}
	
}
