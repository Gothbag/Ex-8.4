/*
 * created by Gothbag <josemariacagigalso@gmail.com>
 * this represents a few lists of cars.
 * 
 */

import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class FifoLifoAutos {
	
	public static void printCars(LinkedList<Car> pCars) {
		for (Car c : pCars) {
			c.setFiscalHorsepower(0);
			System.out.println(c.getMake() + " " + c.getModel() + " " + c.getEngineDisplacement() + " " + c.getNCylinders());
			
		}
		
	}

	public static void main(String[] args) {
		//declarations
		LinkedList<Car> cars = new LinkedList<Car>();
		//we add the cars
		cars.offer(new Car("Alfa Romeo", "Giulia", 2900, 6));
		cars.offer(new Car("Dacia", "Sandero", 1200, 4));
		cars.offer(new Car("Ford", "Focus", 2000, 4));
		cars.offer(new Car("Opel", "Insignia", 2200, 4));
		Car hyundi = new Car("Hyundai", "Atos", 1500, 3);
		cars.addFirst(hyundi);
		Car focci = new Car("Ford", "Focus", 2000, 4);
		//the Ford Focus is appended to the list
		cars.addLast(focci);
		LinkedList<Car> lifoAutos = new LinkedList<Car>(cars);
		LinkedList<Car> fifoAutos = new LinkedList<Car>(cars);
		Car pandi = new Car("Fiat", "Panda", 900, 2);
		cars.offer(pandi);
		lifoAutos.offer(pandi);
		fifoAutos.offer(pandi);
		//now we go over the array to print out the details of each car in it.
		System.out.println("A list");
		printCars(cars);
		System.out.println("Another list");
		printCars(lifoAutos);
		System.out.println("And yet another list");
		printCars(fifoAutos);
		PriorityQueue<Car> priorCars = null;
	}

}
