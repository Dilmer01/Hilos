package Procesos3;

public class Hilo2 extends Thread{
	@Override
	public void run() {
		
	
	for(int i=0; i<=5; i++) {
		System.out.println(i +": O");
		try {
			Hilo2.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	}
}

