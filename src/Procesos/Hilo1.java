package Procesos;



public class Hilo1 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i <5 ; i++) {
			System.out.println(i+"Hilo1 "+ getName());
			try {
				Hilo1.sleep(100);
			} catch (InterruptedException e ) {
				System.out.println(e);
				// TODO: handle exception
			}
			
		}
	}

}
