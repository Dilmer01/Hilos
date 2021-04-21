
package Procesos3;

public class Hilo3 extends Thread{
	@Override
	public void run() {
		
	
	for(int i=0; i<=5; i++) {
		System.out.println(i +": L");
		try {
			Hilo3.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	}
}
