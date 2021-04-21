package Proceso;

public class Hilo1 extends Thread{

	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("Hilo 1");
		}
	}

}

