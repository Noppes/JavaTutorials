
public class Animal {
	public String type = "None";
	public String name = "John Doe";
	public double weight = 0;

	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setType(String type){
		this.type = type;
	}
	
	public String getType(){
		return type;
	}
	
	public void setWeight(double weight){
		this.weight = weight;
	}
	
	public double getWeight(){
		return weight;
	}
	
	@Override
	public String toString(){
		return "Animal type: " + getType() + " name: " + getName() + " weight: " + getWeight();
	}
}
