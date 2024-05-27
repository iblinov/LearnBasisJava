package by.bsu.java8.functional.interfaces;

public class Entity{
	private int id;
	private String name;
	
	public Entity() {
		
	}
	public Entity(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Entity [id=" + id + ", name=" + name + "]";
	}
	
}