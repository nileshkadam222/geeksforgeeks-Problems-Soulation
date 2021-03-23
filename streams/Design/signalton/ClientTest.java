package testing.streams.Design.signalton;

public class ClientTest {

	public static void main(String[] args) {
		Singleton s = Singleton.getInstance();
		Singleton s1 = Singleton.getInstance();
		System.out.println("S :" +s.hashCode());
		System.out.println("S1 :" +s1.hashCode());
		
		Singleton2 s2 = Singleton2.getInstance();
		Singleton2 s3 = Singleton2.getInstance();
		System.out.println("S2 :" +s2.hashCode());
		System.out.println("S3 :" +s3.hashCode());

		
		Singleton3 s4 = Singleton3.getInstance();
		Singleton3 s5 = Singleton3.getInstance();
		System.out.println("S4 :" +s4.hashCode());
		System.out.println("S5 :" +s5.hashCode());
		
		System.out.println("Using Synchronized Method :");
		for(int i=0;i<20;i++) {
			MySingletoneThread t = new MySingletoneThread();
			t.start();
		}
		
		System.out.println("---------------------------------");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("Using Synchronized block :");
		for(int i=0;i<200;i++) {
			MySingletoneThread t = new MySingletoneThread();
			t.start();
		}
		
		System.out.println("---------------------------------");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("Using Bill Pugh  :");
		for(int i=0;i<200;i++) {
			MySingletoneThread2 t = new MySingletoneThread2();
			t.start();
		}
	}

}
