package day_7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
	int id;
	String name;
	double price;
	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}

public class Flatmap {

	public Flatmap() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		List<Product> p1=new ArrayList<Product>();
		List<Product> p2=new ArrayList<Product>();
		List<Product> p3=new ArrayList<Product>();
		p1.add(new Product(101,"HP Laptop",25000));
		p1.add(new Product(102,"Samsung Laptop",25000));
		p1.add(new Product(103,"Lenovo Laptop",25000));
		p2.add(new Product(201,"Samsung Headphone",2500));
		p2.add(new Product(202,"Boat Headphone",2500));
		p2.add(new Product(203,"Lenovo Headphone",2500));
		p3.add(new Product(301,"Samsung Phone",40500));
		p3.add(new Product(302,"Iphone",85000));
		p3.add(new Product(303,"Moto Phone",25000));
		List<List<Product>> p=new ArrayList<List<Product>>();
		p.add(p1);
		p.add(p2);
		p.add(p3);
//		p.stream().flatMap(n->n.stream()).map(t->{System.out.println(t.getName());return t;}).collect(Collectors.toList());
		p.stream().flatMap(n->n.stream()).map(t->t.getName()).forEach(s->System.out.println(s));
		
	}
}
