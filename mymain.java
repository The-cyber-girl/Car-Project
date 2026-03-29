package car_problem;

public class mymain {

	public static void main(String[] args) {

		System.out.println("Details for car 1:");
		Car car1 = new Car("BMW","x5", 2020, "black"); 
	
		car1.showInfo();
		car1.age();
		System.out.println();
		System.out.println("Details for car 2:");
		Car car2 = new Car("Kia","picanto", 2018, "black"); 
		car2.showInfo();
		car2.age();
		System.out.println();

		System.out.println("Details for car 3:");
		Car car3 = new Car("toyota","corolla", 2025, "whie"); 
		car3.showInfo();
		car3.age();
		
		
	}
	

}
