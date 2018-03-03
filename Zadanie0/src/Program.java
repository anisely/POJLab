

public class Program {
	
	
	public static void main(String[] args){
		Car car = new Car("BMW", true, 0, 999999.99);
		
		System.out.println("Zmiana przebiegu");
		
		car.setMilleage(100);
		
		System.out.println("Nowy przebieg");
		
		car.printCar();
	}

}
