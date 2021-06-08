package Array7;

import java.util.Arrays;

public class Movie {
	
	String name;
	int id;
	Actor [] a_list;
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movie(String name, int id, Actor[] a_list) {
		super();
		this.name = name;
		this.id = id;
		this.a_list = a_list;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Actor[] getA_list() {
		return a_list;
	}
	public void setA_list(Actor[] a_list) {
		this.a_list = a_list;
	}
	@Override
	public String toString() {
		return "Movie [name=" + name + ", id=" + id + ", a_list=" + Arrays.toString(a_list) + "]";
	}
	
	
	

}
