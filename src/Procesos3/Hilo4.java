
package Procesos3;

public class Hilo4 extends Thread{
	@Override
	public void run() {
		
	
	for(int i=0; i<=5; i++) {
		System.out.println(i +": A");
		try {
			Hilo4.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	}
}
