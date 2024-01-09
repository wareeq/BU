public class Car{
	private String type;
	private String model;
	private int year;
	private double speed;

	public Car(String type, String model, int year,double speed){
		this.type = type;
		this.model = model;
		this.year = year;
		this.speed = speed;
	}

	public Car(){
		this.type = "";
		this.model = "";
		this.year = 0;
		this.speed = 0.0;
	}

	public String toString(){
		return "Type: "+ this.type + "\nModel: "+this.model+"\nYear: "+this.year+"\nSpeed: "+this.speed;
	}

	public void increaseSpeed(double speed){
		this.speed += speed;
	}

	public String compareSpeed(Car o){
		if(this.speed > o.speed){
			return this.speed+ " is higher than " + o.speed; 
		}else{
			return o.speed +" is higher than " + this.speed;
		}
	}
	public boolean equals(Object obj){
		Car o = (Car) obj;
		return this.model.equals(o.model) && this.type.equals(o.type) && this.speed == o.speed && this.year == o.year;
	}

}