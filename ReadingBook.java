package Runnable;

public class ReadingBook {
	
	public static void main(String args[]) {
		Runnable r = () -> {System.out.println("In Runnable Interface");for(int i=1;i<=5;i++) {
			System.out.println("Read Book : "+i);};};
		Thread t1 = new Thread(r);
		t1.start();
	}

}
