import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println("Current count11:" + counter.getCount2213());
		
		counter.increment();
		
		System.out.println("Current count22:" + counter.getCount2121());
		
		counter.decrement();
		
		System.out.println("Current count33:" + counter.getCount112());
		
	}

}
