package car_problem;

public class Car {
	
	String brand;
	String model;
	int year;
	String color;
	
	
	Car(String brand,String model,int year,String color) {
		this.brand=brand;
		this.model = model;
		this.year =year;
		this.color = color;
	}
	
	void showInfo() {
		System.out.println("the brand of the car is:"+brand);
		System.out.println("the model of the car is:"+model);
		System.out.println("the year of the car is:"+year);
		System.out.println("the color of the car is:"+color);
	}
	void age() {
		int age = 2026- year;
	System.out.println("The age of the car is " +age);
	
	}
	
	

}
