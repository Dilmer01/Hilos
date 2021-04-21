package Procesos3;

public class Hilo1 extends Thread{
	@Override
	public void run() {
		
	
	for(int i=0; i<=5; i++) {
		System.out.println(i +": H");
		try {
			Hilo1.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	}
}

