
public class Cat extends Animal{
	private boolean clipped = false;
	
	@Override
	public String getType(){
		return "Cat";
	}
	
	public void setClipped(boolean clipped){
		this.clipped = clipped;
	}
	
	public boolean isClipped(){
		return clipped;
	}
	
	@Override
	public void print(){
		System.out.println("clipped: " + clipped);
		super.print();
	}
}
