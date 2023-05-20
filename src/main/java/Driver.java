import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		counter.increment(5);
		
		System.out.println("Hasil:" + counter.getCount());
		
		System.out.println("Hasil:" + counter.getCount());
		counter.decrement(2);
		System.out.println("Hasil:" + counter.getCount());
		
		
		
		System.out.println("Hasil:" + counter.getCount());		
	}

}
