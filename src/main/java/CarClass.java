
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luna
 */
public class CarClass {
	int yearModel;
	String make;
	int speed;
	
	public CarClass() {
	}
	
	

	public CarClass(int yearModel, String make) {
		super();
		this.yearModel = yearModel;
		this.make = make;
		this.speed=0;
	}
	
	public void accelerate(){
		this.speed=this.speed+5;
		System.out.println("the current speed of the car: "+this.speed);
	}
	
	public void brake()
	{
		this.speed=this.speed-5;
		System.out.println("the current speed of the car: "+this.speed);
		
	}	
	
	public int getYearModel() {
		return yearModel;
	}

	public void setYearModel(int yearModel) {
		this.yearModel = yearModel;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Year: ");
		int yearModel=sc.nextInt();
		System.out.println("Model: ");
		String make=sc.next();
		
		CarClass car=new CarClass(yearModel,make);
		System.out.println("Year: "+car.getYearModel());
		System.out.println("Model: "+car.getMake());
		System.out.println("the current speed of the car:"+car.getSpeed());
		System.out .println("Speed up: ");
		for(int i=0;i<5;i++){
			car.accelerate();
		}
		System.out .println("Slow down: ");
		for(int i=0;i<5;i++){
			car.brake();
		}
	}

}

