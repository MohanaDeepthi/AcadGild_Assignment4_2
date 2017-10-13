package assignment4_2;//package name
import java.util.Scanner;

class Car {  //car class
   //instance variables
    private String color;  
    private int maxSpeed;  
    
    public void carDetails(){  //method
        System.out.println("Car Color= "+color + " Max Speed= " + maxSpeed);  
    }  
    public void setColor(String color) {  //setter methods
        this.color = color;  
    }  
    public void setMaxSpeed(int maxSpeed) {  
        this.maxSpeed = maxSpeed;  
    }  
}  

class Engine {  //engine class
	//start and stop methods
    public void start(){  
        System.out.println("Compostion method :Engine Started");  
    }  
    public void stop(){  
        System.out.println("Compostion method :Engine Stopped");  
    }  
} 

class BMW extends Car{  //BMW child class extending Car class inheritance BMW is a car
    
    public void BMWStart(){  
        Engine bmwEngine = new Engine();  //instantiating Engine object
        bmwEngine.start(); //has a relation Car has engine 
        }  
    }

public class Assignment4_2 {
	
	public static void main(String args[]){
		
		BMW bCar = new BMW();//instantiate BMW object
		Scanner inpVar = new Scanner(System.in);//instantiate Scanner object
		System.out.println("Enter speed and color:");
		bCar.setMaxSpeed(inpVar.nextInt());
		bCar.setColor(inpVar.next());
		bCar.carDetails();
		bCar.BMWStart();
		inpVar.close();//close scanner
	}
	

}
