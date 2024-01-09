public class Cardemo{
	public static void main(String[] args){
		Car testCar = new Car("mercedes","glc",2020,4.1);
		Car testCar2 = new Car("honda","glc",2022,4);
		System.out.println(testCar.compareSpeed(testCar2));
	}
}