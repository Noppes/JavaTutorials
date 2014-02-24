
public abstract class Animal {
	public String name = "John Doe";
	public double weight = 0;
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public abstract String getType();
	
	public void setWeight(double weight){
		this.weight = weight;
	}
	
	public double getWeight(){
		return weight;
	}
	
	public void print(){
		System.out.println("---"); //empty line to make things more readable
		System.out.println("Animal type: " + getType());
		System.out.println("name: " + name);
		System.out.println("weight: " + weight);
	}
}
