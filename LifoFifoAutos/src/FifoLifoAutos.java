/*
 * created by Gothbag <josemariacagigalso@gmail.com>
 * this represents a few lists of cars.
 * 
 */

import java.util.LinkedList;
import java.util.PriorityQueue;

public class FifoLifoAutos {
	
	public static void printRemoveCars(LinkedList<Car> pCars) {
		for (Car c : pCars) {
			c.setFiscalHorsepower(0);
			System.out.println(c.getMake() + " " + c.getModel() + " " + c.getEngineDisplacement() + " " + c.getNCylinders());
			pCars.remove(c);
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
		
		//1
		LinkedList<Car> lifoAutos = new LinkedList<Car>(cars);
		LinkedList<Car> fifoAutos = new LinkedList<Car>(cars);
		
		//3
		Car pandi = new Car("Fiat", "Panda", 900, 2);
		cars.offer(pandi);
		lifoAutos.offer(pandi);
		fifoAutos.offer(pandi);
		//2
		PriorityQueue<Car> priorCars = new PriorityQueue<>(cars);
		
		//4
		//now we loop over the first three lists and remove every car from each as we print out the details of them all
		printRemoveCars(lifoAutos);
		printRemoveCars(fifoAutos);
		printRemoveCars(cars);
		//5
		//An example in real life of a LinkedList would be a group of people standing in an unorderly fashion waiting to be
		//served at a shop. a person standing in any given spot might be served earlier than if people were standing in a
		//line but it's harder to determine for the clerk who's first and who's last
		//A real-life example of a PriorityQueue is a regular, orderly queue at a shop
	}

}
