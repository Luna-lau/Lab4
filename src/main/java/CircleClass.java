
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
public class CircleClass {
	double radius;
	final double PI=3.14159;
	
	public CircleClass() {
		radius=0.0;
	}
	
	public CircleClass(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double area()
	{
		return PI*this.radius*this.radius;
	}
	
	public double diameter()
	{
		return this.radius*2;
	}
	
	public double circumference(){
		return 2*PI*this.radius;
	}

	public static void main(String[] args) {
		
		System.out.println("Enter the radius of the circle: ");
		Scanner sc=new Scanner(System.in);
		double radius=sc.nextDouble();
		CircleClass circle=new CircleClass(radius);
		System.out.println("The circle's area: "+circle.area());
		System.out.println("The circle's diameter: "+circle.diameter());
		System.out.println("The circle's circumference: "+circle.circumference());
	
	}

}

