public class Car extends Vehicle{
	private int doors;
	private int pass;
	
	public Car(String aMake, String aModel, String aPlate, int theDoors, int thePass){
		super(aMake, aModel, aPlate);
		this.doors = theDoors;
		this.pass = thePass;
	}
	public int getDoors(){
		return this.doors;
	}
	public int getPass(){
		return this.pass;
	}	
	public String tostring(){
		String result = String.format("%d-door %s %s with license %s", this.doors, super.getMake(), super.getModel(),super.getPlate());
		return result;
	}
	@Override
	public boolean equals(Object obj){
		if(!(obj instanceof Car)) {
			return false;
		}
		Car otherCar = (Car) obj;
		
		if (super.equals(obj) && this.doors == otherCar.getDoors() && this.pass == otherCar.getPass())
			return true;
		return false;
	}
	public Car copy(){
		Car other = new Car(super.getMake(),super.getModel(),super.getPlate(),this.doors,this.pass);
		return other;
	}
}